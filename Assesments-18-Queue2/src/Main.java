import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("java");
        queue.offer("php");
        queue.offer("c#");
        queue.offer("c++");

        for (String s:queue) System.out.println(s);

        System.out.println("ilk eleman :"+ queue.peek());

        System.out.println("ilk eleman xikartiliyor :"+ queue.poll());

        for (String s:queue) System.out.println(s);

        while (!queue.isEmpty()) System.out.println("queue bosaltiliyor cikan eleman :"+queue.poll());



    }
}