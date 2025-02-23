package Array;

public class e {
    public static void main(String[] args) {
         int[] number = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 8}; 
         int element = findUnique(number); 
         System.out.println("The element that appears only once is: " +element);

    }
    public static int findUnique(int[] number) { 
        int result = 0; 
        for (int i = 0; i < number.length; i++) { 
            result ^= number[i];
         }
         return result; 
        }// XOR operation to find the unique element } return result;
}
