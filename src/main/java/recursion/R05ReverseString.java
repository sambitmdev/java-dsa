package recursion;

public class R05ReverseString {
    public static String reverse(String str){
        if (str.length() <= 1)
            return str;
        return str.charAt(str.length()-1) + reverse(str.substring(0,str.length()-1));
    }

    public static void main(String[] args) {
        System.out.println(R05ReverseString.reverse(""));
    }
}
// TC = O(n²) — n calls, each substring costs O(n)
// SC = O(n²) — n string objects created, each up to size n