package Single_Number;

public class Single_Number {
    public static void main(String[] args) {
        /*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
         */
        int[] nums={4,4,1,2,2,6,6,1,7};



        for (int i = 0; i < nums.length; i++)
        {
           int flag=0;
            for (int j = 0; j < nums.length; j++)
            {
                if (nums[i]==nums[j])
                    flag++;
            }

            if (i==0)
            {
                if (flag==1)
                    System.out.println("The single number: "+nums[i]);
            }else if (nums[i]!=nums[i-1])
            {
               if (flag==1)
                   System.out.println("The single number: "+nums[i]);
            }

        }

    }
}
