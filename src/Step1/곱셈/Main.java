package Step1.곱셈;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력이 두 줄에 걸쳐 들어오므로 readLine()을 두 번 호출합니다.
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        // (3) 위치: b의 1의 자리 숫자와 a의 곱
        System.out.println(a * (b % 10));

        // (4) 위치: b의 10의 자리 숫자와 a의 곱
        System.out.println(a * ((b % 100) / 10));

        // (5) 위치: b의 100의 자리 숫자와 a의 곱
        System.out.println(a * (b / 100));

        // (6) 위치: 전체 a * b 결과
        System.out.println(a * b);
    }
}
