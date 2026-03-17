package BruteForce.블랙잭;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());    // 카드 개수와 찾아야 조합 최대 크기
        int cardCount = Integer.parseInt(st.nextToken());   // 카드 개수
        int M = Integer.parseInt(st.nextToken());           // 조합 최대 개수
        int max = 0;

        int[] cards  = new int[cardCount];

        st = new StringTokenizer(br.readLine());    // 카드들 입력 받기

        for(int i = 0; i < cards .length ; i++) {
            cards [i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < cards.length - 2; i++) {
            for (int j = i + 1; j < cards.length - 1; j++) {
                for (int k = j + 1; k < cards.length; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= M && sum > max) {
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
