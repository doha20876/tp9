package tp9;

import java.io.FileWriter;
import java.io.IOException;

public class LoggerUtil {
    public static void logError(String message, Exception e) {
        try (FileWriter writer = new FileWriter("error.log", true)) {
            writer.write(message + " : " + e.getMessage() + "\n");
        } catch (IOException ex) {
            System.err.println("Erreur lors de l'écriture du log : " + ex.getMessage());
        }
    }
}
