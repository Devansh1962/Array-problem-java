import java.util.Scanner;

public class PRINTspiralmatrix {
    static void printMatrix(int[][] matrix){
        for(int i= 0; i<matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void printspiral(int[][] matrix,int r,int c){
        int topRow = 0, lastColum = c - 1, lastRow = r -1, firstColum = 0;
        int totalelments = 0;
        while(totalelments < r*c){
            // topRow - 1STcolum to lastcolum
            for(int j = firstColum; j <= lastColum && totalelments < r*c ; j++){
                // totalelments++;
                System.out.print(matrix[topRow][j] + " ");
                totalelments++;


            }
            topRow++;

            // lastcolum - toprow to lastrow 
            for(int i = topRow; i <= lastRow && totalelments < r*c ; i++){
                // totalelments++;
                System.out.print(matrix[i][lastColum] + " ");
                totalelments++;

        } 
        lastColum--;

        // lastrow - lastcolum to 1stcolum 
        for(int j = lastColum; j >= firstColum && totalelments < r*c ; j--){
                // totalelments++;
                System.out.print(matrix[lastRow][j] + " ");
                totalelments++;

        }
        lastRow--;

        // firstcolum - lastrow to toprow
        for(int i = lastRow; i >= topRow && totalelments < r*c ; i--){
                // totalelments++;
                System.out.print(matrix[i][firstColum] + " ");
                totalelments++;


        } 
        firstColum++; 
        
    }

    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and colum size ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr_1 = new int[r][c];
        System.out.println("total elments in array " + r*c);
        for(int i = 0; i<r; i++){
            for(int j = 0; j < c; j++){
                arr_1[i][j] = sc.nextInt();

            }
            // System.out.println("print original matrix ");
            // printMatrix(arr_1);

            // printspiral(arr_1, r, c);
            // System.out.println("print sprial matrix");
            // printspiral(arr_1, r, c);
            // printMatrix(arr_1);
        }
        System.out.println("print original matrix ");
             printMatrix(arr_1);

        System.out.println("print sprial matrix");
            printspiral(arr_1, r, c);

   }

}

