package Step1.배수와약수;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber, secondNumber;

        while (true) {

            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            firstNumber = Integer.parseInt(tokenizer.nextToken());
            secondNumber = Integer.parseInt(tokenizer.nextToken());

            if (firstNumber == 0 && secondNumber == 0) break;

            if (secondNumber % firstNumber == 0) {
                System.out.println("factor");
            } else if (firstNumber % secondNumber == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
}
