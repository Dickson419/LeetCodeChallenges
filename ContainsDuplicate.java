package leetCodeChallenges;

import java.util.HashMap;
//Given an integer array nums,
// return true if any value appears at least twice in the array,
// and return false if every element is distinct.

public class ContainsDuplicate {
    public boolean containsDup(int[] nums) {
        // Create a HashMap to store elements and their indices
        HashMap<Integer,Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {

            // Check if the element is already present in the map
            if (map.containsKey(nums[i])) {
                System.out.println("Duplicate found!");
                System.out.println(map);
                return true;

                // Add the element to the map with its index
            } else {
                map.put(nums[i], i);
                System.out.println("All elements unique");
            }
            System.out.println(map);
        }
        return false;
    }



    //----- RUN the program -----
    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        int[] nums = {10, 16, 27, 67, 45, 5, 6};
        boolean result = containsDuplicate.containsDup(nums);
        System.out.println("Contains duplicate: " + result);
    }
}


