import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        // vektör dinamik boyutlu bir dizidir ve özellikle bir koleksiyon elemanlarına erişim sıklığı
        // yüksek olduğunda kullanılır . Vektörler  ArrayListler gibi diilere benzer , ancak bazı ek özelliklere sahiptir
        // özellikle vektörlerin boyutları otomatik ayarlanabilir.
        // paralel çalışan iş parçaccıkları arasında senkronize edilebilirler Bu nedenle threadlerin eş zamanlı olarak
        // bir vektöre erişmesi gerektiğinde kullanılır
        // java.util.Vector
        // senkronizasyon özelliği yüzünden arraylisletere göre daha yavaş çalışır

        Vector<String> vector = new Vector<>();
        vector.add("elma");
        vector.add("armut");
        vector.add("portakal");

        // Vector'deki eleman sayısı
        System.out.println("Eleman sayısı: " + vector.size());

        // Vector'deki elemanlara erişim
        System.out.println("İlk eleman: " + vector.get(0));
        System.out.println("Son eleman: " + vector.get(vector.size()-1));

        // Vector'de eleman arama
        if (vector.contains("armut")) {
            System.out.println("Vector'de armut bulundu!");
        } else {
            System.out.println("Vector'de armut bulunamadı.");
        }

        // Vector'deki elemanları döngüyle gezme
        System.out.println("Vector'deki elemanlar:");
        for (String element : vector) {
            System.out.println(element);
        }

        // Vector'ü temizleme
        vector.clear();
        System.out.println("Vector temizlendi. Yeni eleman sayısı: " + vector.size());
    }
}