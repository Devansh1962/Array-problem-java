import java.util.Scanner;

public class rectanglesumMatrix {
    // first method 
    // BRUTE FORCE METHOD
//     static int FindRectanglesum(int[][] matrix, int l1, int r, int l2,int r2){
//     int sum = 0;
//     for(int i = l1; i <= l2; i++){
//         for(int j = r; j <= r2; j++){
//             sum += matrix[i][j];
//         }
//     }
//     return sum;
// }
// 2nd method
//  calculating horigental for each row 
static void preffixsum(int[][] matrix){
    int r = matrix.length;
    int c = matrix[0].length;
    for(int i = 0; i<r; i++){
        for(int j = 1; j<c; j++){
            matrix[i][j] += matrix[i][j-1];
        //     matrix[i][j] += matrix[i-1][j];
         }
    }
    // CALCULATING COLUMS WISE EACH COLUM 
    for(int j = 0; j<c; j++){
        for(int i = 1; i<r; i++){
            matrix[i][j] += matrix[i-1][j];

        }
    }
}
static int findrectanglesum(int[][]matrix, int l1, int r, int l2, int r2){
    int sum = 0; 
    preffixsum(matrix);
    for(int i = l1; i<=l2; i++){
        // r and r2 sum
        if(r>=1){
            sum += matrix[i][r2] - matrix[i][r -1];
        }
        else{
        sum += matrix[i][r2];
    }
}
return sum;

}
// 3rd method 
// prefixsum over columns and rows both
static int FINDractangleSum(int[][] matrix,int l1, int r, int l2, int r2){
    int ans = 0,totalsum = 0, upmatrix = 0, downmatrix = 0, commanmatrix = 0;
    preffixsum(matrix);
    totalsum = matrix[l2][r2];
    if(l1 >= 1){
        upmatrix = matrix[l1-1][r2];
    }
    if(r >= 1){
        downmatrix = matrix[l2][r-1];

    }
    if(l1 >= 1 && r >= 1){
        commanmatrix = matrix[l1-1][r-1];
    }

    ans = totalsum - upmatrix - downmatrix + commanmatrix;
    return ans;

    

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and colum num ");
        int r1=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix = new int[r1][c];
        System.out.println("total num in ARRAY " + r1*c);
        for(int i = 0; i<r1; i++){
            for(int j = 0; j<c; j++){
                matrix[i][j] = sc.nextInt();

            }
        }

        System.out.println("enter coordinates ");
        System.out.print("l1" );
        int l1 = sc.nextInt();
        System.out.print("r ");
        int r = sc.nextInt();
        System.out.print("l2 ");
        int l2 = sc.nextInt();
        System.out.print("r2 ");
        int r2 = sc.nextInt();
        // System.out.println("Rectangle sum " + findRectanglesum(matrix, l1, r, l2, r2));
        // System.out.println("rectangle sum " + findrectanglesum(matrix, l1, r, l2, r2));
        System.out.println("ractangle sum " + FINDractangleSum(matrix, l1, r, l2, r2));
    }
}
