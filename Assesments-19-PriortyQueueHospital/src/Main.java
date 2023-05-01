import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> hospital = new PriorityQueue<Person>();
        hospital.offer(new Person("oguz alp","burn"));
        hospital.offer(new Person("ali","headache"));
        hospital.offer(new Person("veli","apandist"));
        hospital.offer(new Person("kemal","burn"));
        hospital.offer(new Person("nuri","apandist"));
        hospital.offer(new Person("yaren","sinuzit"));
        int i = 1;
        while(hospital.isEmpty() != true){
            System.out.println("----------------");
            System.out.println(i+".sırada");
            System.out.println(hospital.poll());
            System.out.println("--------------------");
            i++;
        }
    }
}