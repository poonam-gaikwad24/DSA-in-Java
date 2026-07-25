
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
    
        int key = 2;
        findTarget(nums, 2); 

    }
}