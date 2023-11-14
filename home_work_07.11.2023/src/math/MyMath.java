package math;

public class MyMath {
    private MyMath() {
    }


    public static int addAll(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int minusAll(int number, int... numbers) {
        int result = number;
        for (int i = 0; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    public static int mutAll(int... number) {
        int product = 1;
        for (int i = 0; i < number.length; i++) {
            product *= number[i];
        }
        return product;
    }

    public static int powAll(int first, int... number) {
        int result = first;
        for (int n :
                number) {
            result = (int) Math.pow(result, n);
        }
        return result;
    }


}
