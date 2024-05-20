public class MyClass implements MyInterface {

    @Override
    public String concatenate(String str1, String str2) {
        return str1 + "------" + str2;
    }

    public static void main(String[] args) {
        // MyInterface mitf = (str1, str2) ->  { return str1 + str2; }; // no need for String type because there is only one method in the interface
        MyInterface mitf = (str1, str2) -> str1 + str2 ; // no need for String type because there is only one method in the interface
        System.out.println(mitf.concatenate("Hey", " Jude")); //Hey Jude
    }    
}