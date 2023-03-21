package kolpakovee_Addmee11.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

public record Equipment (
        @JsonProperty("equip_type")
        String type,
        @JsonProperty("equip_name")
        String name,
        @JsonProperty("equip_active")
        Boolean isActive
) implements Serializable
{ }
