import java.util.Scanner;

public class searchIn2d {

    public static void search(int arr[][], int key){

        int n = arr.length;
        int m = arr[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == key){
                    System.out.println("Key found at index " + "("+i+","+j+")");
                }
            }
       }
        
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

       search(matrix, 6);


       sc.close();
    }
}
