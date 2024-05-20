import java.util.List;
import java.util.ArrayList;
public class DataType {
    public static void main (String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(100);        
        ls.add(200);
        ls.add(100);
        
        ls.remove(Integer.valueOf(100));
        System.out.println(ls);
    }
}
