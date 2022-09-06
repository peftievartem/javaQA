package hw6;

import java.util.*;

public class Hw6 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<Integer>();

        Random rand = new Random();

        for (int i = 0; i < 10; i++){
            myList.add(rand.nextInt(50) - 20);
        }
        for (int i = 0; i < myList.size(); i++){
            System.out.print(myList.get(i) + " ");
        }
        System.out.println("\n---------------------");

        List<Integer> list1 = getListWithPositionsGraterThen(myList, 5);
        for (int i = 0; i < list1.size(); i++){
            System.out.print(list1.get(i) + " ");
        }

        System.out.println("\n---------------------");
        List<Integer> list2 = removeFromListElementsBiggerThen(myList, 20);
        for (int i = 0; i < list2.size(); i++){
            System.out.print(list2.get(i) + " ");
        }

        System.out.println("\n---------------------");

        List<Integer> list3 = insertElemsInSpecificPosition(myList, 2, 1);
        list3 = insertElemsInSpecificPosition(list3, 8, -3);
        list3 = insertElemsInSpecificPosition(list3, 5, -4);

        for (int i = 0; i < list3.size(); i++){
            System.out.print(list3.get(i) + " ");
        }
    }

    public static List<Integer> getListWithPositionsGraterThen(List<Integer> list, int indexFrom){
        List<Integer> newList = list;

        if (newList == null) return null;

        if (newList.size() <= indexFrom){
            return new ArrayList<Integer>();
        }else{
            return newList.subList(indexFrom, newList.size());
        }
    }

    public static List<Integer> removeFromListElementsBiggerThen(List<Integer> list, int biggerThen){
        if (list != null) {
            List l = new ArrayList<Integer>();

            Iterator<Integer> iter = list.iterator();
            Integer elem;
            while (iter.hasNext()) {
                elem = iter.next();
                if (elem <= biggerThen) {
                    l.add(elem);
                }
            }
            return l;
        }else{
            return null;
        }
    }

    public static List<Integer> insertElemsInSpecificPosition(List<Integer> list, int index, Integer value){
        if (list != null) {
            LinkedList<Integer> llist = new LinkedList<Integer>(list);
            if (llist != null && value != null) {
                if (index == 0) {
                    llist.addFirst(value);
                    return llist;
                }
                if (list.size() < index) {
                    llist.addLast(value);
                    return llist;
                } else {
                    int i = 0;
                    llist.add(index - 1, value);
                }
                return llist;

            } else {
                return null;
            }
        }else{
            return null;
        }
    }

}