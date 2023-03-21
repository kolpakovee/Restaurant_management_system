package kolpakovee_Addmee11.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public record Product(
        @JsonProperty("prod_item_id")
        int id,
        @JsonProperty("prod_item_type")
        int type,
        @JsonProperty("prod_item_name")
        String name,
        @JsonProperty("prod_item_company")
        String companyName,
        @JsonProperty("prod_item_unit")
        String unitType,
        @JsonProperty("prod_item_quantity")
        double quantity,
        @JsonProperty("prod_item_cost")
        double cost,
        @JsonProperty("prod_item_delivered")
        String timeDelivery,
        @JsonProperty("prod_item_valid_until")
        String timeUntilValid
) implements Serializable
{ }
