package sort.대표값;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int arraySize = Integer.parseInt(br.readLine().trim());
        int arraySize = 5;
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = Integer.parseInt(br.readLine().trim());
        }

        int minIndex = 0;
        int temp = 0;

        for (int i = 0; i < arraySize; i++) {
            minIndex = i;  // ← 핵심 수정: array[i]가 아니라 i

            for (int j = i + 1; j < arraySize; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

       /* 여기서 중앙값과 평균값 구하기. */

        int arrayLength = array.length; // 중앙값과 평균 값을 구하기 위한 배열 전체 길이

        // 1. 중앙 값
        int arrayMiddle = arrayLength / 2;
        int median = array[arrayMiddle];

        // 2. 평균 값
        int sum = 0;
        for(int value : array) {
            sum += value;
        }
        int average = sum / arrayLength;

        System.out.println(average);
        System.out.println(median);
    }
}