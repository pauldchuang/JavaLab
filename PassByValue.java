public class PassByValue {
    public static void main(String[] arg) {
        StringBuffer sb = new StringBuffer("sb");
        change(sb);
        System.out.println(sb);
    }    
    public static void change(StringBuffer sb){
        sb = new StringBuffer(sb);
        sb.append(" hey");
    }
}
