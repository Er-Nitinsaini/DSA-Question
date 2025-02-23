package Array;

public class MajorityElememtinAray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 3, 3, 3,3,3,3,3,3,3,3,3, 4, 4, 4, 5};
        int maxCount = 0;
        int majorityElement = -1;
        int n = arr.length/2;
        int x = 3;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                majorityElement = arr[i];
            }
        }
        if (maxCount > n && majorityElement == x) {
            System.out.println("x appears more than n/2 times in the given array");
        }else{
            System.out.println("x doesn't appear more than n/2 times in the given array");
        }
    }
}
