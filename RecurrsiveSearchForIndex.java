import java.util.Arrays;

public class RecurrsiveSearchForIndex {

    public static int recurrsiveSearch(String keyword, String[] list){
        if(list.length == 0){
            return -1;
        }

        if(keyword == list[list.length-1]){
            return list.length-1;
        }else{
            return recurrsiveSearch(keyword, Arrays.copyOfRange(list,0,list.length-1));
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Hey", "Hello", "There"};
        System.out.println(recurrsiveSearch("Oi",arr));
    }
}
