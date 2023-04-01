package org.ISF;


import com.google.gson.*;
import org.ISF.repository.Order;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class OspApp {
    public static void main(String[] args) throws FileNotFoundException {
        Duration pickingTime;
        LocalTime completeBy;

        JsonParser parser = new JsonParser();
        FileReader reader = new FileReader("/home/jakub/Desktop/Backup/ISF-Picking-Scheduler/Zadanie_rekrutacyjne/src/main/java/org/ISF/database/orders.json");
        Object obj = parser.parse(reader);
        JsonArray jsonArrayOrder = (JsonArray) obj;
        for ( int i=1; i<2; i++){
            JsonObject jsonObject = (JsonObject) jsonArrayOrder.get(i);
            String order = String.valueOf(jsonObject.get("orderId"));
            String strCompleteBy= String.valueOf(jsonObject.get("completeBy")).substring(1,6);

            completeBy = LocalTime.parse(strCompleteBy);
            System.out.println(completeBy);

        }
    }
}
