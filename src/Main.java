import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] monthlyExpenses = generateRandomArray(100_000, 200_000, 30);
        System.out.println(Arrays.toString(monthlyExpenses));

        //Task 1
        System.out.println("Сумма трат за месяц составила " + sumOfElements(monthlyExpenses) + " рублей");

        //Task 2
        System.out.println("Минимальная сумма трат за день составила " + findMinimumElementInArray(monthlyExpenses) +
                " рублей. Максимальная сумма трат за день составила " + findMaximumElementInArray(monthlyExpenses) + " рублей");

        //Task 3
        System.out.println("Средняя сумма трат за месяц составила " + String.format("%.2f", findAverageValueOfElement(monthlyExpenses)) + " рублей");

        //Task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        reversPrintArray(reverseFullName);

    }

    private static void reversPrintArray(char[] array) {
        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.print(array[i]);
        }
    }

    private static double findAverageValueOfElement(int[] array) {
        return (double) sumOfElements(array)/array.length;
    }

    private static int findMaximumElementInArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    private static int findMinimumElementInArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    private static int sumOfElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static int[] generateRandomArray(int rangeStarts, int rangeEnds, int arrayLength) {
        Random random = new Random();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(rangeStarts) + (rangeEnds-rangeStarts);
        }
        return array;
    }
}
