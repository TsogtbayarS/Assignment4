public class prob1 {
    static int reverse = 0;
    public static int reverseDigit(int digit){
        if(digit != 0){
            reverse = reverse * 10 + digit % 10;
            reverseDigit(digit / 10);
        }
        return reverse;
    }

    public static void main(String[] args) {
        int a = reverseDigit(123);
        System.out.println(a);

    }
}
