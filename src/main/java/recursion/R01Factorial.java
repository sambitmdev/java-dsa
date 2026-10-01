package recursion;

public class R01Factorial {
    public static int factorial(int n){
        if (n == 0)
            return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int factorial = R01Factorial.factorial(5);
        System.out.println(factorial);
    }
}

