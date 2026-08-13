public class selectionSort {

    public static void slectionSort1(int arr[]){

        for(int i=0;i<arr.length-1;i++){

            int minPos = i;

            for(int j=i+1;j<arr.length-1;j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void print(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    // main function
    public static void main(String[] args) {

    
        int arr[] = {24,56,34,25,12,78,2,1,78};

        slectionSort1(arr);

        print(arr);
        System.out.println();
    }

}
