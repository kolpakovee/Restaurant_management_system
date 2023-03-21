package kolpakovee_Addmee11.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public record Equipments(
        @JsonProperty("equipment")
        List<Equipment> equipments
) implements Serializable {
}
