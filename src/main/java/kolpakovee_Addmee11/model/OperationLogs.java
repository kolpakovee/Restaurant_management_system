package kolpakovee_Addmee11.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public record OperationLogs(
        @JsonProperty("operation_log")
        List<OperationLogs> operations
) implements Serializable {
}
