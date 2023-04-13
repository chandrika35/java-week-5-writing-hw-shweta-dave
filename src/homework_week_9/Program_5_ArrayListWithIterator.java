package homework_week_9;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Write a java program to iterate through all elements in an array list using Iterator
 */

public class Program_5_ArrayListWithIterator {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Grapes");
        fruitList.add("Mango");
        fruitList.add("Kiwi");
        fruitList.add("Watermelon");
        fruitList.add("Muskmelon");
        fruitList.add("Strawberry");
        fruitList.add("Raspberry");
        ListIterator<String> iterate = fruitList.listIterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }
    }

}
