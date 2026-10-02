package recursion;

public class R06Power {
    // TC = O(n)
    // SC = O(n)
    public static double power(double base, int power) {
        if (power == 0)
            return 1;
        return (base) * power(base,power-1);
    }

    // TC = O(log n) , SC = O(log n)
    public static double powerOptimised(double base, int power){
        if (power == 0)
            return 1;
        double half = powerOptimised(base, power / 2);
        if (power %2 == 0)
            return half * half;
        else
            return base * half * half;
    }

    public static void main(String[] args) {
        System.out.println( R06Power.powerOptimised(2,6));
    }

}
