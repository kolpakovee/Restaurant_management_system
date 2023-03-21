package kolpakovee_Addmee11.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public record OperationTypes(
        @JsonProperty("operation_types")
        List<OperationType> types
) implements Serializable {
}
