import java.util.ArrayList;
import java.util.List;

public class RemoveArrayList {
    public static void main(String[] args) {   
        List<String> list_for_comparison = new ArrayList<>();
        list_for_comparison.add(0, "V");
        list_for_comparison.add("T");
        list_for_comparison.add(1, "E");
        list_for_comparison.add(3, "O");

        if(list_for_comparison.contains("O")) {
            list_for_comparison.remove("O");
        }

        for(String s : list_for_comparison) {
            System.out.println(s);
        }            
        
        // remove overriding will always look at int before Object
        List<Character> list = new ArrayList<>();
        list.add(0, 'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');

        if(list.contains('O')) {
            list.remove('O');
        }

        for(char ch : list) {
            System.out.print(ch);
        }    
    }
}
