package kolpakovee_Addmee11;

import com.fasterxml.jackson.databind.ObjectMapper;
import kolpakovee_Addmee11.model.Cooks;
import kolpakovee_Addmee11.model.DishCards;
import kolpakovee_Addmee11.model.Menu;
import kolpakovee_Addmee11.model.OperationTypes;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        File menu_file = new File("src/main/resources/menu_dishes.txt");
        File operation_file = new File("src/main/resources/operation_types.txt");
        File cookers_file = new File("src/main/resources/cookers.txt");
        File dishCards_file = new File("src/main/resources/dish_cards.txt");

        Menu menu = objectMapper.readValue(menu_file, Menu.class);
        OperationTypes types = objectMapper.readValue(operation_file, OperationTypes.class);
        Cooks cooks = objectMapper.readValue(cookers_file, Cooks.class);
        DishCards dishCards = objectMapper.readValue(dishCards_file, DishCards.class);

        String menu_json = objectMapper.writeValueAsString(menu);
        String operation_json = objectMapper.writeValueAsString(types);
        String cooks_json = objectMapper.writeValueAsString(cooks);
        String dishCards_json = objectMapper.writeValueAsString(dishCards);

        System.out.println(menu_json + "\n");
        System.out.println(operation_json + "\n");
        System.out.println(cooks_json + "\n");
        System.out.println(dishCards_json + "\n");
    }
}