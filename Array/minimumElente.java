public class minimumElente {
      public static void main(String[] args) {
        
        int[] numbers = {3, 5, 7, 2, 8, 1};
        int max = numbers[0];   
        
        for(int i = 0; i<numbers.length; i++){
            if (numbers[i] < max) {
                max = numbers[i];
            }
        }
        System.out.println("Max Number is : " + max);
    };
    
}