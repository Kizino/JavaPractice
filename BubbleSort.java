import java.util.Arrays;

public class BubbleSort {
    public static void BubbleSort(int[] arr){
        int unsortedPartitionIndex = arr.length;
//        int step = 0;
        while(unsortedPartitionIndex > 0){
            for (int i = 0; i < unsortedPartitionIndex- 1; i++) {
                int temptValue;
                int currentValue = arr[i];
                int nextValue = arr[i + 1];

                if (currentValue > nextValue) {
                    temptValue = nextValue;
                    arr[i + 1] = currentValue;
                    arr[i] = temptValue;
                }
//                step++;
//                System.out.println(step + " - " + Arrays.toString(arr));
            }
            unsortedPartitionIndex--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        System.out.println(Arrays.toString(arr));
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
