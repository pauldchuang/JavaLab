package src;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonObject;

public class JsonTest{

    public static void main(String[] args) {
        Gson gson = new Gson();
        String jsonString = "{\"name\":\"Alice\",\"age\":30}";

        // parse JSON string to Gson JsonObject
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        System.out.println("With Gson JsonObject: " + jsonObject.get("name").getAsString() + " " + jsonObject.get("age").getAsInt());        

        // parse JSON string to Class object        
        Student student = gson.fromJson(jsonString, Student.class);
        System.out.println("With Java class object: " + student.getName() + " " + student.getAge());
    }
}