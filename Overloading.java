public class Overloading {    
    private static void m(int x) {
        System.out.println("int version");
    }

    private static void m(char x) {
        System.out.println("char version");
    }

    public static void main(String [] args) {
        int i = '5';
        m(i); // decided m(int) at compile time
        m('5'); // decided m(char) at compile time
    }        
}
