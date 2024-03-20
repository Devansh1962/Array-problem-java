import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(77);
        System.out.println(i);
        // craeate arraylist
        ArrayList<Integer> l1 = new ArrayList<>();
        // add method 
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(6);
        System.out.println(l1); 
        // output [2,3,4,6]
        // get method
        l1.get(2);
        System.out.println(l1.get(3));
        //  output 6
        System.out.println(l1.get(2));
        // output 4
        // size() method
        for( i = 0; i < l1.size(); i++){
            System.out.println(l1.get(i));
            // output 2,3,4,6
        }
        // add elements any insex 
        l1.add(1, 5);
        System.out.println(l1);
        // output [2,5,3,4,6] 
        // modifying any index using set method 
        l1.set( 2, 1);
        System.out.println(l1);
        // output [2,5,1,4,6]
        // remove method 
        l1.remove(4);
        System.out.println(l1);
        // output [2,5,1,4]
        // remove any elments in arraylist
        l1.remove(Integer.valueOf(5));
        System.out.println(l1);
        // output [2,1,4]
        // checking elements exists usingh Contains method
        boolean l2 = l1.contains(Integer.valueOf(5));
        System.out.println(l2);
        // without specify wrapper class 
        // ArrayList<> list = new ArrayList<>();
        // list.add("come");
        // list.add(5);
        // list.add(4.5);
        // System.out.println(list);



    }
    
}
