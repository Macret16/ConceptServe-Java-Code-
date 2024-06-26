import java.time.*;
import java.time.format.DateTimeFormatter;

public class datetime {
    public static void main(String[] args) throws ClassNotFoundException {

        LocalDateTime ldtime = LocalDateTime.now();
        LocalDate ldate = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh-mm-ss dd-MM-yyyy");
        System.out.println(ldate);
        String strr = ldtime.format(format);
        System.out.println(strr);
        System.out.println(ldtime);
    }
}
