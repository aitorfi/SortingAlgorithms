package application;

import bubbleSorts.BubbleSort;
import simpleSorts.InsertionSort;
import simpleSorts.SelectionSort;

/**
 * Contains the main method of the application.
 * 
 * @author Aitor Fidalgo
 */
public class Application {

    private static final Integer[] SORTED_INTEGER_ARRAY =
            {1, 1, 3, 4, 5, 6, 7, 7, 7, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    private static final Integer[] SHUFFLED_INTEGER_ARRAY = 
            ArrayShuffler.createShuffledIntegerArrayOfSize(20);
    
    /**
     * Main method used to execute the sorting algorithms.
     * 
     * This method is meant to be empty so that the user of the code can execute
     * any of the sorting algorithms included in the application and see their performance.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
