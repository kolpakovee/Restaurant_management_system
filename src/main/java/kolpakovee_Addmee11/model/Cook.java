package kolpakovee_Addmee11.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public record Cook(
        @JsonProperty("cook_id")
        int id,
        @JsonProperty("cook_name")
        String name,
        @JsonProperty("cook_active")
        Boolean isActive
) implements Serializable {
};
