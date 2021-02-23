package pl.sdacademy.podstawy.factorial;

public class Main {
    public static void main(String[] args) {
        int [] data =  new int [] {0,1,2,5,10};
        for (int value : data) {
            System.out.printf("%d! = %d\n", value, factorial(value));

        }
    }

    public static long factorial(int value) {
        long result = 1;
        for (int i =1; i<= value; i++) {
            result = result*i;
        }
        return result;
    }
}
