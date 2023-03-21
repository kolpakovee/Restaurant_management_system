package kolpakovee_Addmee11.model;

import java.io.Serializable;

public record Product(
        int id,
        int type,
        String name,
        String companyName,
        String unitType,
        double quantity,
        double cost,
        String timeDelivery,
        String timeUntilValid
) implements Serializable
{ }
