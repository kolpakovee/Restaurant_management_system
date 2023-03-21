package kolpakovee_Addmee11.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public record ProductType(
        @JsonProperty("prod_type_id")
        int id,
        @JsonProperty("prod_type_name")
        String name,
        @JsonProperty("prod_is_food")
        boolean isFood
) implements Serializable {
}
