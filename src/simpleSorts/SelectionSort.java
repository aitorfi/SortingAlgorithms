package simpleSorts;

import application.ArrayShuffler;
import java.util.Arrays;

/**
 * The algorithm finds the minimum value, swaps it with the value in the first
 * position, and repeats these steps for the remainder of the list.
 * 
 * <ul>
 *  <li>Worst-case performance: O(n^2) comparisons and O(n) swaps.</li>
 *  <li>Best-case performance: O(n^2) comparisons and O(1) swaps.</li>
 *  <li>Average-case performance: O(n^2) comparisons and O(n) swaps.</li>
 * </ul>
 * 
 * @author Aitor Fidalgo
 */
public class SelectionSort {
    
    /**
     * Selection-sorts a given Integer Array.
     * 
     * The algorithm divides the input list into two parts: a sorted sublist of
     * items which is built up from left to right at the front (left) of the list
     * and a sublist of the remaining unsorted items that occupy the rest of the list.
     * Initially, the sorted sublist is empty and the unsorted sublist is the
     * entire input list. The algorithm proceeds by finding the smallest
     * (or largest, depending on sorting order) element in the unsorted sublist,
     * exchanging (swapping) it with the leftmost unsorted element (putting it
     * in sorted order), and moving the sublist boundaries one element to the right. 
     * 
     * @param intArray The given Integer Array.
     * @return A sorted Integer Array.
     */
    public static Integer[] selectionSortIntegerArray(Integer[] intArray){
        Integer lowestUnsortedNumberIndex;
        Integer swapInt;
        
        for(int i = 0; i < intArray.length - 1; i++){
            lowestUnsortedNumberIndex = i;
            for(int j = i + 1; j < intArray.length; j++){
                if(intArray[j] < intArray[lowestUnsortedNumberIndex]){
                    lowestUnsortedNumberIndex = j;
                }
            }
            if(lowestUnsortedNumberIndex != i){
                swapInt = intArray[i];
                intArray[i] = intArray[lowestUnsortedNumberIndex];
                intArray[lowestUnsortedNumberIndex] = swapInt;
            }
        }
        return intArray;
    }
    
    /**
     * Shows in terminal how a shuffled Integer Array is selection-sorted step by step.
     */
    public static void selectionSortStepByStep(){
        Integer[] intArray = {1, 1, 3, 4, 5, 6, 7, 7, 7, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        intArray = ArrayShuffler.shuffleIntegerArray(intArray);
        Integer lowestUnsortedNumberIndex;
        Integer swapInt;
        Integer swaps = 0;
        
        System.out.println("Selection Sort:");
        System.out.println("Shuffled Integer array:\n" + Arrays.toString(intArray));
        for(int i = 0; i < intArray.length - 1; i++){
            lowestUnsortedNumberIndex = i;
            for(int j = i + 1; j < intArray.length; j++){
                if(intArray[j] < intArray[lowestUnsortedNumberIndex]){
                    lowestUnsortedNumberIndex = j;
                }
            }
            if(lowestUnsortedNumberIndex != i){
                swapInt = intArray[i];
                intArray[i] = intArray[lowestUnsortedNumberIndex];
                intArray[lowestUnsortedNumberIndex] = swapInt;
                swaps++;
            }
            System.out.println(Arrays.toString(intArray) + " (Swaps: " + swaps + ")");
        }
    }
}
