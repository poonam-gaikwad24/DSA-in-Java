//3  give a pair of lemets whose sum is as per the target sum


import java.util.ArrayList;

public class PairSum {

    public static ArrayList<Integer> findPairSum(ArrayList<Integer>list,ArrayList<Integer>ans, int target){
        
        int n = list.size();
        int bp = -1;
        
        //Finding pivot element 
        for(int i =0; i < list.size()-1; i++){
            if(list.get(i) > list.get(i+ 1)){            
                bp = i;
            }
        }

        int lp = bp + 1;   //smallest element
        int rp = bp;  //largest element



    while(lp != rp){
        if((list.get(lp) + list.get(rp)) == target){
            ans.add(list.get(lp));
            ans.add(list.get(rp));
            
            return ans;
        }

        if(list.get(lp) + list.get(rp) > target){
            rp = ( n + rp - 1) % n;

        } else if(list.get(lp) + list.get(rp) < target){
            lp = (lp + 1) % n;
        }
        
    }
    return ans;

    }


    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8); 
        list.add(9);
        list.add(10);
        ArrayList<Integer> ans = new ArrayList<>();

        System.out.print(findPairSum(list,ans, 16));


    }

    
}
