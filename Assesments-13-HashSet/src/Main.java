import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        set1.add("java");
        set1.add("c++");
        set1.add("c");
        set1.add("php");
        set2.add("c#");
        set2.add("python");
        set2.add("javascript");
        set2.add("java");
        //HashSet<String> fark = new HashSet<>(set2);
       //System.out.println(fark.removeAll(set1));
        //System.out.println(fark);

        HashSet<String> kesisim = new HashSet<>(set2);
        System.out.println(kesisim.retainAll(set1));
        System.out.println(kesisim);


    }
}