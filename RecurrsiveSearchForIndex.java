import java.util.Arrays;

public class RecurrsiveSearchForIndex {

    public static int recurrsiveSearch(String keyword, String[] list){
        if(list.length == 0){
            return -1;
        }

        if(keyword == list[0]){
            return list.length;
        }else{
            return recurrsiveSearch(keyword, Arrays.copyOfRange(list,1,list.length));
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Hey", "Hello", "There"};
        System.out.println(recurrsiveSearch("There",arr));
    }
}
