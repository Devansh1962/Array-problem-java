import java.util.Scanner;

public class rotetmatrix {
     static void printMatrix(int[][] matrix){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
     }
    static void findinplacetranspose(int[][] matrix, int r, int c){
        // swap matrix[i][j] and matrix[j][i]
        for(int i = 0; i<r; i++){
            for(int j = i; j<c; j++){
             int temp = matrix[i][j]; 
             matrix[i][j] = matrix[j][i];
             matrix[j][i] = temp;

            }
        }
    }
    static void reversArray(int[] arr){
        int n = arr.length;
        int i = 0, j = n-1;
        while (j > i){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            
        

        }
    }
    static void rotet(int[][] matrix , int n){
        findinplacetranspose(matrix, n, n);
        for(int i = 0; i<n; i++){
            reversArray(matrix[i]);

        }
        // reversArray(null);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and colum size ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr_1 = new int[r][c];
        System.out.println("total elments in array " + r*r);
        for(int i = 0; i<r; i++){
            for(int j = 0; j < c; j++){
                arr_1[i][j] = sc.nextInt();

            }
        }
        System.out.println("ORIGINAL ARRAY ");
        printMatrix(arr_1);

        rotet(arr_1, c);
        System.out.println("ROTATION OF MATRIX");
        printMatrix(arr_1);
        
    }


    
}
