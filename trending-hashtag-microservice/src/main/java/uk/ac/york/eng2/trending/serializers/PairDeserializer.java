package uk.ac.york.eng2.trending.serializers;

import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

import javafx.util.Pair;

public class PairDeserializer implements Deserializer<Pair<Long, Long>> {
	
	private final ObjectMapper objectMapper = new ObjectMapper();
	
	@Override
	public Pair<Long, Long> deserialize(String topic, byte[] data) {
		try {
            return objectMapper.readValue(new String(data, "UTF-8"), byte[] data);
        } catch (Exception e) {
            throw new SerializationException("Error when deserializing byte[] to MessageDto");
	}
	
}
