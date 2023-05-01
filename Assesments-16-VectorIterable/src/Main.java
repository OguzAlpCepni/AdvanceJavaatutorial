import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.add("php");
        vector.add("java");
        vector.add("JS");
        vector.add("c++");
        // vectore dolanım hareketi
        for(String s : vector){
            System.out.println(s);
        }
        System.out.println("------------------------------------");
        // vectore dolanım hareketi2
        ListIterator<String> iterator = vector.listIterator();
        while(iterator.hasNext()) System.out.println(iterator.next());

        System.out.println("------------------------------------");
        // vectore dolanım hareketi-3
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements())enumeration.nextElement();

        System.out.println("ilk eleman :"+vector.firstElement());
        System.out.println("son eleman :"+vector.lastElement());
    }
}