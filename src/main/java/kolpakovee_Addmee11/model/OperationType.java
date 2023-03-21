package kolpakovee_Addmee11.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public record OperationType(
        @JsonProperty("oper_type_id")
        int id,
        @JsonProperty("oper_type_name")
        String name
) implements Serializable {
};




