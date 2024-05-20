import java.util.*;

public class StringBufferAppend {
    public static void main(String [] arg) {
        // 1. StringBuffer can append String, StringBuffer and Char Array (char[])
        String str = "Hello, World!";    
        StringBuffer sb = new StringBuffer();
        sb.append("sb1 sb1 sb1");
        StringBuffer sb2 = new StringBuffer();
        sb2.append(new StringBuffer(" Hey!"));
        sb2.append(new char[]{'a', 'b'});

        sb.append(sb2).append(str);

        char[] charArray = {'a', 'd', 'e'};
        sb.append(charArray);
        System.out.println(sb);

        // char vs int
        System.out.println((int)'a');
        System.out.println(97);
        System.out.println(((int)'a')==97);
        System.out.println((char)97);

        // object equal (equality)
        // Use Arrays.equals to compare arrays for equality.
        // Arrays inherit equals from Object, so two distinct array instances are never equal, even when their contents are the same.        
        char[] first = {'a'};
        char[] second = {'a'};        
        System.out.println(first == second); // false
        System.out.println(first.equals(second)); // false
        System.out.println(Arrays.equals(first, second)); // true

        String str5 = "java";
        StringBuilder sb5 = new StringBuilder("java");
        System.out.println(str5.equals(sb5)+":"+sb5.equals(str5)); //false:false
        System.out.println(str5.equals("java")+":"+sb5.equals("java")); //true:false StringBuilder overrides equal, only compares object equality
    }
}