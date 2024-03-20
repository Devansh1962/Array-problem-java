import java.util.Scanner;

public class multidimensitionarray{
    // create method 
    static void printArray(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " "); 
                
            }
            System.out.println(); 
        }
    }
    public static void main(String args[]){
        //  take user input 2D array
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter rows ");
        int r = sc.nextInt();
        System.out.println("enter colmes ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("NO OF ELMENTS IN ARRAY " + r*c);
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                 arr[i][j] = sc.nextInt();


            }

        }
        printArray(arr);
        // declear 2D array
        /*  int[][] a = new int[2][3];
        a[0][0] = 1;
        a[0][1] = 3;
        // declear 2d array 2nd method 
        int[][] arr2 = {{1,2,3},{4,5,6},{11,4,55,2,7}};
        System.out.println(arr2[0][2]); 
        printArray(arr2);*/
    }
}