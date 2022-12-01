import java.util.Arrays;

// Find Largest/ Smallest Number in the array
// Swap position of that number to current position of the loop
// Repeat
public class SelectionSort {
    public static void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int currMin = i;
            for (int j = i; j < arr.length; j++){
                if(arr[j]< arr[currMin]){
                    currMin = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[currMin];
            arr[currMin] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {20, -22, -5, 7, 55, 1, -15};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
