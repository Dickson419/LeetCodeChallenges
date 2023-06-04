package leetCodeChallenges;
/*
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Input: x = 123
Output: 321

Input: x = -123
Output: -321
 */

// KEY notes to the algorithm
// use remainder to get the last number i.e %10
// use /10 to pop the last digit

public class reverseInteger {
    public static void main(String[] args) {
        reverseInt(1534236469);

    }

    public static int reverseInt(int x) {
        int reversed = 0;
        int pop; //will be used to bet the last number using MOD10

        while (x != 0) {
            pop = x % 10; //will ALWAYS be the last digit
            System.out.println("pop =  " + pop + " as this the last number from x");
            /*
                get the remainder from dividing by 10. This will get the last number.
                123 / 10 = 12 remainder 3. 12/10 = 1 remainder 2...
             */

            x /= 10; //remove the last digit from x

            //leetcode boundaries
            if (reversed > Integer.MAX_VALUE || reversed == Integer.MAX_VALUE && pop > 7) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE || reversed == Integer.MIN_VALUE && pop < -8) {
                return 0;
            }

            System.out.println("x = " + x + " as x is divided by 10 --> removing the last digit from the number");
            System.out.println("Reversed = " + reversed + " this is just the initial reverse BEFORE anything is done!");
            reversed = (reversed * 10) + pop;
            System.out.println("Reversed * 10 (moves the number to the left unites, tens, hundreds...) + pop (to add the new number on) = " + reversed + " ... eventually this wil be our number in reverse!");
            System.out.println("\n");
        }
        System.out.println(reversed);

        return reversed;
    }
}
