package kolpakovee_Addmee11.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public record Dish(
        @JsonProperty("ord_dish_id")
        int id,
        @JsonProperty("menu_dish")
        int dishMenuId
) implements Serializable {
}
