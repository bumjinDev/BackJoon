package BruteForce.분해합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        int result = 0;

        /*
         * M을 1부터 N-1까지 오름차순으로 순회한다.
         * 각 M에 대해 M + M의 각 자릿수 합(= 분해합)을 계산한다.
         * 분해합이 N과 일치하면 그 M이 가장 작은 생성자다.
         * 오름차순 탐색이므로 최초 발견이 곧 최솟값이다.
         * 끝까지 못 찾으면 생성자가 없으므로 0을 출력한다.
         */
        for (int m = 1; m < n; m++) {
            int sum = m;
            int temp = m;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum == n) {
                result = m;
                break;
            }
        }

        System.out.println(result);
    }
}