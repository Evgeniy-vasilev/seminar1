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
        int[] array = new int[generateN()];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000000);
        }
        return array;
    }

    public static void searchDivider() {   //O(N^2)
        List<Integer> dividers = new ArrayList<>();
        int[] array = generateAi();
        int count = 1;
        for (int j : array) {
            for (int k = 1; k <= j; k++) {
                if (j % k == 0)
                    dividers.add(k);
            }
            System.out.println(count + "N: " + j + " Ai: " + dividers);
            dividers.clear();
            count++;
        }
    }
}