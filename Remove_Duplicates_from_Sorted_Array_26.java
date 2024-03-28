package array;

import java.util.*;

public class Remove_Duplicates_from_Sorted_Array_26 {


    public static void main(String[] args) {


        int[] nums={1,2,3,3};


        System.out.println(removeDuplicates(nums));

    }


    public  static  int removeDuplicates(int[] nums) {

        // Handle edge cases
       if(nums.length==0 || nums==null){
           return 0;
       }

        // Use a LinkedHashSet to maintain order and remove duplicates
        Set<Integer> set = new LinkedHashSet<>();
        for (int num: nums
             ) {
            set.add(num);
        }

        // Copy the unique elements back to the original array
        int index=0;
        for (int num: set
             ) {
            nums[index++]=num;
        }


        return set.size(); // Return the new length
    }

}
