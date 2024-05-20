import java.time.LocalDate;
import java.time.Period;
public class AboutDate {
    public static void main(String[] args) {
        Period period = Period.of(2024, 3, 16);
        System.out.println(period);     
        
        LocalDate date = LocalDate.of(2020, 9, 30);
        System.out.println(date);
    }    
}
