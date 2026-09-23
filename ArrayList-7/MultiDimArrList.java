import java.util.ArrayList;

public class MultiDimArrList {

public static void main(String[] args){

    ArrayList<ArrayList<Integer>>mainList = new ArrayList<>();

        ArrayList<Integer>list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(7);
        list1.add(0);
    

        mainList.add(list);
        mainList.add(list1);

        //System.out.print(mainList);


        //2

        for(int i=0; i < mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j  < currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }


        //3  print 3 lists inside Multidementional array 

        ArrayList<ArrayList<Integer>> MyList = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();
        ArrayList<Integer> list6 = new ArrayList<>();
        ArrayList<Integer> list7 = new ArrayList<>();

        for(int i=1; i <=5;i++){
            list5.add(i);
            list6.add(2*i);
            list7.add(3*i);
        }

        
        MyList.add(list5);
        MyList.add(list6);
        MyList.add(list7);

System.out.println(MyList);

for(int i=0; i < MyList.size(); i++){
    ArrayList<Integer> currList = MyList.get(i);
    for(int j=0; j < currList.size(); j++){
        System.out.print(currList.get(j) + " ");

    }
    System.out.println();


}

}
    
}


/*

mainList
│
├── index 0 → [5, 8, 2]
└── index 1 → [7, 0]

*/