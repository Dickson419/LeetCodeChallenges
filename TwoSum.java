package leetCodeChallenges;
/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
 */

// 1st is to brute force a solution with a for lop

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; i++) { //j=1 as we don't want t add first number to itself

                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j}; //return a new int array
                    }

                }
            }

            return nums; //return original array as failsafe
        }
    }

    //HashMap in constant time big O(1)
    //Store number we have to add inoder to get the target
    //TARGET = 6
    class Solution2 {
        public int[] twoSum(int[] nums, int target) {
            //create the hashmap
            Map<Integer, Integer> complements = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {

                //check if index number is already a key in the map
                Integer complementIndex = complements.get(nums[i]);
                if (complementIndex != null) {
                    return new int[]{i, complementIndex};
                }
                complements.put(target - nums[i], i);
            }
            return nums;
        }
    }


}
/*
Input: nums = [3,2,4], target = 6
Output: [1,2]


Input: nums = [5, 2, 4]
Target = 6

KEY - complement | VALUE - index number
1                   0
4                   1

4 is a key. So index[2] and index[1] will be the answer


What would we add to 5 to get to 6? 1! 1 is known as the complement
    5 - 6 | number - target
Store the complement as the key
Store index as 0 (the location of 5)
--> now if we find the complement we add that

IF we find a key which is equal to an index we have the answer
 */

