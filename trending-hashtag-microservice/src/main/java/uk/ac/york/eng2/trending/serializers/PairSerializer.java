package uk.ac.york.eng2.trending.serializers;

import org.apache.kafka.common.serialization.Serializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.micronaut.core.serialize.exceptions.SerializationException;
import javafx.util.Pair;

public class PairSerializer implements Serializer<Pair<Long, Long>> {
	
	private final ObjectMapper objectMapper = new ObjectMapper();    
	@Override
	public byte[] serialize(String topic, Pair<Long, Long> data) {
		if (data == null) return null;
		try {
			return objectMapper.writeValueAsBytes(data);
		} catch (JsonProcessingException e) {
			throw new SerializationException("Pair serialization error");
		}
	}	
}
