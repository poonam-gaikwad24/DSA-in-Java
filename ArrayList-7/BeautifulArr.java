
/*

Question 4 :Beautiful ArrayList(MEDIUM)
An Arraylist nums of size n is beautiful if:nums is a permutation of the integers in the range [1, n].
For every 0<=i<j<n, there is no index k with i<k<j where 2*nums.get(k)==nums.get(i) + nums.get(j). 
Given the integer n, return any beautiful array list nums of size n. There will be at least one valid answer for the given n.Sample Input 1: n = 4Sample Output 1:  [2,1,4,3]
Sample Input 2: n = 5 Sample Output 2:  [3,1,2,5,4] Constraints:●1 <= n <= 1000


*/

import  java.util.ArrayList;


public class BeautifulArr {
    public static void  getBeautifulArr(int N){
        ArrayList<Integer>ans = new ArrayList<>();
        ans.add(1);
        while(ans.size() < N){
            ArrayList<Integer>temp =  new  ArrayList<>();
            for(int el : ans){
                if(2*el - 1 <= N){
                    temp.add(2*el - 1);
                }
            }
                for( int el : ans){
                    if(2*el <= N){
                        temp.add(el * 2);

                    }
                }
                ans =  temp;

            }
            
            int[] result = new int[N];
            for(int i=0; i < N; i++){
                result[i] = ans.get(i);
                System.out.print(result[i] + " ");
            }
            
        }


    public static void main(String[] args){

    getBeautifulArr(5);
    }
    
}
