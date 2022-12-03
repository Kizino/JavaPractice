import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Function {
    /**
     * Count the number of items in a list using recursion. No loops allowed.
     *
     * Some examples:
     * [] => 0
     * [1, 2, 3] => 3
     * [0, 1, 2] => 3
     * [21, 22, 23, 21, 21, 21, 22] => 7
     */

    public static int countUsingStack1(Stack input, int i){
        if(input.empty()){
            return i;
        }
        input.pop();
        return countUsingStack1(input, i+1);
    }

    public static int countUsingStack2(Stack input){
        int i = 0;

        if(input.empty()){
            return i;
        }

        input.pop();
        return countUsingStack2(input) + 1;
    }

    public static int countUsingList(List<Integer>input){
        int i = 0;
        if(input.isEmpty()){
            return i;
        }

        input.remove(0);

        return countUsingList(input) + 1;
    }

    public static void main(String[] args) {
//        Stack input = new Stack();
//        input.add(1);
//        input.add(2);
//        input.add(3);
//        System.out.println(countUsingStack2(input));

        List<Integer> input2 = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(countUsingList(input2));
    }
}
