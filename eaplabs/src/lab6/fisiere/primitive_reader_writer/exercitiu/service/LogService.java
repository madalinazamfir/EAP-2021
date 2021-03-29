package lab6.fisiere.primitive_reader_writer.exercitiu.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogService {

    private final String LOG_FILE_PATH = System.getProperty("user.dir")+ "\\eaplabs\\src\\lab6\\fisiere\\resources\\user_service_log.txt";

    public void write(String messageLog){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE_PATH, true))){
            writer.write(messageLog);
            writer.write("\n");
        } catch (IOException e) {
            System.out.println("Nu s-a putut loga mesajul");
        }

    }
}
