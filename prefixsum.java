import java.util.Scanner;

public class prefixsum {
    // ek arry given hai use do subarray me bat diya jata hai us dono array ka sum equals hona chahiye 
    static int findarrysum(int [] arr){
        int totalsum = 0;
        for(int i = 0; i<arr.length; i++){
            totalsum += arr[i];
        }
        return totalsum;
    }
    static boolean equalsumpartition(int [] arr){
        int totalsum = findarrysum(arr);
        int priffixsum = 0;
        for(int i = 0; i<arr.length; i++){
            priffixsum += arr[i];
            int suffixsum = totalsum - priffixsum;
            if(priffixsum == suffixsum){
                return true;
            }
        }
        return false;
    }
    // given array of int of size n ans q quresi print ramge saum given range 
   /* / static int[] preffixsum(int[] arr){
        for(int i = 1; i<arr.length; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }*/
/*static void printArray(int[] arr){
    for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    
    }
    System.out.println();
    
  }

static int[] prefixadd(int[] arr){
    int  n = arr.length;
    int[] prefix = new int[n];
    prefix[0] = arr[0];
    for(int i = 1; i< n; i++){
        prefix[i] = prefix[i-1] + arr[i];
    }
    return prefix;
  }*/



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Array size " + n + " elments");
         for(int i = 0; i<n; i++){
             arr[i] = sc.nextInt();
            // System.out.print(arr[i] + " ");
         }
         System.out.println("Equal partition passible : " + equalsumpartition(arr));
        //  System.out.println("ORGINAL ARRAY ");
        //  printArray(arr);
        //  int[] prefix = prefixadd(arr);
        // int[] prefix = preffixsum(arr);
        // System.out.println("Enter no of quries ");
        // int q = sc.nextInt();
        // while(q-- > 0){
        //     System.out.println("Enter range ");
        //     int r = sc.nextInt();
        //     int l = sc.nextInt();
        //     int ans = prefix[r] - prefix[l-1];
        //     System.out.println("SUM : " + ans);

        // }

        //  System.out.println("After prefix sum ");
        //  printArray(prefix);
        // int[] frq = presentarray(arr);
        /* / int [] arr = {2,3,4,5,6,7};
        // given num int of size n . range l to r given by 
        int r = 3;
        int l = 1;
        int sum = 0;
        for(int i = l; i<=r; i++){
             sum += arr[i];
        }
        System.out.println("total sum under range " + sum);*/

        // Scanner sc =new Scanner(System.in);
        // preffix sum and suffix sum 
        /*int n = arr.length;
        int [] suffixsum = new int[n];
        suffixsum[n-1] = arr[n-1];
        // int[] prefix = new int[n];
        // prefix[0] = arr[0];
        // for(int i = 1; i < n; i++){
            for(int i = n-2; i>=0; i--){
                suffixsum[i] = suffixsum[i+1] + arr[i];

        
            //  prefix[i] = prefix[i-1] + arr[i];
            // System.out.println(prefix[i]);
        }
        for(int i = 0 ; i< n; i++){
            //  System.out.print(prefix[i] +  " ");
            System.out.print(suffixsum[i] + " ");
         }
        
         System.out.println();*/
        
    }
}
    

