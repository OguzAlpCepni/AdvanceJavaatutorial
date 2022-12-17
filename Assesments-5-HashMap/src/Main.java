import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,String> capitalCities = new HashMap<String,String>();
        capitalCities.put("Turkey","Ankara");
        capitalCities.put("England","London");
        capitalCities.put("France","Paris");
        capitalCities.put("Greece","Atina");
        capitalCities.put("Italy","Roma");
        System.out.println("---------------------------------------------------------");
        System.out.println("Key-value"+capitalCities);
        System.out.println("---------------------------------------------------------");
        System.out.println("Capital number : "+capitalCities.size());
        System.out.println("---------------------------------------------------------");
        System.out.println("Turkey capital is : "+capitalCities.get("Turkey"));
        System.out.println("---------------------------------------------------------");
        for(String capitals :capitalCities.values()){
            System.out.println(capitals);
        }
        System.out.println("---------------------------------------------------------");
        for(String capitals : capitalCities.keySet()){
            System.out.println(capitals);
        }


    }
}