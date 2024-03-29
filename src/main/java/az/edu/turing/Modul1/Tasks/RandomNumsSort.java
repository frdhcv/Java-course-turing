package az.edu.turing.Modul1.Tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumsSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillRandomArr(array);
        sortArray(array);
        System.out.println(Arrays.toString(array));

    }

    public static void fillRandomArr(int[] array) {

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

