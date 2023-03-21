package kolpakovee_Addmee11.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public record MenuItem(
        @JsonProperty("menu_dish_id")
        int id,
        @JsonProperty("menu_dish_card")
        int card,
        @JsonProperty("menu_dish_price")
        int price,
        @JsonProperty("menu_dish_active")
        boolean isActive
) implements Serializable {
}
