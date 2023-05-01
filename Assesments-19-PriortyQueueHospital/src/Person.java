public class Person implements Comparable<Person>{
    private String name;
    private String complaint;
    private int firstly;
    public Person(String name,String complaint){
        this.complaint=complaint;
        this.name=name;

        if (complaint.equals("apandist")) this.firstly=3;
        else if ((complaint.equals("burn"))) this.firstly=2;
        else this.firstly=1;
    }

    @Override
    public String toString() {
        String information = "ill person name :" + name+" complaint :"+ complaint+" öncelik :"+firstly;
        return information;

    }

    @Override
    public int compareTo(Person person) {
        if(this.firstly>person.firstly) return -1;
        else if(this.firstly<person.firstly) return 1;
        else return 0;
    }
}
