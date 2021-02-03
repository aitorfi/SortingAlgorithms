package bubbleSorts;

import application.ArrayShuffler;
import java.util.Arrays;

/**
 * Bubble sort is a sorting algorithm that repeatedly steps through the list,
 * compares adjacent elements and swaps them if they are in the wrong order.
 * 
 * <ul>
 *  <li>Worst-case performance: O(n^2) comparisons and swaps.</li>
 *  <li>Best-case performance: O(n) comparisons and O(1) swaps.</li>
 *  <li>Average-case performance: O(n^2) comparisons and swaps.</li>
 * </ul>
 * 
 * @author Aitor Fidalgo
 */
public class BubbleSort {
    
    /**
     * Bubble sorts a given Integer Array.
     * 
     * The algorithm starts at the beginning of the data set. It compares the 
     * first two elements, and if the first is greater than the second, it swaps
     * them. It continues doing this for each pair of adjacent elements to the
     * end of the data set. It then starts again with the first two elements,
     * repeating until no swaps have occurred on the last pass.
     * 
     * @param intArray Shuffled Integer Array to be sorted.
     * @return Sorted Integer Array.
     */
    public static Integer[] bubbleSortIntegerArray(Integer[] intArray){
        Integer swapInt;
        Boolean swapped;
        Integer unsortedElements = intArray.length;
        
        do{
            swapped = false;
            for(int i = 0; i < unsortedElements - 1; i++){
                if(intArray[i] > intArray[i+1]){
                    swapInt = intArray[i];
                    intArray[i] = intArray[i+1];
                    intArray[i+1] = swapInt;
                    swapped = true;
                }
            }
            unsortedElements--;
        } while(swapped);
        
        return intArray;
    }
    
    /**
     * Shows in terminal how a shuffled Integer Array is bubble sorted step by step.
     */
    public static void bubbleSortStepByStep(){
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        intArray = ArrayShuffler.shuffleIntegerArray(intArray);
        Integer swapInt;
        Boolean swapped;
        Integer swaps = 0, unsortedElements = intArray.length;
        
        System.out.println("Bubble Sort:");
        System.out.println("Shuffled Integer array:\n" + Arrays.toString(intArray));
        do{
            swapped = false;
            for(int i = 0; i < unsortedElements - 1; i++){
                if(intArray[i] > intArray[i+1]){
                    swapInt = intArray[i];
                    intArray[i] = intArray[i+1];
                    intArray[i+1] = swapInt;
                    swapped = true;
                    swaps++;
                }
            }
            unsortedElements--;
            System.out.println(Arrays.toString(intArray) + " (Swaps: " + swaps + ")");
        } while(swapped);
    }
}
