import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(10,"java");
        hashMap.put(20,"c++");
        hashMap.put(30,"c#");
        hashMap.put(40,"js");

        System.out.println(hashMap); // fark ettiysen sıralaması önemli değil

        System.out.println(hashMap.get(10));

        for(Map.Entry<Integer,String> entry : hashMap.entrySet()){
            System.out.println("key :"+entry.getKey()+"-------------->"+entry.getValue()) ;
        }
    }
}