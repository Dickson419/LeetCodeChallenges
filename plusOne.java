package leetCodeChallenges;

/*
Input: digits = [1,2,3]
Output: [1,2,4]

LSB has one added. The number in the array is a whole number, we are incrementing by one

we started checking from back if last digit is less than 9 we simply add one one to the digit and return the digit.

Otherwise the case will be last digit was 9 so we make the digit 0 as we know 9+1 = 10
so last digit in these cases need to be 0 so we do that.

Here we create a new array of size input given to us +1 so that we can actually add 1 to beginning of our new array
and we return the new array that's it. For ex:[9,9,9] = [1,0,0,0]
in this case we need one more digit space as we need to carry 1 so in this way we do this.
 */

import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        plusOne1(digits);
    }

    public static int[] plusOne1(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; //increment if found THEN return
                System.out.println("IF STATEMENT");
                System.out.println(Arrays.toString(digits));
                return digits;
            }
            digits[i] = 0; //else if a 9 is found turn it to a 0, loop continues to next integer
            System.out.println("digits[i]");
            System.out.println(Arrays.toString(digits));
        }
        //create new array for all 9 cases
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        System.out.println(Arrays.toString(newNumber));
        return newNumber;
    }

}





