import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }.reversed()); // dikkat
        priorityQueue.add("oguz alp");
        priorityQueue.add("cepni");
        priorityQueue.add("cemil");
        priorityQueue.add("ayse");

        for(String isim :priorityQueue){
            System.out.println(isim);
        }
        Iterator<String> itr = priorityQueue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}