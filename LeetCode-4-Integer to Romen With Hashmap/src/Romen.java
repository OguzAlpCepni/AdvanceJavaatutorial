import java.util.HashMap;

public class Romen {
    HashMap<String, Integer> romen = new HashMap<String,Integer>();

    int Value(String romenNumber) {
        romen.put("I", 1);
        romen.put("V", 5);
        romen.put("X", 10);
        romen.put("L", 50);
        romen.put("C", 100);
        romen.put("D", 500);
        romen.put("M", 1000);
        int total = 0;
        for (int i = 0; i < romenNumber.length(); i++) {
            String karakter = String.valueOf(romenNumber.charAt(i));
            int sayi = romen.get(karakter);
            if (i + 1 < romenNumber.length()) {
                String karakter2 =String.valueOf(romenNumber.charAt(i+1));
                int sayi2 = romen.get(karakter2);
                if(sayi>=sayi2) total=total+sayi;
                else total=total-sayi;
            } else total = total + sayi;
        }
        return total;

    }
}