package Step1.약수구하기;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n, k;

        int checkValue = 0;
        int checkCount = 0;

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(tokenizer.nextToken());
        k = Integer.parseInt(tokenizer.nextToken());

        for (int i = 1 ; ; i++) {

            if (n % i == 0) {

                checkValue = i;
                checkCount++;
//                System.out.println("checkValue={}" + checkValue + ", checkCount={}" + checkCount);
            }

            if ( checkCount == k) {

                System.out.println(checkValue);
                break;
            }

            if( i > n ){
                System.out.println(0);
                break;
            }
        }
    }
}
