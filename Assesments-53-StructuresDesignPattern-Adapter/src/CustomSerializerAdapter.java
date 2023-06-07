public class CustomSerializerAdapter implements JsonSerializer{
    @Override
    public String serialization(Object obj) {
        CustomSerializer customSerializer = new CustomSerializer();

        return customSerializer.serialize(obj);
    }
}
