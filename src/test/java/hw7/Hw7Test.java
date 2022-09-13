package hw7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static hw7.Hw7.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Hw7Test {
    @Test
    void getPricesListTest() {
        List<String> actual = new ArrayList();
        actual.addAll(Arrays.asList("$0.43", "$0.01"));
        assertEquals(getPricesList("Test: $0.43 Price: $98.9933 4789 three $d.43 Third $0.01"), actual);
    }
}
