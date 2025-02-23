public class findThirdLargestNUmber {

    public static int largestNubmer(int[] arr){
         int firstLargestNumber = arr[0];
         int secondLargestNumber= arr[0];
         int thirdLargestNumber = arr[0];

         for (int i = 1; i < arr.length; i++) {
            if (arr[i] > firstLargestNumber) {
                 firstLargestNumber = arr[i];
            }
            
         }
         for (int i = 1; i < arr.length; i++) {
            if (arr[i]> secondLargestNumber && arr[i] != firstLargestNumber) {
                secondLargestNumber = arr[i];
           }
         }
         for (int i = 1; i < arr.length; i++) {
            if (arr[i]> thirdLargestNumber && arr[i] < secondLargestNumber) {
                thirdLargestNumber = arr[i];
           }
         }
         return thirdLargestNumber;
        
    }
    public static void main(String[] args) {
        int[] arr = {1, 14, 2, 16, 10, 20};
        System.out.println(largestNubmer(arr));
    }
}
