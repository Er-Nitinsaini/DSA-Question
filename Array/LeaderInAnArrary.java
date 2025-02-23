import java.util.ArrayList;
public class LeaderInAnArrary {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> Leader = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    break;
                }
            }
           if (j == arr.length) {
              Leader.add(arr[i]);
           }
        }
        System.out.println(Leader);
    }
}
