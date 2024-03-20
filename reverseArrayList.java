
import java.util.*;

public class reverseArrayList {
    // static int reverse(ArrayList<Integer> list){
    //     // int ans = 0;
        
    //     int i = 0, j = list.size()-1;
    //     // swap method
    //     while (j>i) {
            
        
    //     int temp = Integer.valueOf(list.get(i));
    //     list.set(i, list.get(j));
    //     list.set(j, temp);
    //     i++;
    //     j--;
    //     }

    //  }
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("origial arraylist ");
        System.out.println(list);
        // reverse(list);
        System.out.println("Reverse list ");
        Collections.reverse(list);

    
        System.out.println(list);
        


    }
    
}
