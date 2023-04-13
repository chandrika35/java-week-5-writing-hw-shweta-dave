package homework_week_9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a java program to retrieve an element(at a specified index) from a givem array list
 */

public class Program_6_RetrieveArrayListAtGivenIndex {
    public static void main(String[] args) {
        ArrayList<String> vegetableList = new ArrayList<>();
        vegetableList.add("Potato");
        vegetableList.add("Green Peas");
        vegetableList.add("Cauliflower");
        vegetableList.add("Carrot");
        vegetableList.add("Tomato");
        vegetableList.add("Cabbage");
        vegetableList.add("Okra");
        vegetableList.add("Guard");
        System.out.println(vegetableList);
        Scanner veg = new Scanner(System.in);
        System.out.println("Please enter an index number : ");
        int index = veg.nextInt();
        if(index < vegetableList.size()){
            System.out.println(vegetableList.get(index));

        }else{
            System.out.println("Invalid Index!!");
        }
        veg.close();
    }



}
