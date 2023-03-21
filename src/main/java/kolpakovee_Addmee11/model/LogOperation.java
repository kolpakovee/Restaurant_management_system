package kolpakovee_Addmee11.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public record LogOperation(
        @JsonProperty("oper_id")
        int id,
        @JsonProperty("oper_proc")
        int process,
        @JsonProperty("oper_card")
        int cardId,
        @JsonProperty("oper_started")
        String startingTime,
        @JsonProperty("oper_ended")
        String endingTime,
        @JsonProperty("oper_coocker_id")
        int cookerId,
        @JsonProperty("oper_active")
        boolean isActive
) implements Serializable {
}
