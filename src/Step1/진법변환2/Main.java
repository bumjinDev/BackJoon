package Step1.진법변환2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(tokenizer.nextToken());  // 10진법 수
        int B = Integer.parseInt(tokenizer.nextToken());   // 변환할 진법

        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            int remainder = N % B;  // 나머지가 현재 자릿수의 값

            if (remainder < 10) {
                sb.append((char) ('0' + remainder));  // 0~9는 숫자 문자
            } else {
                sb.append((char) ('A' + remainder - 10));  // 10~35는 알파벳
            }

            N = N / B;  // 몫으로 다음 반복
        }

        sb.reverse();  // 나머지가 역순으로 쌓였으니 뒤집는다
        System.out.println(sb.toString());
    }
}
