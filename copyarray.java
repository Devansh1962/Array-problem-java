// import java.util.Arrays;
import java.util.Scanner;

public class copyarray {
    // check if given array is sorted or not 
    // create method 
    static boolean sortedarry(int[]arr){
        boolean check = true;

        for(int i = 1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                check = false;
                break;
                // System.out.println("array is sorted");
                
            }
            // else{
                // System.out.println("not sorted");
            // }
        }
        return check;


    }
    
    // static int printcount(int[] arr ,int x){
        //  int count = 0;
    //    int lastindex = -1;
           
        // for(int i = 0; i< arr.length; i++){
            // if(arr[i]>x){
                // count++;
            // }
            // if(arr[i] == x){
                // count++;
                // lastindex = i;
            // }
            // System.out.println(arr[i]);
        // }
        //  return count;
        // return lastindex;


    // static void printArray(int[] arr){
    //     for(int i = 0; i < arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();

    //     // int[] arr = new int[4];
    //  }

    public static void main(String[] args) {
        // printcount(null, 0);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elements");
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // System.out.println("enter x : ");
        // int x = sc.nextInt();
        // System.out.println("enter x : ");
        // printcount();
        //  System.out.println("count of x " + printcount(arr, x));
        // System.out.println("last vale = x " + printcount(arr, x));
        System.out.println("sorted or not :" + sortedarry(arr));
                

         // int[] arr = new int[4];
        // arr[0] = 1;
        // arr[1]=  2;
        // arr[2] = 5; 
        // arr[3] = 7;
        // System.out.println("ORGINAL ARRAY :");
        // printArray(arr);

        // taking copy array 
        // int[] arr_2 =arr.clone();
        // or
        //  int[] arr_2 =Arrays.copyOf(arr, arr.length);
        // or
        // int[] arr_2 = Arrays.copyOfRange(arr,from1, to 3);
        // System.out.println("COPY ARRAY :");
        // printArray(arr_2);

        // // chaning some value ARR_2 
        // arr_2[0] = 2;
        // arr_2[1] = 9;
        // arr_2[2] = 11;
        // System.out.println("ORGINAL ARRAY AFTER CHANIG ARR_2 :");
        // printArray(arr);
        // System.out.println("AFTER CHAING ARRAY_2 : " );
        // printArray(arr_2);
    
 
         
    }


    
}
