import java.util.Scanner;

public class transpose2Dmatrix {
     static void printMatrix(int[][] matrix){
         for(int i = 0; i<matrix.length; i++){
           for(int j = 0; j<matrix[i].length; j++){
           System.out.print(matrix[i][j] + " ");
           }
           System.out.println();
     }
    //  System.out.println();
    }
    // static int[][] findtranspose(int[][] matrix ,int r,int c){
    //     int[][] ans = new int[c][r];
    //     for(int i = 0; i<c;i++){
    //         for(int j =0; j<r; j++){
    //             ans[i][j] = matrix[j][i];
    //         }
    //     }
    //     //  printMatrix(ans);
    //      return ans;
    // }
    static void findinplacetranspose(int[][] matrix,int r , int c){
        for(int i = 0; i<r;i++){
            for(int j = i; j<c; j++){
                // swap matrix[i][j] ans matrix[j][i]
                 int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inter row and col value");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("total elnents in array " + r*c );
        for(int i = 0; i<r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original matrix");
        printMatrix(arr);

        // int[][] arr = {{1,2,3},{4,5,6},{9,7,0}};
        // System.out.println("print orginal matrix ");
        // printMatrix(arr);
        //   int[][] ans = findtranspose(arr, r, c);
        findinplacetranspose(arr, r, c);
         System.out.println("Transpose matrix ");
         printMatrix(arr);
        //  printMatrix(ans);

    }
    
}
