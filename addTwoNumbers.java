package leetCodeChallenges;
//You are given two non-empty linked lists representing two non-negative integers.
//The digits are stored in reverse order, and each of their nodes contains a single digit.
//Add the two numbers and return the sum as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

import java.util.LinkedList;

public class addTwoNumbers {
    public static void main(String[] args) {
        //create our lists
        LinkedList<Integer> listOne = new LinkedList<>();
        LinkedList<Integer> listTwo = new LinkedList<>();

        //append numbers
        listOne.add(2);
        listOne.add(4);
        listOne.add(3);
        listTwo.add(5);
        listTwo.add(6);
        listTwo.add(4);

        //check numbers have been added
        checkNumbers(listOne, listTwo);

        int v1 = 0, v2 = 0;
        int l1 = listOne.get(0), l2 = listTwo.get(0);
        //empty lists to return answer and hold carry
        LinkedList<Integer> sumHead = new LinkedList<>();
        LinkedList<Integer> pointer = new LinkedList<>();

        //transverse the list


    }

    public static void checkNumbers(LinkedList one, LinkedList two) {
        //check numbers have added
        //Object replaces Integer or String. It is generic so any datatype can be passed in!
        System.out.println("Linked list one: ");
        for (Object i : one) {
            System.out.println(i);
        }
        System.out.println("\nLinked list Two: ");
        for (Object i : two) {
            System.out.println(i);
        }
    }


}

 /*

        1. Set two pointers. Create new list for answer
        2. Adding values that pointers are at
        3. Check if there is a carry. IF there is add 1.
        4. check if sum is >= 10. If there is MOD10. Carry flag == true
        5. move pointers forward
        6. after loop check if carry is true. IF it is add additional node to result list
        7. return result list

               i
        (2 --> 4 --> 3)

               p
        (5 --> 6 --> 4)

        i+p   i+p   i+p+1 from carry
        (7 --> 0 --> 8)
             Carry 1




        342
        465
        = 807



        */
