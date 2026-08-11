public class subArrays {

    public static void subArray(int arr[]){

        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){
                
                System.out.print("[ ");
                for(int k=i;k<=j;k++){

                    System.out.print(arr[k] +  "  ");

                }

                System.out.println("]");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        

        int arr[] = {12,34,35,67,50,60,47};

        // the arrays is always pass in the functions by refrence :)
        subArray(arr);

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        // }

    }
    

}
