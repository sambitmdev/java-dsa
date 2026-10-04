package recursion;

public class R08Hanoi {
    public static void hanoi(int n, String source, String helper, String target) {
        if (n == 0) return;
        hanoi(n-1, source, target, helper);
        System.out.println("Move disk " + n + " from " + source + " to " + target);
        hanoi(n-1, helper, source, target);

    }

    public static void main(String[] args) {
        R08Hanoi.hanoi(3, "RED", "GREEN", "BLUE");
    }
}
