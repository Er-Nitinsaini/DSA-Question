public class frequencyGraterEgualARRLEN {
    
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,3};
        int n = arr.length;
        int f = 1;
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > f) {
                f = count;
                if (f >= n/2) {
                    System.out.println(arr[i]);
                }else{
                    System.out.println("hai kon tu");
                }
            }
           
        }
        
        
    }
}
