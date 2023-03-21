package kolpakovee_Addmee11.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public record Menu(
        @JsonProperty("menu_dishes")
        List<MenuItem> items
) implements Serializable {
}
