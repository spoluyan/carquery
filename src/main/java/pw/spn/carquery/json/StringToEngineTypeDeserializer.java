package pw.spn.carquery.json;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

import pw.spn.carquery.model.EngineType;

public class StringToEngineTypeDeserializer extends JsonDeserializer<EngineType> {

    @Override
    public EngineType deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException,
            JsonProcessingException {
        String value = jp.getCodec().readValue(jp, String.class);

        return EngineType.fromValue(value);
    }

}
