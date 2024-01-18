import java.io.FileWriter;
import java.io.IOException;

public class LoggingOfResults {

    public static void log(String answer){
        try (FileWriter fw = new FileWriter("logRes.txt", true)) {
            fw.write(answer);
        } catch (IOException e) {
            System.out.println("Ошибка записи");
        }
    }
}