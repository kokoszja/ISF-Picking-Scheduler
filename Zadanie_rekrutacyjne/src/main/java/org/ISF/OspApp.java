package org.ISF;


import com.google.gson.*;
import org.ISF.repository.Order;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class OspApp {
    public static void main(String[] args) throws FileNotFoundException {

        JsonParser parser = new JsonParser();
        FileReader reader = new FileReader("/home/jakub/Desktop/Backup/ISF-Picking-Scheduler/Zadanie_rekrutacyjne/src/main/java/org/ISF/database/orders.json");
        Object obj = parser.parse(reader);
        JsonArray jsonArrayOrder = (JsonArray) obj;
        System.out.println(jsonArrayOrder.size());
        System.out.println(jsonArrayOrder.get(2));
        for ( int i=1; i<2; i++){
            JsonObject jsonObject = (JsonObject) jsonArrayOrder.get(i);
            String order = String.valueOf(jsonObject.get("orderId"));
            System.out.println(jsonObject);
            System.out.println(order);
        }
/////////////////////////////////////
//        JsonParser parser = new JsonParser();
//        try {
//            FileReader reader = new FileReader("/home/jakub/Desktop/Backup/ISF-Picking-Scheduler/Zadanie_rekrutacyjne/src/main/java/org/ISF/database/orders.json");
//            Object obj = parser.parse(reader);
//            JsonArray orderList = (JsonArray) obj;
//            JsonArray orderList2 = new JsonArray();
//            orderList2.add(orderList.get(2));
//            System.out.println(orderList2);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    }
}
