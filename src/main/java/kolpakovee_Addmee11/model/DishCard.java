package kolpakovee_Addmee11.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public record DishCard(
        @JsonProperty("card_id")
        int id,
        @JsonProperty("dish_name")
        String name,
        @JsonProperty("card_descr")
        String description,
        @JsonProperty("card_time")
        double time,
        @JsonProperty("equip_type")
        int equipmentType,
        @JsonProperty("operations")
        List<Operation> operations
) implements Serializable {
}
