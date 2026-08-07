import java.util.*;

public class linearSearch {

    public static int linearSearchFn(int arr[], int key) {

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }

        return -1;
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

        System.out.print("Enter Key to search : ");
        int key = sc.nextInt();

        int index = linearSearchFn(array,key);

        if(index != -1){
            System.out.println("Your key is present at index at "+ index);
        }else{
            System.out.println("Your key is NOT present or Key DOES NOT Match. ");
        }


        // for(int i=0;i<array.length;i++){

        // }


    }    
}