package arrays;

public class Q01MaximumElementInArray {
    public static void main(String[] args) {
       int maxValue1=  findMaxElement(new int[]{-56,-99,-10,-20,-11,-24,-32,-7,-31,-55});
        System.out.println("Biggest Number in : "+maxValue1);
        int maxValue2=  findMaxElement(new int[]{56,99,10,20,11,24,32,7,31,55});
        System.out.println("Biggest Number in : "+maxValue2);
        int maxValue3=  findMaxElement(new int[]{-56,99,-10,20,-11,-24,32,7,0,-31,55});
        System.out.println("Biggest Number is : "+maxValue3);
        int maxValue4=  findMaxElement(new int[]{50,50,50,50});
        System.out.println("Biggest Number is : "+maxValue4);
        int maxValue5=  findMaxElement(new int[]{50});
        System.out.println("Biggest Number is : "+maxValue5);
        int[] ar = new int[0];
        int maxValue6=  findMaxElement(ar);
        System.out.println("Biggest Number is : "+maxValue6);
    }
    public static int findMaxElement(int[] arr){
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array cannot be empty or blank");
        }
        int biggest = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i] > biggest){
                biggest = arr[i];
            }
        }
        return biggest;
    }
}
