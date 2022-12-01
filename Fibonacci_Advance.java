public class Function {

    private static long[] fibonacciCache;

    public static long fibonacci(int n){
        if(n <= 1){
            return n;
        }

        if(fibonacciCache[n] != 0){
            return fibonacciCache[n];
        }

        long nthFinbonacciNumber = fibonacci(n - 1) + fibonacci(n - 2);
        fibonacciCache[n] = nthFinbonacciNumber;

        return nthFinbonacciNumber;
    }

    public static void main(String[] args) {
        int n = 50;

        fibonacciCache = new long[n+1];

        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));

        //Print out the sequence
        for(int i = 0; i <= n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}
