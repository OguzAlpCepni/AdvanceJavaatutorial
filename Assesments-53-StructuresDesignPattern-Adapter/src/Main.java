public class Main {
    public static void main(String[] args) {
        CustomOperation customOperation = new CustomOperation(new CustomSerializerAdapter());
        String serializedObject = customOperation.SerializeObbject(new Object());

        System.out.println(serializedObject);
    }
}