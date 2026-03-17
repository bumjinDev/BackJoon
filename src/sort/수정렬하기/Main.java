package sort.수정렬하기;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arraySize = Integer.parseInt(br.readLine().trim());
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

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int x : array) {
            sb.append(x).append('\n');
        }
        System.out.print(sb);
    }
}