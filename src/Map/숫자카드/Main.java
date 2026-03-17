package Map.숫자카드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cardCount = Integer.parseInt(br.readLine());
        HashSet<Integer> humanCardSet = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cardCount; i++) {
            humanCardSet.add(Integer.parseInt(st.nextToken()));
        }

        int choiceCount = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());  // M개가 한 줄에 공백 구분
        for (int i = 0; i < choiceCount; i++) {
            int query = Integer.parseInt(st.nextToken());
            // HashSet.contains() = O(1) 조회
            sb.append(humanCardSet.contains(query) ? 1 : 0);
            if (i < choiceCount - 1) sb.append(" ");
        }

        System.out.println(sb);
    }
}