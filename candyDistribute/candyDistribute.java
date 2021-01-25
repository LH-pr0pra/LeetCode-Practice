public static int candy(int[] ratings) {
    //single item list = single candy
    if (ratings.length == 1) {
        return 1;
    }
    //two-item list = at most 3 candies
    if (ratings.length == 2) {
        if (ratings[0] == ratings[1]) {
            return 2;
        }
        else {
            return 3;
        }
    }
    //search along list
        //if item is first or last only check next or previous, respectively
        //check left and right
            //if greater than left&right, increase by greater candy count
            //if greater than left only, increase by left
            //if greater than right only, increase by right
    //find total
    int minimum = 0;
    return minimum;
}


//considerations below
import java.util.Arrays;

//testCase
int[] testCase = {1,2,3,5,4,2,3};
int minTest = candy(testCase);
System.out.println("minimum candy = " + minTest);