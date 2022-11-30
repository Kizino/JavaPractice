import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given a non-empty list of integers, return the contiguous subsequence with the highest sum:
 * For example, given a list of integers, like:
 * [1, 0, 3, -8, 4, -2, 3] => [4, -2, 3] which sums to 5
 * [1, 0, 3, -8, 4, -2, 3, -2] => [4, -2, 3] which sums to 5
 * [1, 0, 3, -8, 19, -20, 4, -2, 3, -2] => [19]
 * For ties, return the first one:
 * [2, 2, -10, 1, 3, -20] => [2, 2] is first [1, 3] is later
 * Return the shortest version:
 * [2, -2, 3, -1] => [3] as opposed to [2, -2, 3]
 * If list is all negatives, return an empty list as a result
 * [-1, -2] => []
 */

public class Main {
    public static List<Integer> func(int[] data){
        int sum;

        Map<String, Integer> finalMap = new LinkedHashMap<>();
        for(int i = 0; i < data.length; i++) {
            sum = data[i];
            finalMap.put(i + ":" + i, sum);
            for (int j = i + 1; j < data.length; j++) {
                sum = sum + data[j];
                finalMap.put(i +":" + j, sum);
            }
        }

        int highest = Collections.max(finalMap.values());
        List<String> resultList = new ArrayList<>();

        finalMap
                .entrySet()
                .stream()
                .filter(item -> item.getValue() == highest)
                .forEach(item -> resultList.add(item.getKey()));

        System.out.println(resultList);
        int begin = Integer.parseInt(resultList.get(0).split(":")[0]);
        int end = Integer.parseInt(resultList.get(0).split(":")[1]);

        if(begin == end){
            return Arrays.asList(data[begin]);
        }else{
            // Get a slice of array
            int[] dataSlice = Arrays.copyOfRange(data, begin,end + 1);
            // Convert from int[] to List<Integer>
            return IntStream.of(dataSlice).boxed().collect(Collectors.toList());
        }

    }
    public static void main(String[] args) {
//        int[] data = {1, 0, 3, -8, 4, -2, 3}; // => [4, -2, 3]
//        int[] data = {1, 0, 3, -8, 4, -2, 3, -2}; // => [4, -2, 3]
//        int[] data = {2, 2, -10, 1, 3, -20}; // => [2, 2]
//        int[] data = {1, 0, 3, -8, 19, -20, 4, -2, 3, -2}; //=> [19]
//        int[] data = {-1, -2};
        int[] data = {2, -2, 3, -1};
        System.out.println(func(data));
    }
}
