import java.util.ArrayList;

/**
 * @author Elly Kang
 * @since 04/06/20
 * Description: In the SelfAdjusting class, there is a for loop that contains even numbers. It searches for each number
 * in the list and if it finds the number, it move to the beginning or add it to beginning.
 */

public class SelfAdjusting {
    private ArrayList<Integer> arr;

    /**
     * Constructor of the class
     * @param arr ArrayList Integer
     */
    public SelfAdjusting(ArrayList<Integer>arr){
        this.arr = arr;
    }

    /**
     * Accessor method for arr
     * @return the arr
     */
    public ArrayList<Integer> getArr(){
        return arr;
    }

    /**
     * This method sets the even numbers of two to twenty and it searches for each numbers in the list
     * When it finds the number, it moves to the beginning of list
     * When the number is not on the list, it just adds to the beginning
     */
    public void adjustList(){
        ArrayList<Integer> evenArr = new ArrayList<Integer>();
        /**
         * An ArrayList from 2-20 even
         */
        for(int i = 2; i <= 20; i += 2) {
            evenArr.add(i);
        }
        /**
         * A for loop that loops through arr
         */
        for(int b = 0; b <= arr.size()-1; b++) {
            boolean found = false;
            int loop = arr.get(b);
            /**
             * A for loop that searches through evenArr
             */
            for (int a = 0; a < evenArr.size(); a++) {
                /**
                 * if statement finds the number from arr, remove from evenArr, and add to the beginning
                 */
                if (loop == evenArr.get(a)) {
                    evenArr.add(0, evenArr.remove(a));
                    found = true;
                }
            }
            /**
             * Adding the numbers to the beginning
             */
            if (!found) {
                evenArr.add(0, arr.get(b));
            }
        }

        System.out.println(evenArr);
    }
}
