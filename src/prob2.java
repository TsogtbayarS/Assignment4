public class prob2 {
    static int count = 0;
    public static int countDigit(int n){
        if(n != 0 ){
            count++;
            countDigit(n/10);
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countDigit(789));
    }
}
