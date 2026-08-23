import java.util.Scanner;

public class searchIn2d {

    public static void search(int arr[][]){

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
       int matrix[][] = new int[3][3];

       int n = matrix.length;
       int m = matrix[0].length;

       //to take input of a matrix

       for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
       }

       // to print matrix

       for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }

            System.out.println();
       }


       sc.close();
    }
}
