import java.util.ArrayList;
public class findDuplicatNumberinArray {

    public static void main(String[] args) {
        int[] array = {1,2,2,3,4,5,6,6,7,7,8,9};
        ArrayList<Integer> numbers = new ArrayList<>();
        int comparedNumber = array[0];

        for(int i = 1; i < array.length; i++){
            if (array[i] ==  comparedNumber) {
                numbers.add(array[i]);
                numbers.add(comparedNumber);
                System.out.println("Last Index  : " + i);
            }else{
                comparedNumber = array[i];
            }
        }
        System.out.println("Duplicate Number Is : " + numbers);
    }
}
