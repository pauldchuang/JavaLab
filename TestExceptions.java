import java.io.FileNotFoundException;
import java.io.IOException;
 
abstract class Super {
     public abstract void m1() throws IOException;
}
 
class Sub extends Super {
     @Override
     public void m1() throws IOException {
         throw new FileNotFoundException();
     }
}
 
public class TestExceptions {
     public static void main(String[] args) {
         Super s = new Sub();
         try {
            s.m1();
         } catch (FileNotFoundException e) {
            System.out.print("M");
         } catch(IOException e){
            System.out.print("Not here");            
         } finally {
             System.out.print("N");
         }
     }
}