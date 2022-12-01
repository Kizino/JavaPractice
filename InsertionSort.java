import java.util.Arrays;

// Find Largest/ Smallest Number in the array
// Swap position of that number to current position of the loop
// Repeat
public class InsertionSort {
    public static void sort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int tmpValue = arr[i];
//            System.out.println(tmpValue);
            System.out.println("");
            int j;

            for(j = i; j > 0 && arr[j - 1] > tmpValue; j--){
//                System.out.print(arr[j] + " ");
                arr[j] = arr[j-1];
            }

            arr[j] = tmpValue;
        }
    }

    public static void main(String[] args) {
        int[] arr = {20, -22, -5, 7, 55, 1, -15};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
