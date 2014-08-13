package training.ideas.java.calculator;

public class Addition {
    public static int perform(int first, int second) {
        return first + second;
    }

    public static double perform(double first, double second) {
        return first + second;
    }

    public static int perform(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }

        return result;
    }

    public static double perform(double[] array) {
        double result = 0;
        int counter = 0;
        while (counter < array.length) {
            result += array[counter++];
        }
        return result;
    }

    public static double perform1(double array[]) {
        double j;
        double sum = 0;
        for (j = 0; j < array.length; j++) {
            sum = sum + array[((int) j)];
        }
        return sum;
    }

}





