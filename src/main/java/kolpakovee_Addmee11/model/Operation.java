package kolpakovee_Addmee11.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public record Operation(
        @JsonProperty("oper_type")
        int type,
        @JsonProperty("oper_time")
        double time,
        @JsonProperty("oper_async_point")
        int asyncPoint,
        @JsonProperty("oper_products")
        List<OperationProduct> operationTypes
) implements Serializable {
}
