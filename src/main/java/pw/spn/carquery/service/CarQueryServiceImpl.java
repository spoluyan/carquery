package pw.spn.carquery.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
import pw.spn.carquery.model.MinMaxInterval;
import pw.spn.carquery.model.Model;
import pw.spn.carquery.model.ModelDetails;
import pw.spn.carquery.model.SearchRequest;

public class CarQueryServiceImpl implements CarQueryService {
    private static final Log LOG = LogFactory.getLog(CarQueryServiceImpl.class);

    private static final String API_URL = "http://www.carqueryapi.com/api/0.3/?callback=?&cmd=";

    private static final String COMMAND_GET_YEARS = "getYears";
    private static final String COMMAND_GET_MAKES = "getMakes";
    private static final String COMMAND_GET_MODELS = "getModels";
    private static final String COMMAND_GET_MODEL_DETAILS = "getModel";
    private static final String COMMAND_SEARCH = "getTrims";

    private static final String JSON_MIN_YEAR = "min_year";
    private static final String JSON_MAX_YEAR = "max_year";
    private static final String JSON_ERROR = "\"error\"";

    private static final String PARAM_YEAR = "&year=";
    private static final String PARAM_SOLID_IN_US = "&sold_in_us=1";
    private static final String PARAM_MAKE = "&make=";
    private static final String PARAM_BODY = "&body=";
    private static final String PARAM_MODEL = "&model=";
    private static final String PARAM_DOORS = "&doors=";
    private static final String PARAM_DRIVE = "&drive=";
    private static final String PARAM_ENGINE_POSITION = "&engine_position=";
    private static final String PARAM_ENGINE_TYPE = "&engine_type=";
    private static final String PARAM_FUEL_TYPE = "&fuel_type=";
    private static final String PARAM_FULL_RESULTS_FALSE = "&full_results=0";
    private static final String PARAM_KEYWORD = "&keyword=";
    private static final String PARAM_MIN_CYLINDERS = "&min_cylinders=";
    private static final String PARAM_MAX_CYLINDERS = "&max_cylinders=";
    private static final String PARAM_MIN_LKM = "&min_lkm_hwy=";
    private static final String PARAM_MAX_LKM = "&max_lkm_hwy=";
    private static final String PARAM_MIN_POWER = "&min_power=";
    private static final String PARAM_MAX_POWER = "&max_power=";
    private static final String PARAM_MIN_TOP_SPEED = "&min_top_speed=";
    private static final String PARAM_MAX_TOP_SPEED = "&max_top_speed=";
    private static final String PARAM_MIN_TORQUE = "&min_torque=";
    private static final String PARAM_MAX_TORQUE = "&max_torque=";
    private static final String PARAM_MIN_WEIGHT = "&min_weight=";
    private static final String PARAM_MAX_WEIGHT = "&max_weight=";
    private static final String PARAM_MIN_YEAR = "&min_year=";
    private static final String PARAM_MAX_YEAR = "&max_year=";
    private static final String PARAM_SEATS = "&seats=";

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
        if (request.getMake() == null) {
            LOG.error("Make was not specified");
            return Collections.emptyList();
        }
        StringBuilder url = new StringBuilder(API_URL).append(COMMAND_GET_MODELS).append(PARAM_MAKE)
                .append(request.getMake().getId());
        if (request.getYear() != null) {
            url.append(PARAM_YEAR).append(request.getYear());
        }
        if (request.isSolidInUS()) {
            url.append(PARAM_SOLID_IN_US);
        }
        if (request.getBodyType() != null) {
            url.append(PARAM_BODY).append(request.getBodyType().getValue());
        }

        JsonNode json = makeRequest(url.toString());

        if (json == null) {
            return Collections.emptyList();
        }

        return parseJSON(json, new TypeReference<List<Model>>() {
        });
    }

    @Override
    public ModelDetails getModelDetails(String modelId) {
        if (modelId == null) {
            return null;
        }
        String url = new StringBuilder(API_URL).append(COMMAND_GET_MODEL_DETAILS).append(PARAM_MODEL).append(modelId)
                .toString();
        JsonNode json = makeRequest(url);

        if (json == null) {
            return null;
        }

        return parseJSON(json, new TypeReference<ModelDetails>() {
        });
    }

    @Override
    public List<ModelDetails> search(SearchRequest request) {
        StringBuilder url = new StringBuilder(API_URL).append(COMMAND_SEARCH);
        if (request.getBodyType() != null) {
            url.append(PARAM_BODY).append(request.getBodyType().getValue());
        }
        if (request.getDoors() != null) {
            url.append(PARAM_DOORS).append(request.getDoors());
        }
        if (request.getDriveType() != null) {
            url.append(PARAM_DRIVE).append(request.getDriveType().getValue());
        }
        if (request.getEnginePosition() != null) {
            url.append(PARAM_ENGINE_POSITION).append(request.getEnginePosition().getValue());
        }
        if (request.getEngineType() != null) {
            url.append(PARAM_ENGINE_TYPE).append(request.getEngineType().getValue());
        }
        if (request.getFuelType() != null) {
            url.append(PARAM_FUEL_TYPE).append(request.getFuelType().getValue());
        }
        if (!request.isFullResults()) {
            url.append(PARAM_FULL_RESULTS_FALSE);
        }
        if (request.getKeyword() != null) {
            url.append(PARAM_KEYWORD).append(request.getKeyword());
        }
        if (request.getMakeID() != null) {
            url.append(PARAM_MAKE).append(request.getMakeID());
        }
        if (request.getCylinders() != null) {
            MinMaxInterval cylinders = request.getCylinders();
            if (cylinders.getMin() != null) {
                url.append(PARAM_MIN_CYLINDERS).append(cylinders.getMin());
            }
            if (cylinders.getMax() != null) {
                url.append(PARAM_MAX_CYLINDERS).append(cylinders.getMax());
            }
        }
        if (request.getLitersPer100km() != null) {
            MinMaxInterval lkm = request.getLitersPer100km();
            if (lkm.getMin() != null) {
                url.append(PARAM_MIN_LKM).append(lkm.getMin());
            }
            if (lkm.getMax() != null) {
                url.append(PARAM_MAX_LKM).append(lkm.getMax());
            }
        }
        if (request.getPowerPS() != null) {
            MinMaxInterval power = request.getPowerPS();
            if (power.getMin() != null) {
                url.append(PARAM_MIN_POWER).append(power.getMin());
            }
            if (power.getMax() != null) {
                url.append(PARAM_MAX_POWER).append(power.getMax());
            }
        }
        if (request.getTopSpeedKmPerH() != null) {
            MinMaxInterval topSpeed = request.getTopSpeedKmPerH();
            if (topSpeed.getMin() != null) {
                url.append(PARAM_MIN_TOP_SPEED).append(topSpeed.getMin());
            }
            if (topSpeed.getMax() != null) {
                url.append(PARAM_MAX_TOP_SPEED).append(topSpeed.getMax());
            }
        }
        if (request.getTorqueNm() != null) {
            MinMaxInterval torque = request.getTorqueNm();
            if (torque.getMin() != null) {
                url.append(PARAM_MIN_TORQUE).append(torque.getMin());
            }
            if (torque.getMax() != null) {
                url.append(PARAM_MAX_TORQUE).append(torque.getMax());
            }
        }
        if (request.getWeightKg() != null) {
            MinMaxInterval weight = request.getWeightKg();
            if (weight.getMin() != null) {
                url.append(PARAM_MIN_WEIGHT).append(weight.getMin());
            }
            if (weight.getMax() != null) {
                url.append(PARAM_MAX_WEIGHT).append(weight.getMax());
            }
        }
        if (request.getYearInterval() != null) {
            MinMaxInterval year = request.getYearInterval();
            if (year.getMin() != null) {
                url.append(PARAM_MIN_YEAR).append(year.getMin());
            }
            if (year.getMax() != null) {
                url.append(PARAM_MAX_YEAR).append(year.getMax());
            }
        }
        if (request.getModelName() != null) {
            url.append(PARAM_MODEL).append(request.getModelName());
        }
        if (request.getNumberOfSeats() != null) {
            url.append(PARAM_SEATS).append(request.getNumberOfSeats());
        }
        if (request.isSolidInUS()) {
            url.append(PARAM_SOLID_IN_US);
        }
        if (request.getYear() != null) {
            url.append(PARAM_YEAR).append(request.getYear());
        }

        JsonNode json = makeRequest(url.toString());

        if (json == null) {
            return null;
        }

        return parseJSON(json, new TypeReference<List<ModelDetails>>() {
        });
    }

    private <T> T parseJSON(JsonNode node, TypeReference<T> ref) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(node, ref);
        } catch (IOException e) {
            LOG.error("Unable to parse JSON", e);
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
            LOG.error("Unable to make request", e);
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
            LOG.debug(json);
            return parseJSON(json);
        } catch (UnsupportedOperationException | IOException e) {
            LOG.error("Unable to parse response", e);
        } finally {
            IOUtils.closeQuietly(is);
        }
        return null;
    }

    private JsonNode parseJSON(String json) {
        if (json == null) {
            return null;
        }

        if (json.contains(JSON_ERROR)) {
            LOG.error(json);
            return null;
        }

        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = null;
        try {
            parser = mapper.getJsonFactory().createJsonParser(json);
            JsonNode object = mapper.readTree(parser);
            if (object.isArray()) {
                return object.get(0);
            }
            JsonNode result = object.get(object.getFieldNames().next());
            return result;
        } catch (IOException e) {
            LOG.error("Unable to parse response JSON", e);
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
