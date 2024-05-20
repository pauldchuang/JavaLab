import java.util.ArrayList;
import java.util.List;

public class ListPassByWhat {
    public static void main(String[] args) {
        String s = new String("Hello");
        List<String> list = new ArrayList<>();
        list.add(s);
        list.add(new String("Hello"));
        list.add(s);
        s.replace("l", "L");

        System.out.println(list);
        System.out.println(list.get(0) == (list.get(1)));
        System.out.println(list.get(0) == (list.get(2)));
    }
}
