import java.util.Scanner;

public class largestInArray {

    public static int largest(int arr[]){

        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i] > max){
                max = arr[i];
                
            }
            
        }

        return max;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();

        int array[] = new int[size];


        System.out.println("Enter the "+size+" elements of Arrays :");

        for(int i=0;i<array.length;i++){
            System.out.print("Enter the "+(i+1)+"st elenert of array : ");
            array[i] = sc.nextInt();
        }

        System.out.println(largest(array));




        sc.close();

    }
    
}
