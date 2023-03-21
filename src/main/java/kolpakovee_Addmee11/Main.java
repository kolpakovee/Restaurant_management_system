package kolpakovee_Addmee11;

import com.fasterxml.jackson.databind.ObjectMapper;
import kolpakovee_Addmee11.model.OperationType;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/main/resources/type.txt");

        OperationType op = objectMapper.readValue(file, OperationType.class);
        System.out.printf("id: %s \t name: %s \n", op.id(), op.name());

        String json = objectMapper.writeValueAsString(op);

        System.out.println(json);
    }
}