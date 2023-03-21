package kolpakovee_Addmee11.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public record ProductTypes(
        @JsonProperty("product_types")
        List<ProductType> productTypes
) implements Serializable {
}
