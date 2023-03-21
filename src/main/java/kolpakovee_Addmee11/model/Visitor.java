package kolpakovee_Addmee11.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public record Visitor(
        @JsonProperty("vis_name")
        String name,
        @JsonProperty("vis_ord_started")
        String startOrderingTime,
        @JsonProperty("vis_ord_ended")
        String endOrderingTime,
        @JsonProperty("vis_ord_total")
        int totalPrice,
        @JsonProperty("vis_ord_dishes")
        List<Dish> dishes
) implements Serializable {
}
