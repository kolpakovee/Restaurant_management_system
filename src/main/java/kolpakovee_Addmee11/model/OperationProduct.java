package kolpakovee_Addmee11.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public record OperationProduct(
        @JsonProperty("prod_type")
        int type,
        @JsonProperty("prod_quantity")
        int quantity
) implements Serializable {
}
