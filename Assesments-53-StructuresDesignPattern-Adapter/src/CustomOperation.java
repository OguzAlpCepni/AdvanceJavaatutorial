public class CustomOperation {
        private  JsonSerializer jsonSerializer;

        public CustomOperation(JsonSerializer jsonSerializer){
            this.jsonSerializer=jsonSerializer;
        }
        public String SerializeObbject(Object obj){
            return jsonSerializer.serialization(obj);
        }
}
