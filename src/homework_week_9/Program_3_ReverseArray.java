package homework_week_9;
import java.util.Arrays;

/**
 * Write a java program to reverse an array of integer values
 */

public class Program_3_ReverseArray {
    public static void main(String[] agrs){
        int[]array = new int[]{23,45,34,54,67,87};//single dimension array
        System.out.println("Original array:" + Arrays.toString(array));
        Program_3_ReverseArray obj = new Program_3_ReverseArray();
        System.out.println("Reverse array :");
        obj.reverseArray(array);
    }
    public void reverseArray(int[]list){
        for(int i = 0; i <(list.length)/2; i++){
            int temp = list[i];
            list[i]= list[list.length -1 - i];
            list[list.length -1 -i] = temp;
        }
        System.out.println(Arrays.toString(list));
    }
}
