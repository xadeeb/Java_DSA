public class bubbleSort {

     public static void swapNum(int num1, int num2){

        int temp = num1;
        num1 = num2;
        num2 = temp;


        }
    
    public static void bubble(int arr[]){

       

        for(int i=0;i<arr.length-1;i++){
            for(int j=0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    // swapNum(arr[i], arr[i+1]);
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    public static void print(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {24,56,34,25,12,78,2,1,78};

        bubble(arr);
        print(arr);

        System.out.println();


    }


}
