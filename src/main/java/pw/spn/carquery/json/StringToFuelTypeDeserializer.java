package pw.spn.carquery.json;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

import pw.spn.carquery.model.FuelType;

public class StringToFuelTypeDeserializer extends JsonDeserializer<FuelType> {

    @Override
    public FuelType deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String value = jp.getCodec().readValue(jp, String.class);

        return FuelType.fromValue(value);
    }

}
