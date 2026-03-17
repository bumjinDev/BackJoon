package sort.커트라인;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());    // 받는 두 개 수 : 사람 인원수 / 상 커트라인 등수

        int people = Integer.parseInt(st.nextToken());
        int rank = Integer.parseInt(st.nextToken());

        /* people 수 만큼 사람 점수 입력 받을 것이다. */
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] score = new int[people];

        for(int i = 0; i < people; i++) {
            score[i] = Integer.parseInt(st2.nextToken());
        }

        /* people 에 대해서 선택 정렬 진행. */

        int arraySize = score.length;

        int minIndex = 0;
        int temp = 0;

        for (int i = 0; i < arraySize; i++) {
            minIndex = i;  // ← 핵심 수정: array[i]가 아니라 i

            for (int j = i + 1; j < arraySize; j++) {
                if (score[j] < score[minIndex]) {
                    minIndex = j;
                }
            }

            temp = score[i];
            score[i] = score[minIndex];
            score[minIndex] = temp;
        }


       /* 여기서 rank 위치 인덱스 출력 */
        System.out.println(score[score.length - rank]);
    }
}