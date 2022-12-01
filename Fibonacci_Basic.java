public class Function {
    public static long fibonacci(int number){
        if(number <= 1){
            return number;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {
        for(int i= 0; i <= 6; i++){
            System.out.println(fibonacci(i));
        }
    }
}
