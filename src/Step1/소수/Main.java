package Step1.소수;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer firstValue = new StringTokenizer(br.readLine());
        StringTokenizer secondValue = new StringTokenizer(br.readLine());

        int firstNumber = Integer.parseInt(firstValue.nextToken());
        int secondNumber = Integer.parseInt(secondValue.nextToken());

        int minValue = secondNumber;       // 소수들 중 최소 값
        int totalValue = 0;     // 소스들의 합

        for(int i = firstNumber; i <= secondNumber ; i++){

            /* 각 숫자 별로 실제 소수 판별 전 1인지 여부 부터 확인 */
            if(i != 1){
                /* 각 숫자 별 실제 소수 여부 판별 : 1과 본인 수를 제외한 나머지 숫자로 나눠지면 소수가 아님!*/
                boolean isPrime = true;

                for(int i2 = 2; i2 < i; i2++){
                    if(i % i2 == 0) { isPrime = false; break; } // 소수가 아님을 판별
                }

                if(isPrime) {

                    totalValue += i;
                    minValue = Math.min(minValue, i);
                }
            }
        }

        if(totalValue != 0) {
            System.out.println(totalValue);
            System.out.println(minValue);
        }
        else System.out.println(-1);
    }
}
