import java.util.*;

public class binarySearch {

    public static int binarySrch(int arr[], int key){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = (start + end)/2;

            //comperisions

            if(arr[mid] == key){
                return mid;

            }if(arr[mid] < key){  //right condition
                return start = mid +1;

            }else{   //left condition
                return end = mid - 1;
            }
        }

        return -1;
    }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // defining array size
        
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();


        // defining array
        int array[] = new int[size];

        System.out.println("\nEnter the "+size+" elements of Arrays :)");

        // taking the element of array as input
        for(int i=0;i<array.length;i++){
            System.out.print("Enter the "+(i+1)+"st elenert of array : ");
            array[i] = sc.nextInt();
        }


        System.out.print("\nEnter the key to find : ");
        int key = sc.nextInt();
        

        // output

        int result = binarySrch(array, key);

        if(result != -1){
            System.out.println("\nElement found at index " + result);
        }else{
            System.out.println("Key NOT FOUND");
        }


        System.out.println();
        System.out.println(":)");
        System.out.println();

        sc.close();
    }
}
