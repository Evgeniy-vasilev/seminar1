/*
Дано целое число N из отрезка [1; 1000]. Также даны N целых чисел Ai из отрезка [1; 1000000].
Требуется для каждого числа Ai вывести количество различных делителей этого числа.
В этой задаче несколько верных решений, попробуйте найти наиболее оптимальное.
Для полученного решения укажите сложность в О-нотации.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        searchDivider();
    }

    public static int generateN() {
        Random random = new Random();
        int N = random.nextInt(1001);
        return N;
    }

    public static int[] generateAi() {
        int array[] = new int[generateN()];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000000);
        }
        return array;
    }

    public static List<Integer> searchDivider() {   //O(N^2)
        List<Integer> div = new ArrayList<>();
        int array[] = generateAi();

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j <= array[i]; j++) {
                if (array[i] % j == 0) {
                    div.add(j);
                }
            }
            System.out.println("N: " + array[i] + " Ai: " + div);
            div.clear();
        }
        return div;
    }
}