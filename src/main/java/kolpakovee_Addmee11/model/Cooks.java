package kolpakovee_Addmee11.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public record Cooks(
        @JsonProperty("cookers")
        List<Cook> cooks
) implements Serializable {
}
