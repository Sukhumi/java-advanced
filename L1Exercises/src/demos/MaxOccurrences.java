package demos;
import java.util.HashMap;
import java.util.List;

public class MaxOccurrences {
    public static void main(String[] args) {
        // call the maxOccurences() method with some sample data
    }

    public static int maxOccurrences(List<Integer> aList){

        HashMap<Integer, Integer> counts = new HashMap<>();

        for( int i : aList ){
            Integer count = counts.get(i);
            if( count == null ){
                counts.put(i, 1);
            }
            else{
                counts.put(i, ++count);
            }
        }

        int maxOccurrence = 0;
        for ( int key : counts.keySet() ){
            int occurrence = counts.get(key);
            if( occurrence > maxOccurrence ){
                maxOccurrence = occurrence;
            }
        }

        return maxOccurrence;
    }
}