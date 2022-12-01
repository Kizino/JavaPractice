public class Function {
    public static int factorial(int number){
        if(number == 0){
            return 1;
        }

        return factorial(number-1) * number;
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
