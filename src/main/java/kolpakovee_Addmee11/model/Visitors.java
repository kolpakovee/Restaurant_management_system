package kolpakovee_Addmee11.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public record Visitors(
        @JsonProperty("visitors_orders")
        List<Visitor> visitors
) implements Serializable {
}
