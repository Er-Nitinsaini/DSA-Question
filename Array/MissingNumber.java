package Array;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9,10};
        int n = 10;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        
        int expected_sum = (n*(n+1))/2;

        int missing_Number = expected_sum - sum;
        System.out.println("Missing Number Is :" + missing_Number);
    }
}
