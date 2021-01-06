package application;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * This class contains methods that shuffle given Arrays.
 * 
 * @author Aitor Fidalgo
 */
public class ArrayShuffler {
    
    /**
     * Shuffles a given Integer Array.
     * 
     * @param array Integer Array to be shuffled.
     * @return A shuffled Integer Array.
     */
    public static Integer[] shuffleIntegerArray(Integer[] array){
        List<Integer> intList = Arrays.asList(array);
        Collections.shuffle(intList);
        intList.toArray(array);
        return array;
    }
    
    /**
     * Creates a shuffled Integer Array of the given size.
     * 
     * @param size The given size of the Array.
     * @return A shuffled Integer Array.
     */
    public static Integer[] createShuffledIntegerArrayOfSize(Integer size){
        Integer[] intArray = new Integer[size];
        Random rand = new Random();
        
        for(int i = 0; i < size; i++){
            intArray[i] = rand.nextInt(size) + 1;
        }
        
        return intArray;
    }
}

