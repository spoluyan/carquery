package pw.spn.carquery.json;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

public class StringToBooleanDeserializer extends JsonDeserializer<Boolean> {
    private static final String TRUE_VALUE = "1";

    @Override
    public Boolean deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String value = jp.getCodec().readValue(jp, String.class);
        return TRUE_VALUE.equals(value);
    }

}
