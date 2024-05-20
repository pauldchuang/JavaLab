public class StringPoolTest {
    public static void main(String[] args) {
        String s1 = "OCAJP";
        String s2 = "OCAJP" + "";
        System.out.println(s1 == s2);        

        String s3 = "OCAJP";
        String s4 = s3 + "";
        System.out.println(s3 == s4);            
    }   
}
