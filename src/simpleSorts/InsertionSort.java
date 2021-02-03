package simpleSorts;

import application.ArrayShuffler;
import java.util.Arrays;

/**
 * At each iteration, insertion sort removes one element from the input data,
 * finds the location it belongs within the sorted list, and inserts it there.
 * 
 * <ul>
 *  <li>Worst-case performance: O(n^2) comparisons and swaps.</li>
 *  <li>Best-case performance: O(n) comparisons and O(1) swaps.</li>
 *  <li>Average-case performance: O(n^2) comparisons and swaps.</li>
 * </ul>
 * 
 * @author Aitor Fidalgo
 */
public class InsertionSort {
    
    /**
     * Insertion-sorts a given Integer Array.
     * 
     * Insertion sort iterates, consuming one input element each repetition,
     * and grows a sorted output list. At each iteration, insertion sort removes
     * one element from the input data, finds the location it belongs within the
     * sorted list, and inserts it there. It repeats until no input elements remain.
     * 
     * @param intArray The given Integer Array.
     * @return Sorted Integer Array.
     */
    public static Integer[] insertionSortIntegerArray(Integer[] intArray){
        for(int i = 0; i < intArray.length; i++){
            int testNode = intArray[i];
            int j;
            for(j = i; j > 0 && intArray[j-1] > testNode; j--){
                intArray[j] = intArray[j-1];
            }
            intArray[j] = testNode;
        }
        return intArray;
    }
    
    /**
     * Shows in terminal how a shuffled Integer Array is insertion-sorted step by step.
     */
    public static void insertionSortStepByStep(){
        Integer[] intArray = {1, 1, 3, 4, 5, 6, 7, 7, 7, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        intArray = ArrayShuffler.shuffleIntegerArray(intArray);
        int swaps = 0;
        
        System.out.println("Insertion Sort:");
        System.out.println("Shuffled Integer array:\n" + Arrays.toString(intArray));
        for(int i = 0; i < intArray.length; i++){
            int testNode = intArray[i];
            int j;
            for(j = i; j > 0 && intArray[j-1] > testNode; j--){
                intArray[j] = intArray[j-1];
                swaps++;
                System.out.println(Arrays.toString(intArray) + " (Swaps: " + swaps + ")");
            }
            intArray[j] = testNode;
            System.out.println(Arrays.toString(intArray) + " (Swaps: " + swaps + ")");
        }
    }
}
