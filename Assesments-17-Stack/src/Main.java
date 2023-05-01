import java.util.Enumeration;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("php");
        stack.push("c#");
        stack.push("Go");

        // stackın yazdırılma işlemi-1
        for(String s:stack) System.out.println(s);
        // stack yazdırma işlemi-2
        Enumeration<String> enumeration = stack.elements();
        while (enumeration.hasMoreElements()) System.out.println(enumeration.nextElement());

        // stack eklenen son elemanı almak fakat çıkarma fakat stackten çıkarma
        System.out.println("son eleman :"+stack.peek());
        for (String s:stack) System.out.println(s);
        System.out.println("son elemanı ne listeden çıkart :"+stack.pop());
        for (String s:stack) System.out.println(s);
        // stackteki elemanları teker tekre çıkartmak
        while(!stack.isEmpty()) System.out.println("eleman çıkartılıyor :"+stack.pop());
    }
}