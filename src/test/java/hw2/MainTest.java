package hw2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void testPersonName(){
        Person person1 = new Person();
        person1.setName("Artem");
        person1.setBirthDate(LocalDate.of(2000, 03, 23));

        String expected1 = "Artem";
        String actual1 = person1.getName();
        assertEquals(expected1, actual1);

        String expected2 = "Artem";
        String actual2 = person1.getName();
        assertEquals(expected2, actual2);
    }

    @Test
    void testPersonObject(){
        Person person1 = new Person();
        person1.setName("Artem");
        person1.setBirthDate(LocalDate.of(2000, 03, 23));

        Person person2 = new Person();

        JSONParser parser = new JSONParser();
        JSONObject jsonObject;
        try {
            jsonObject = (JSONObject) parser.parse(new FileReader(
                    "src/test/resources/person.json"));

            String pName = (String) jsonObject.get("name");
            int pYear = ((Long)jsonObject.get("year")).intValue();
            int pMonth = ((Long)jsonObject.get("month")).intValue();
            int pDayOfMonth = ((Long)jsonObject.get("dayOfMonth")).intValue();

            person2.setName(pName);
            person2.setBirthDate(LocalDate.of(pYear, pMonth, pDayOfMonth));

            assertEquals(person2, person1);

            //JSONArray array = jsonObject.getJSONArray("people");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
