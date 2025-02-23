public class numberOfElementGraterThanK {
    public static void graterathank(int[] arr) {
        int k = 2;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > k) {
                index = i;
            }       
        }
    
        
      if (index > 0) {
        int f = 0;
        for (int i = index-1; i < arr.length; i++) {
            int count = 0;
            for (int j = index-1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
           if (count > f) {
               f = count;
            }
        }
        System.out.println(f);
      } else {
        System.out.println(index);
      }
        
        
        
        
    }
    
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 5, 5 };
        graterathank(arr);
    }
}
