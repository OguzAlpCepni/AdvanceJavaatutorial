import java.io.Serializable;

public class Student implements Serializable {

    private String isim;
    private int id;
    private String bolum;
    public Student(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        String bilgiler = "ogrenci ismi :" + isim+
                            "\nogrenci numarası" + id+
                        "\nogrenci bolum :"+ bolum;
        return bilgiler;
    }
}
