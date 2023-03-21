package kolpakovee_Addmee11;

import com.fasterxml.jackson.databind.ObjectMapper;
import kolpakovee_Addmee11.model.OperationType;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
//        File file = new File("src/main/resources/operation_types.txt");
//
//        OperationType[] operation_types = objectMapper.readValue(file, OperationType[].class);
//
//        for (var el : operation_types){
//            System.out.printf("id: %s \t name: %s \n", el.id(), el.name());
//        }

        OperationType[] op = {new OperationType(1, "frying"), new OperationType(17, "pouring boiled water into a paper cup")};

        String json = objectMapper.writeValueAsString(op);

        System.out.println(json);
    }
}