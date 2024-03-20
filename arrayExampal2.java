import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class arrayExampal2 {
 
    //  static void printArray(int[] arr){
    //     for(int i = 0; i<arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();

        
    //  }
    // //  srot an array consisting of only 0 and 1
    // // srot even num and odd num 
    // static void swap(int[] arr ,int i ,int j){
    //     int valu = arr[i];
    //     arr[i]=arr[j];
    //     arr[j] = valu;

    // }
    // static void swapsort(int [] arr){
    //     int n = arr.length;
    //     int left = 0 , right = n-1;
    //     while(right>left){
    //         if(arr[left]%2==1 && arr[right]%2==0){
    //             swap(arr,left,right);
    //             left++;
    //             right--;
    //         }
    //         if(arr[left]%2==1){
    //             left++;
    //         }
    //         if(arr[right]%2==1){
    //             right--;

    //         }
    //     }
    // }

    //  check if the given numm is present in the array or not 
    // static int[] presentarray(int[] arr){
    //     int[] frq = new int[100005];
    //     for(int i =0; i<arr.length; i++){
    //         frq[arr[i]]++;

    //     }
    //     return frq;

    // }
    // // given array k step ratet , where k is non-negatvie
    // // static int[] rotetArray(int[] arr , int k){
    //     int n = arr.length;
    //     k = k%n;
    //     int[] ans = new int[n];
    //     int j = 0;
    //     for(int i = n-k; i<n; i++){
    //         ans[j++] = arr[i];
    //         // j++;
    //     }
    //     for(int i = 0; i< n-k; i++){
    //         ans[j++] = arr[i];
    //         // j++;

    //     }
    //     return ans;
    // } 
    // array revrse using inplace
    // static void SwapInArray(int[] arr , int i , int j){
    //     int value = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = value;
    // }
    // static void reversArray(int[] arr){
    //     int i = 0 , j = arr.length - 1;
    //     while(j>i){
    //         SwapInArray(arr, i, j);
    //         i++;
    //         j--;

    //     }

    // }
    public static void main(String[] args) {

        // array intersection
        int[] arr_1 = {2,3,4,5,6};
        int[] arr_2 = {1,3,2,5,3};
        int a = 0;
        int b = 0;
        for(int i = 0; i<arr_1.length; i++){
            for(int j=0; j<arr_2.length; j++){
               if(arr_1[i] == arr_2[j]){
                a++;
                b++;

               }
                
                // System.out.println();
                else if(arr_1[i] > arr_2[j]){
                    b++;
                }
                else{
                    a++;
                }
            
            }
            
            //  System.out.println("count intersection items " + ans);
        }
        // crerate arraylist using hashset
        /*ArrayList SatA=new ArrayList();
        SatA.add(10);
        SatA.add(20);
        SatA.add(30);
        SatA.add(40);
        SatA.add(50);
        System.out.println("Array A"+SatA);

        ArrayList SatB=new ArrayList();
        SatB.add(10);
        SatB.add(20);
        SatB.add(60);
        SatB.add(70);
        SatB.add(80);
        System.out.println("Array B"+SatB);
//      HashSet<Integer> set=new HashSet<>();
        LinkedHashSet<Integer> set =new LinkedHashSet<>();
        set.add((Integer) SatA.get(0));
        set.add((Integer) SatA.get(1));
        set.add((Integer) SatA.get(2));
        set.add((Integer) SatA.get(3));
        set.add((Integer) SatA.get(4));
        set.add((Integer) SatB.get(0));
        set.add((Integer) SatB.get(1));
        set.add((Integer) SatB.get(2));
        set.add((Integer) SatB.get(3));
        set.add((Integer) SatB.get(4));
        System.out.println("INTERSECTION of two Arrays:");
        System.out.println(set);*/

    
        // HashSet <String> set = new HashSet <String>();
        // set.add("rohan");
        // set.add("ram");
        // set.add("rohan");
        // // System.out.println(set);
        // System.out.println(set.size());
        // System.out.println(set.clone());
        // set.clear();



        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter array size ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Array size " + n + " elments");
        // for(int i = 0; i<n; i++){
        //     arr[i] = sc.nextInt();
            // System.out.print(arr[i] + " ");
        // }
        // int[] frq = presentarray(arr);


        //  System.out.println("Enter k: ");
        //  System.out.println("Enter quries");
        //  int k = sc.nextInt();
        //  while(k>0){
        //     System.out.println("Enter num to be surched ");
        //      int x = sc.nextInt();
        //      if(frq[x] > 0){
                
        //          System.out.println("YES");

        //      }else{
        //          System.out.println("NO");
        //      }
        //      k--;
        //  }
        // //  k--;
        //  System.out.println("original array : ");
        //  printArray(arr);
        //  swapsort(arr);

        // int[] frq = presentarray(arr);
        //  System.out.println(" array After sort  ");
        //  swapsort(arr);
        //  printArray(arr);
        //  swapsort(arr);
        //  swap(arr);
        // printArray(frq);
        //  int[] arr = {2,3,4,5,1,6};
        // reversArray(arr);
        // printArray(arr);
        // reverse array num
        // int[] arr = {2,3,4,5,6};
        // for(int i = arr.length-1; i>=0; i--){
        //     // System.out.print("reverse array ");
        //     System.out.print(arr[i] + " " );
        // }

        
    }
    
}
