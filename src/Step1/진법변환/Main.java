package Step1.진법변환;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        String value = tokenizer.nextToken();                // 진법 자체로 구성된 값.
        int b = Integer.parseInt(tokenizer.nextToken());    // 진법 제시

        int totalChangeValue = 0;

        ArrayList<Character> list = new ArrayList<>();


        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            int digit;

            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else {
                digit = c - 'A' + 10;
            }

            totalChangeValue = totalChangeValue * b + digit;
        }

        System.out.println(totalChangeValue);
    }
}
