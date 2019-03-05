package demos;

import java.util.ArrayList;
import java.util.List;

public class MaxLength {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<>();
        aList.add("dog");
        aList.add("sheep");
        aList.add("ox");

        System.out.printf("Max length is %d\n", maxLength(aList));
    }

    public static int maxLength(ArrayList<String> strings){

        int maxL = 0;
        for( String aString : strings){
            int currentLength = aString.length();
            if( currentLength > maxL )
                maxL = currentLength;
        }

        return maxL;
    }
}