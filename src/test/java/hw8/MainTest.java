package hw8;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static hw8.Main.squareRectangle;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    /* - TASK 1 --------------------- */

    @Test
    void squareRectangleOk() {
        Integer expected = 6;
        Integer actual = squareRectangle(3, 2);
        assertEquals(expected, actual);
    }
    @Test
    void squareRectangleNegative() {
        try {
            assertEquals(6, squareRectangle(3, -2));
            Assert.fail("If all ok - test failed");
        } catch (Exception e) {
            String expectedMessage = "Error counting square Rectangle. Argument < 0";
            String actualMessage = e.getMessage();
            assertEquals(expectedMessage, actualMessage);
        }
    }
    @Test
    void squareRectangleNegative2() {
        try {
            assertEquals(6, squareRectangle(-3, 2));
            Assert.fail("If all ok - test failed");
        } catch (Exception e) {
            String expectedMessage = "Error counting square Rectangle. Argument < 0";
            String actualMessage = e.getMessage();
            assertEquals(expectedMessage, actualMessage);
        }
    }
    @Test
    void squareRectangleNegative3() {
        try {
            assertEquals(6, squareRectangle(-3, -2));
            Assert.fail("If all ok - test failed");
        } catch (Exception e) {
            String expectedMessage = "Error counting square Rectangle. Argument < 0";
            String actualMessage = e.getMessage();
            assertEquals(expectedMessage, actualMessage);
        }
    }
    /* - TASK 2 --------------------- */
    @Test
    void createPlantTypeException() {
        try {
            Plant plant = new Plant(10, "blue", "eeed");
            Assert.fail("If all ok - test failed");
        }catch (Exception e){
            String expectedMessage = "type error";
            String actualMessage = e.getMessage();
            assertEquals(expectedMessage, actualMessage);
        }
    }
    @Test
    void createPlantColorException() {
        try {
            Plant plant = new Plant(10, "22blue", "food");
            Assert.fail("If all ok - test failed");
        }catch (Exception e){
            String expectedMessage = "color error";
            String actualMessage = e.getMessage();
            assertEquals(expectedMessage, actualMessage);
        }
    }
    @Test
    void createPlantOk() {
        try {
            Plant plant = new Plant(10, "blue", "light");

            Color expectedColor = Color.BLUE;
            Color actualColor = plant.getColor();
            assertEquals(expectedColor, actualColor);

            Type expectedType = Type.LIGHT;
            Type actualType = plant.getType();
            assertEquals(expectedType, actualType);

            Integer expectedSize = 10;
            Integer actualSize = plant.getSize();
            assertEquals(expectedSize, actualSize);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}