public class maxSubArraySum {


    public static void bruteForce(int arr[]){

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){

                //important to reset the sum
                currentSum = 0;

                for(int k=i;k<=j;k++){

                    currentSum += arr[k];
                    
                }
                System.out.println(currentSum);

                if(maxSum < currentSum){
                    maxSum = currentSum;
                }

                System.out.println();
                
            }
            System.out.println("===========");

            
        }
        System.out.println("Maximum sum of sub Array is " + maxSum);

    }


    public static void main(String[] args) {
        

        int arr[] = {1, -2, 6, -1, 3};

        bruteForce(arr);

        
    }
}
