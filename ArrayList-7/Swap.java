1) Swap numbers in arraylist

import java.util.ArrayList;

public class Swap{

    public static void Swapping(ArrayList<Integer> list, int idx1, int idx2){

        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);


    }
public  static void main(String[] arggs){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(6);
    list.add(8);
    list.add(5);

    System.out.print(list);
    Swapping(list, 2, 0);
    System.out.print(list);
  
}
}
