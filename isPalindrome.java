package leetCodeChallenges;

// KEY notes to the algorithm
// use remainder to get the last number i.e %10
// use /10 to pop the last digit

public class isPalindrome {
    public static void main(String[] args) {
        isNumberPalindrome(1221);

    }

    public static boolean isNumberPalindrome(int x) {
        //establish base cases
        if (x == 0) {
            //0 on its own will always be a palindrome
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            //negative numbers and numbers cannot start with a 0
            return false;
        }

        int reversedInteger = 0; //this will be increased

        while (x > reversedInteger) {
            System.out.println("The number we are checking " + x);
            //get the last digit
            int pop = x % 10;
            System.out.println("pop to get the last digit " + pop);
            x /= 10; //removes the last digit from x
            System.out.println("Remove the last digit from x " + x);

            System.out.println("The reversed number... we multiply by 10 to increase unit column i.e units, tens, hundreds, thousands...");
            reversedInteger = (reversedInteger * 10) + pop;
            System.out.println(reversedInteger);
            System.out.println("\n");
        }
        // we only need to check half of the number and compare --> they will be the same!
        if (x == reversedInteger || x == reversedInteger / 10) { // /10 accounts for numbers of odd length
            System.out.println("x = " + x + " == reversedInteger " + reversedInteger);
            return true;
        } else {
            return false;
        }
    }

}
