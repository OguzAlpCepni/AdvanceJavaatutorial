import java.util.*;

public class Main {
    public static void main(String[] args) {

       /* Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        set.add("java");
        set.add("c#");
        set.add("go");
        set.add("php");

        list.add("java");
        list.add("c#");
        list.add("go");
        list.add("php");

        Iterator<String> iterator1 = set.iterator();
        Iterator<String> iterator2 = list.iterator();

        while(iterator1.hasNext()) System.out.println(iterator1.next());

        System.out.println("-------------------------------------");

        while(iterator2.hasNext()) System.out.println(iterator2.next());
        System.out.println("-------------------------------------");

        */
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("c#");
        list.add("go");
        list.add("php");
        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()) System.out.println(listIterator.next());

        while(listIterator.hasPrevious()) System.out.println(listIterator.previous());

        while(listIterator.hasNext()){
            String value = listIterator.next();
            if(value.equals("go")) listIterator.remove();
        }
        System.out.println("---------");
        for(String s :list) System.out.println(s);
    }
}