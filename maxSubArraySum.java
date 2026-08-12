public class maxSubArraySum {

// by brute force method with time complexity n^2
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
        System.out.println("Maximum sum of sub Array using brute force is " + maxSum);

    }


    public static void prefixSum(int arr[]){

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        // calculate prefix 
         for(int i=1;i<prefix.length;i++){

            prefix[i] = prefix[i-1] + arr[i];

         }

        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){

                //important to reset the sum
                
                currentSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(maxSum < currentSum){
                    maxSum = currentSum;
                }

                // System.out.println();
                
            }
            

            
        }
        System.out.println("Maximum sum of sub Array using prefix sum is " + maxSum + ".");

    }


    public static void main(String[] args) {
        

        int arr[] = {1, -2, 6, -1, 3};

        // using brute fouce
        bruteForce(arr);
        
        System.out.println("===================================================================");

        // using prefix sum
        prefixSum(arr);

        System.out.println();
        
    }
}
