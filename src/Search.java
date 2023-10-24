import java.util.ArrayList;

public class Search {

    public static int linearSearch (int[] array, int value) {
        for (int i = 0;i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }

        }

        return -1;

    }

    public static int linearSearch (ArrayList<String> list, String string) {
        for( int i = 0;i < list.size(); i++) {
            if (list.get(i).equals(string)) {
                return i;
            }

        }

        return -1;

    }

    public static int binarySearch (int[] array, int value) {
        int lPointer = 0;
        int rPointer = array.length-1;
        while (lPointer <= rPointer) {
            int midIndex = (lPointer + rPointer)/2;
            if (array[midIndex] == value) {
                return midIndex;

            }
            else if (array[midIndex] > value){rPointer = midIndex-1;}
            else {lPointer = midIndex+1;}
        }
        return -1;

    }

    public static int binarySearch (String[] array, String string) {
        int lPointer = 0;
        int rPointer = array.length-1;
        while (lPointer <= rPointer) {
            int midIndex = (lPointer+rPointer)/2;
            if (array[midIndex].equals(string)) {
                return midIndex;

            }
            else if (array[midIndex].compareTo(string)>0) {rPointer= midIndex-1;}
            else {lPointer=midIndex+1;}
        }
        return -1;

    }
}