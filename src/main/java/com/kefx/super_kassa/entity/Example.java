package com.kefx.super_kassa.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name = "sk_example_table")
@NoArgsConstructor
@Data
public class Example {
    @Id
    Integer id;
    @JsonProperty("obj")
    String obj;

    public int addObj(int addedValue) {

        ObjectMapper objectMapper = new ObjectMapper();
        int valueAfterAdd;
        try {
            JsonNode rootNode = objectMapper.readTree(obj);
            JsonNode currentNode = rootNode.get("current");
            int currentValue = currentNode.asInt();
            valueAfterAdd = currentValue + addedValue;
            ((ObjectNode) rootNode).put("current", valueAfterAdd);
            obj = objectMapper.writeValueAsString(rootNode);
        }
        catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return valueAfterAdd;
    }
}
