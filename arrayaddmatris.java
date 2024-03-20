// import javax.print.DocFlavor.STRING;

import java.util.Scanner;

public class arrayaddmatris{
    // two value a and b swap the two given value using sum and differnse
    static void sumdiffswap(int a , int b){
        System.out.println("orginal value ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        // mathmatical logiuc 
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("orginal value ");
        System.out.println("a : " + a);
        System.out.println("b :" + b);
    // given two int num a ans b swap the two given value using temporay varibles
    // static void swap(int a , int b){
        // System.out.println("orginal value ");
        // System.out.println("a :" + a);
        // System.out.println("b :" + b);
        // inislize varibles 
        // int value = a;
        // a = b;
        // b = value;
        // System.out.println("After swap ");
        // System.out.println("a :" + a);
        // System.out.println("b :" + b);
    } 

    //   count first ripited elments in array
    // static int firstripetedvalue(int[] arr){
    //     int n = arr.length;

    //     for(int i = 0; i < n; i++){
    //         for( int j = i+1; j < n; j++){
    //             if(arr[i] == arr[j]){
    //                 return arr[i];
    //             }
    //         }
    //     }
    //     return -1;

    // }
     public static void main(String[] args) {
        sumdiffswap(6, 7);
        // int a = 5;
        // int b = 8;
        // System.out.println("After swap ");
        // swap(4, 9);
    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("Enter array size ");
    //    int n = sc.nextInt();
    //    int[] arr =new int[n];
    //    System.out.println("enter array num ");
    //    for(int i = 0; i<n; i++){
    //     arr[i] = sc.nextInt();
    //    }
    //    System.out.println("count ripited v alue " + firstripetedvalue(arr));


    // // COUNT MAX VALUE IN ARRAY 
    //    System.out.println("Enter array size ");
    //    int n = sc.nextInt();
    //    int[] arr = new int[n];
    //    int ans = 0;
    //    System.out.println("enter array num ");
    //    for(int i = 0; i<arr.length; i++){

    //     arr[i] = sc.nextInt();
    //     if(arr[i] > ans){
    //         ans = arr[i];
    //         // ans++;
    //         // System.out.println(" vale " + ans);
    //     }
    //     //  System.out.println("copunt max value " + ans);

        // for(int j = i+1; j<arr.length; j++){
        //     arr[i] = sc.nextInt();
        //     // arr[j] = sc.nextInt();
        //     if(arr[i] == arr[j]){

        //         // System.out.println("count repited value " + arr[i]);
        //     }
        //     // System.out.println(arr[i]);
        // }
        
        // System.out.println("count ripeted valure " + arr[i]);

    //    }
        // System.out.println("count max vaLIUE " + ans);
    //    System.out.println(arr[i]);

 // find total num of pairs in the array whose sum is equal to 
 
        // System.out.println("ENTER TARGET NUM ");
        // int target = sc.nextInt();
        // System.out.print("ENTER ARRAY SIZE " + " ");
        // int num = sc.nextInt();
        // int[] arr = new int[num];
        
        // // System.out.print("ENTER TARGET NUM " + " ");
        // // int target = sc.nextInt();
        // int ans = 0;
        // System.out.println("enter array num ");
        // for(int i = 0; i<arr.length; i++){
        //       arr[i] = sc.nextInt();
        //     for(int j = i+1; j<arr.length; j++){
        //             // arr[i] = sc.nextInt();
        //         //    arr[j] = sc.nextInt();

        //         if(arr[i] + arr[j] == target){

   
        //             ans++;
        //             // System.out.println(ans);
        //         }
        //     }
        //     //  System.out.println(ans);
        // }
        //  System.out.println("NUM OF PAIRS IN SUM " + ans); 
        // // add two matrix 
        // /*int[][] b = {{1,2},{4,5}};
        // int[][] c = {{2,5},{6,8}};
        // int[][] g = new int[2][2];
        // for(int i=0;i<b.length;i++){
        //     for(int j =0; j<c.length; j++){
        //         g[i][j] = b[i][j] + c[i][j];
        //         System.out.print(g[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();*/
        // write a program reverse string 
        // String charcter = "Good Looking";
        // String rev = "";
        // for(int i = charcter.length()- 1; i>=0; i--){
        //     rev = rev + charcter.charAt(i);

        // }
        // System.out.println("orginal string " + charcter);
        // System.out.println("revers srtring " + rev);
    }
}
