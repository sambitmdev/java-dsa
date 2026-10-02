package recursion;

public class R04SumOfDigits {
    public static int sumOfDigits(int n) {

        if (n == 0)
            return 0;

        return (n%10) + sumOfDigits(n/10);
    }

    public static void main(String[] args) {
        System.out.println(R04SumOfDigits.sumOfDigits(987654321));
    }
}
