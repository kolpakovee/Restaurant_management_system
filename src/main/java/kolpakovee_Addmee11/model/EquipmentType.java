package kolpakovee_Addmee11.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public record EquipmentType(
        @JsonProperty("equip_type_id")
        int type,
        @JsonProperty("equip_type_name")
        String typeName
) implements Serializable
{}
