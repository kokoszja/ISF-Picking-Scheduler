package org.ISF.service;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;

//public class databaseService {
//    private static final Path pathOrdersFile = Path.of("src/main/java/org/ISF/database", "orders.json");
//    private static final Path pathStoreFile = Path.of("src/main/java/org/ISF/database", "store.json");
//    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
//
//    private <T> T readDataFromJsonFile(Class<T> dataType, Path path) {
//        try (Reader reader = new FileReader(path.toFile())) {
//            System.out.println("Zaczytuję plik: " + path);
//            return gson.fromJson(reader, dataType);
//        } catch (IOException e) {
//            System.out.println("Plik nieznaleziony lub uszkodzony: " + e.getMessage());
//            return null;
//        }
//    }
//    public
//}
