public class Calculator {
    public int plus(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
}
