package pw.spn.carquery.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import pw.spn.carquery.model.GetMakesRequest;
import pw.spn.carquery.model.GetModelsRequest;
import pw.spn.carquery.model.Make;
import pw.spn.carquery.model.Model;
import pw.spn.carquery.model.ModelDetails;
import pw.spn.carquery.model.SearchRequest;

public class CarQueryServiceImpl implements CarQueryService {
    private static final String API_URL = "http://www.carqueryapi.com/api/0.3/?callback=?&cmd=";

    private static final String COMMAND_GET_YEARS = "getYears";
    private static final String COMMAND_GET_MAKES = "getMakes";
    private static final String COMMAND_GET_MODELS = "getModels";
    private static final String COMMAND_GET_MODEL_DETAILS = "getModel";
    private static final String COMMAND_SEARCH = "getTrims";

    private static final String JSON_MIN_YEAR = "min_year";
    private static final String JSON_MAX_YEAR = "max_year";

    private static final String PARAM_YEAR = "&year=";
    private static final String PARAM_SOLID_IN_US = "&sold_in_us=1";

    @Override
    public List<Integer> getYears() {
        JsonNode json = makeRequest(API_URL + COMMAND_GET_YEARS);

        if (json == null) {
            return Collections.emptyList();
        }

        int minYear = Integer.parseInt(json.get(JSON_MIN_YEAR).getTextValue());
        int maxYear = Integer.parseInt(json.get(JSON_MAX_YEAR).getTextValue());

        return IntStream.rangeClosed(minYear, maxYear).boxed().collect(Collectors.toList());
    }

    @Override
    public List<Make> getMakes(GetMakesRequest request) {
        StringBuilder url = new StringBuilder(API_URL).append(COMMAND_GET_MAKES);
        if (request.getYear() != null) {
            url.append(PARAM_YEAR).append(request.getYear());
        }
        if (request.isSolidInUS()) {
            url.append(PARAM_SOLID_IN_US);
        }
        JsonNode json = makeRequest(url.toString());

        if (json == null) {
            return Collections.emptyList();
        }

        return parseJSON(json, new TypeReference<List<Make>>() {
        });
    }

    @Override
    public List<Model> getModels(GetModelsRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ModelDetails getModelDetails(String modelId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ModelDetails> search(SearchRequest query) {
        // TODO Auto-generated method stub
        return null;
    }

    private <T> T parseJSON(JsonNode node, TypeReference<T> ref) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(node, ref);
        } catch (IOException e) {
            // TODO log
            e.printStackTrace();
        }
        return null;
    }

    private JsonNode makeRequest(String url) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(url);
        CloseableHttpResponse response = null;
        try {
            response = httpclient.execute(httpget);
            int status = response.getStatusLine().getStatusCode();
            if (status == HttpStatus.SC_OK) {
                return parseEntity(response.getEntity());
            }
        } catch (IOException e) {
            // TODO log
            e.printStackTrace();
        } finally {
            releaseConnection(response, httpclient);
        }
        return null;
    }

    private JsonNode parseEntity(HttpEntity entity) {
        InputStream is = null;
        try {
            is = entity.getContent();
            String json = IOUtils.toString(is).trim().substring(2);
            json = json.substring(0, json.length() - 2);
            System.out.println(json); // TODO log
            return parseJSON(json);
        } catch (UnsupportedOperationException | IOException e) {
            // TODO log
        } finally {
            IOUtils.closeQuietly(is);
        }
        return null;
    }

    private JsonNode parseJSON(String json) {
        if (json == null) {
            return null;
        }

        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = null;
        try {
            parser = mapper.getJsonFactory().createJsonParser(json);
            JsonNode object = mapper.readTree(parser);
            JsonNode result = object.get(object.getFieldNames().next());
            return result;
        } catch (IOException e) {
            // TODO log
            e.printStackTrace();
        } finally {
            try {
                parser.close();
            } catch (IOException e) {
            }
        }

        return null;
    }

    private void releaseConnection(CloseableHttpResponse response, CloseableHttpClient httpclient) {
        if (response != null) {
            try {
                response.close();
            } catch (IOException e) {
            }
        }
        try {
            httpclient.close();
        } catch (IOException e) {
        }
    }
}
