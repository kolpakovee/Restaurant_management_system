package kolpakovee_Addmee11;

import com.fasterxml.jackson.databind.ObjectMapper;
import kolpakovee_Addmee11.model.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        File menu_file = new File("src/main/resources/menu_dishes.txt");
        File dishCards_file = new File("src/main/resources/dish_cards.txt");
        File productTypes_file = new File ("src/main/resources/product_types.txt");
        File products_file = new File ("src/main/resources/products.txt");
        File equipmentType_file = new File ("src/main/resources/equipment_type.txt");
        File equipment_file = new File("src/main/resources/equipment.txt");
        File operation_file = new File("src/main/resources/operation_types.txt");
        File cookers_file = new File("src/main/resources/cookers.txt");
        File visitors_file = new File("src/main/resources/visitors_orders.txt");

        Menu menu = objectMapper.readValue(menu_file, Menu.class);
        DishCards dishCards = objectMapper.readValue(dishCards_file, DishCards.class);
        ProductTypes productTypes = objectMapper.readValue(productTypes_file, ProductTypes.class);
        Products products = objectMapper.readValue(products_file, Products.class);
        EquipmentTypes equipmentTypes = objectMapper.readValue(equipmentType_file, EquipmentTypes.class);
        Equipments equipments = objectMapper.readValue(equipment_file, Equipments.class);
        OperationTypes types = objectMapper.readValue(operation_file, OperationTypes.class);
        Cooks cooks = objectMapper.readValue(cookers_file, Cooks.class);
        Visitors visitors = objectMapper.readValue(visitors_file, Visitors.class);

        String menu_json = objectMapper.writeValueAsString(menu);
        String dishCards_json = objectMapper.writeValueAsString(dishCards);
        String productTypes_json = objectMapper.writeValueAsString(productTypes);
        String products_json = objectMapper.writeValueAsString(products);
        String equipmentType_json = objectMapper.writeValueAsString(equipmentTypes);
        String equipment_json = objectMapper.writeValueAsString(equipments);
        String operation_json = objectMapper.writeValueAsString(types);
        String cooks_json = objectMapper.writeValueAsString(cooks);
        String visitors_json = objectMapper.writeValueAsString(visitors);

        System.out.println(menu_json + "\n");
        System.out.println(dishCards_json + "\n");
        System.out.println(productTypes_json + "\n");
        System.out.println(products_json + "\n");
        System.out.println(equipmentType_json + "\n");
        System.out.println(equipment_json + "\n");
        System.out.println(operation_json + "\n");
        System.out.println(cooks_json + "\n");
        System.out.println(visitors_json + "\n");
    }
}