package ru.sapteh.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IOConfig {
    private static final String FILE_NAME = "data_holder.txt";

    public IOConfig() {
        Path newFilePath = Paths.get(FILE_NAME);
        try {
            Files.createFile(newFilePath);
            System.out.println("File created");
        } catch (IOException e) {
            System.out.println("File exist");
        }
    }

    public void writeToFile(String data) {
        List<String> dataFromFile = readFromFile();
        dataFromFile.add(data);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String s : dataFromFile) {
                writer.write(s + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> readFromFile() {
        ArrayList<String> objects = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            while (reader.ready()) {
                objects.add(reader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return objects;
    }
}
