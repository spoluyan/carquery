package pw.spn.carquery.json;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

public class StringToFloatDeserializer extends JsonDeserializer<Float> {

    @Override
    public Float deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String value = jp.getCodec().readValue(jp, String.class);

        try {
            return Float.valueOf(value);
        } catch (NumberFormatException e) {
        }

        return null;
    }

}
