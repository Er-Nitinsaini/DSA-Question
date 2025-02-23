public class sumOfArrayLeftEqualRight {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,0};
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
        }

        for (int i = 4 ; i < arr.length; i--) {
            leftSum = leftSum-arr[i];
            rightSum += arr[i];
            if () {
                
            } else {
                
            }
            
        }
    }
}
