package homework_week_9;

import java.util.ArrayList;

/**
 * Write a java program to create a new array list, add some colours (string)
 * and printout the collection using for each loop;
 */

public class Program_4_ColoursArraylist {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Megenta");
        colorList.add("Pink");
        colorList.add("Purple");
        colorList.add("Silver");
        colorList.add("Gold");
        colorList.add("Yellow");
        colorList.add("Grey");
        colorList.add("Green");
        for(String colourList: colorList){
            System.out.println(colourList + ",");

        }
    }

}
