package Array;

public class firstReapetingElementinArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,4};
        System.out.println("RepetingElement:" + reapetingElement(arr));
    }

    public static int reapetingElement(int[] arr){
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = index; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                   return arr[i]; 
                }
            }
            index++;
        }
          return 0;
    }
}
