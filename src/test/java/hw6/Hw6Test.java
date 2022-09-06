package hw6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static hw6.Hw6.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Hw6Test {

    // testGetListWithPositionsGraterThen

    @Test
    void testGetListWithPositionsGraterThenNull() {
        List<Integer> l = null;
        assertEquals(getListWithPositionsGraterThen(null, 0), null);
    }
    @Test
    void testGetListWithPositionsGraterThenEmpty() {
        List<Integer> l = new ArrayList<Integer>();
        assertEquals(getListWithPositionsGraterThen(l, 5), new ArrayList<Integer>());
    }
    @Test
    void testGetListWithPositionsGraterThenSmall() {
        List<Integer> l = new ArrayList<Integer>();
        l.addAll(Arrays.asList(1, 2, 3));
        assertEquals(getListWithPositionsGraterThen(l, 5), new ArrayList<Integer>());
    }
    @Test
    void testGetListWithPositionsGraterThenSmall2() {
        List<Integer> l = new ArrayList<Integer>();
        l.addAll(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(getListWithPositionsGraterThen(l, 5), new ArrayList<Integer>());
    }
    @Test
    void testGetListWithPositionsGraterThenNormal() {
        List<Integer> l = new ArrayList<Integer>();
        l.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        List<Integer> lRes = new ArrayList<Integer>();
        lRes.addAll(Arrays.asList(6, 7));
        assertEquals(getListWithPositionsGraterThen(l, 5), lRes);
    }

    // removeFromListElementsBiggerThen

    @Test
    void testRemoveFromListElementsBiggerThenNull() {
        List<Integer> l = null;
        assertEquals(removeFromListElementsBiggerThen(null, 0), null);
    }
    @Test
    void testRemoveFromListElementsBiggerThenEmpty() {
        List<Integer> l = new ArrayList<Integer>();
        assertEquals(removeFromListElementsBiggerThen(l, 5), new ArrayList<Integer>());
    }
    @Test
    void testRemoveFromListElementsBiggerThenSmall() {
        List<Integer> l = new ArrayList<Integer>();
        l.addAll(Arrays.asList(1, 2, 3));
        List<Integer> lRes = new ArrayList<Integer>();
        lRes.addAll(Arrays.asList(1, 2, 3));
        assertEquals(removeFromListElementsBiggerThen(l, 5), lRes);
    }
    @Test
    void testRemoveFromListElementsBiggerThenSmall2() {
        List<Integer> l = new ArrayList<Integer>();
        l.addAll(Arrays.asList(1, 2, 3));
        List<Integer> lRes = new ArrayList<Integer>();
        lRes.addAll(Arrays.asList(1, 2, 3));
        assertEquals(removeFromListElementsBiggerThen(l, 3), lRes);
    }
    @Test
    void testRemoveFromListElementsBiggerThenNormal() {
        List<Integer> l = new ArrayList<Integer>();
        l.addAll(Arrays.asList(1, 7, 3, 4, 2));
        List<Integer> lRes = new ArrayList<Integer>();
        lRes.addAll(Arrays.asList(1, 3, 2));
        assertEquals(removeFromListElementsBiggerThen(l, 3), lRes);
    }

    // insertElemsInSpecificPosition

    @Test
    void testInsertElemsInSpecificPositionNull() {
        List<Integer> l = null;
        assertEquals(insertElemsInSpecificPosition(null, 0, 34), null);
    }
    void testInsertElemsInSpecificPositionNull2() {
        List<Integer> l = new ArrayList<Integer>();
        assertEquals(insertElemsInSpecificPosition(l, 0, null), null);
    }
    @Test
    void testInsertElemsInSpecificPositionEmpty() {
        List<Integer> l = new ArrayList<Integer>();
        List<Integer> lRes = new ArrayList<Integer>();
        lRes.addAll(Arrays.asList(3));
        assertEquals(insertElemsInSpecificPosition(l, 5, 3), lRes);
    }
    @Test
    void testInsertElemsInSpecificPositionSmall() {
        List<Integer> l = new ArrayList<Integer>();
        l.addAll(Arrays.asList(1, 2, 3));
        List<Integer> lRes = new ArrayList<Integer>();
        lRes.addAll(Arrays.asList(1, 2, 3, 5));
        assertEquals(insertElemsInSpecificPosition(l, 5, 5), lRes);
    }
    @Test
    void testInsertElemsInSpecificPositionSmall2() {
        List<Integer> l = new ArrayList<Integer>();
        l.addAll(Arrays.asList(1, 2, 3));
        List<Integer> lRes = new ArrayList<Integer>();
        lRes.addAll(Arrays.asList(1, 2, 3, 3));
        assertEquals(insertElemsInSpecificPosition(l, 3, 3), lRes);
    }
    @Test
    void testInsertElemsInSpecificPositionFirst() {
        List<Integer> l = new ArrayList<Integer>();
        l.addAll(Arrays.asList(1, 2, 3));
        List<Integer> lRes = new ArrayList<Integer>();
        lRes.addAll(Arrays.asList(3, 1, 2, 3));
        assertEquals(insertElemsInSpecificPosition(l, 0, 3), lRes);
    }
    @Test
    void testInsertElemsInSpecificPositionNormal() {
        List<Integer> l = new ArrayList<Integer>();
        l.addAll(Arrays.asList(1, 7, 3, 4, 2));
        List<Integer> lRes = new ArrayList<Integer>();
        lRes.addAll(Arrays.asList(1, 7, 6, 3, 4, 2));
        assertEquals(insertElemsInSpecificPosition(l, 3, 6), lRes);
    }

    
}
