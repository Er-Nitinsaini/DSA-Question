package Array;

public class occuringOddNuminArray {
    public static void main(String[] args) {
        
        int[] arr = { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2,4};
        boolean[] proced = new boolean[arr.length];
          
   
        for (int i = 0; i < arr.length; i++) {
            if (proced[i]) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    proced[j] = true;
                }
            }
            if (count % 2 == 0) {
                System.out.println(arr[i]);
                
            }
        }
    }
}
