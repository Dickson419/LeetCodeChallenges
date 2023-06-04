package leetCodeChallenges;

/*
You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
Return the average salary of employees excluding the minimum and maximum salary.

Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500

1. sort array low to high
2. remove 0 and -1
3. add remaining numbers and divide by array length
 */

import java.util.ArrayList;
import java.util.Collections;

public class averageSalary {
    public double average(int[] salary){
        // Declare an ArrayList of salaries
        ArrayList<Integer> allSalary = new ArrayList<>();
        double temp = 0;

        //place all array integers in to arrayList
        for(int i =0; i< salary.length;i++){
            allSalary.add(salary[i]);
        }
        Collections.sort(allSalary);
        System.out.println(allSalary);
        allSalary.remove(0);
        allSalary.remove(allSalary.size()-1);

        for(int i = 0; i<allSalary.size();i++){
            temp += allSalary.get(i);
        }
        double ans = temp / allSalary.size();
        System.out.println(ans);
        return ans;
    }



    //----- RUN the program -----
    public static void main(String[] args) {
        //ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        averageSalary newAverage = new averageSalary();
        int[] salary= {4000,3000,1000,2000};
        double result = newAverage.average(salary);
        System.out.println("Answer =  " + result);
    }
}
