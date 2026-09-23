

/*
Question 3 :Most Frequent Number following Key(EASY) You are given an integer Arraylist nums.You are also given an integer key,which 
is present in nums.For every unique integer target in nums,count the number of times target immediately follows an occurrence of key in nums. In other words, count the number of indices i such that:0 <= i <= nums.size() - 2,nums.get(i) == key and,nums.get(i+1) == target.Return the target with the maximum count.(Assumption- that the target with maximum count isunique.)Sample Input 1:nums = [1,100,200,1,100], key = 1Sample Output 1:  100Explanation :For target = 100, there are 2 occurrences at indices 1 and 4 which follow an occurrence of key.No other integers follow an occurrence of key, so we return 100.gaikwadpoonam005@gmail.com
Sample Input 2: nums = [2,2,2,2,3], key = 2
Sample Output 2:  2 
Explanation :For target = 2, there are 3 occurrences at indices 1, 2, and 3 which follow an occurrence of key.
For target = 3, there is only one occurrence at index 4 which follows an occurrence of key.target=2 has the maximum number of 
occurrences following an occurrence of key,so we return

 2.Constraints:●2 <= nums.size() <= 1000●1 <= nums.get(i) <= 1000●
 Assume that the answer is unique.
*/


import java.util.ArrayList;
public class NumFollowKey{


    public static  void findTarget(ArrayList<Integer> nums, int key){
        int[] result = new int[1000];

        for(int i=0; i   < nums.size()-1; i++){
            if(nums.get(i) == key){
                result[nums.get(i+1)-1]++;  // stores frequency and -1 as we want to get actual index ,array indexing starting from 0 to 999 
           
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;


        for(int i=0; i< 1000; i++){
            if(result[i] > max){
                max = result[i];
                ans = i + 1;
            }
        }
        System.out.print(ans);
    }

        

    public static void main(String[] args){
         
        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);
    
    
        findTarget(nums, 2); 

    }
}