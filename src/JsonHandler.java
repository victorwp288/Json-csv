package src;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;

public class JsonHandler {

    String jsonString = "src\\main\\java\\src\\unece.json";
    String myJsonFile = "src\\main\\java\\src\\myJsonFile.json";
    JSONParser parser = new JSONParser();


    public void readWriteJson (Boolean consolePrint){
        try (FileReader fileReader = new FileReader(jsonString)) {

            Object object = parser.parse(fileReader);
            JSONArray world = new JSONArray();
            JSONArray inf = new JSONArray();
            JSONArray jsonArray = (JSONArray) object;

            for (Object o: jsonArray) {
                JSONObject worldObjectHolder = new JSONObject();
                JSONObject jsonGetter = (JSONObject) o;
                worldObjectHolder.put("Country ", jsonGetter.get("Country"));
                worldObjectHolder.put("Total population ", jsonGetter.get("Total population"));
                worldObjectHolder.put("Year ", jsonGetter.get("Year"));
                inf.add(worldObjectHolder);
            }

            if (consolePrint) {
                for (Object data : inf) {
                    System.out.println(inf);
                }
            }

            FileWriter fileWriter = new FileWriter(myJsonFile);
            fileWriter.write(String.valueOf(inf));




        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
