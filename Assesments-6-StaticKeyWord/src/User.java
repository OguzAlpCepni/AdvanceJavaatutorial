public class User {
    public String name;
    public static int counter = 0;
    static {
        System.out.println("second Staic code line");
        int random = (int)(Math.random()*10);
        System.out.println("thirth random number ");
        counter = random;
        System.out.println("fourth random value " + random);

    }

    public User(String name){
        this.name = name;
        counter++;
        System.out.println("counter new value :"+counter);
    }
}
