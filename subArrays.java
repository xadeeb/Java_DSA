public class subArrays {

    public static void subArray(int arr[]){

        int sum = 0;

        for(int i=0;i<arr.length;i++){

            

            for(int j=i;j<arr.length;j++){
                
                System.out.print("[ ");
                for(int k=i;k<=j;k++){

                    System.out.print(arr[k] +  "  ");
                    
                }
                sum++;

                System.out.println("]");
            }
            System.out.println();

            
        }
        System.out.println("Total numbers of subArrays are " + sum);
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
