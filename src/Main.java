import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {0.0, 7.2, -1.8, 3.5, -2.5, 6.7, 9.0, -4.3, 2.1, 0.9, -3.2, 1.9, -8.1, 4.7, -6.6};
        boolean negativeFound = false;
        double sum = 0;
        int count = 0;
        for (double number : numbers) {
            if (negativeFound && number > 0) {
                sum += number;
                count++;
            }
            if (number < 0) {
                negativeFound = true;
            }
        }
        double average = (count == 0) ? 0 : sum / count;
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);

/*                    Д/З НА СООБРАЗИТЕЛЬНОСТЬ                   */
        double num = numbers[0];
        int index = 0;
        for (int i = 0; i < 15; i++) {
            for (int j = i; j < 15; j++) {
                if (numbers[j] < num) {
                    num = numbers[j];
                    index = j;
                }
            }
            numbers[index] = numbers [i];
            numbers[i] =num;

            num = numbers[i+1];

            System.out.println(Arrays.toString(numbers));
        }

    }
}