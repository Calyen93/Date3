import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {

        String dataString = "2023-03-01T13:00:00Z";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");

        LocalDateTime date = LocalDateTime.parse(dataString, formatter);

        int year = date.getYear();

        int month = date.getMonthValue();

        int day = date.getDayOfMonth();

        DayOfWeek weekDay = date.getDayOfWeek();


        System.out.println("Anno: " + year);
        System.out.println("Mese: " + month);
        System.out.println("Giorno: " + day);
        System.out.println("Giorno della settimana: " + weekDay);
    }
}