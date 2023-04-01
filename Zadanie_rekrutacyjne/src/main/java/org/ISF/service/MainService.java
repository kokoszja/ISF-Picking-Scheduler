package org.ISF.service;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainService {
    public void nieWiem() throws FileNotFoundException {
        JsonParser parser = new JsonParser();
        FileReader fileReader = new FileReader("/home/jakub/Desktop/Backup/ISF-Picking-Scheduler/Zadanie_rekrutacyjne/src/main/java/org/ISF/database/orders.json");
        JsonElement jsonElement = parser.parse(fileReader);
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        JsonArray jsonArray = jsonObject.get("").getAsJsonArray();
        System.out.println(jsonArray.get(0).getAsJsonObject().get("OrderID"));
    }
}
