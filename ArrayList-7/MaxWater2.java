//Two pointer approach
import java.util.ArrayList;

public class MaxWater2 {

    public static int container(ArrayList<Integer>height){
    int maxWater = 0;
    int lp = 0;
    int rp = height.size()-1;   //right  pointer 

    while(lp < rp){

            //calculate water area
        int ht = Math.min(height.get(lp), height.get(rp));
        int wdth = rp - lp;
        int currWater = ht * wdth;

        maxWater = Math.max(currWater, maxWater);
    
      //update ptr
      if(height.get(lp) < height.get(rp)){
        lp++;    //water height is dependent on small height container not on large height container as if we move long height container it doesnt make any sense only results in reduction in area.
      }else{
        rp--;
      }

      
    }
return maxWater;
    }
    

    public static void main(String[] args){

        ArrayList<Integer>height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
         height.add(2);
        height.add(5);
        height.add(4);
        
        height.add(8);
        
        height.add(3);
        height.add(7);

       System.out.print(container(height));

    }
    
}


//TC = O(n)    as let total length to traverse id n if lp conered d distance then rp = n - d;   tc = O(n)
//SC = O(1)