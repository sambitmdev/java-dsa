package recursion;

public class R02PrintNumbers {
    public static void printNums(int start,int end){
        if (start > end){
            return;
        }
        System.out.println(start);
        printNums(start + 1,end);
    }

    public static void main(String[] args) {
        R02PrintNumbers.printNums(1,25);
    }
}
