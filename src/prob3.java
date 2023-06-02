public class prob3 {
    static int[] array = {1,2,3,4,5};

    static int pointer = 0;
    static int sum = 0;

    public static int sumOfArray(int[] array){
        if(pointer!=array.length){
            sum += array[pointer];
            pointer++;
            sumOfArray(array);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfArray(array));
    }
}
