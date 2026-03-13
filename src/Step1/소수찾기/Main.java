package Step1.소수찾기;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer n = new StringTokenizer(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> primeList = new ArrayList<>();
        ArrayList<Integer> checkSaveList = new ArrayList<>();

        int nCount = Integer.parseInt(n.nextToken());

        /* 입력 값 목록 저장 */
        for(int i = 0; i < nCount; i++){

                int token = Integer.parseInt(st.nextToken());
                primeList.add((token));
        }

        for(int inputValue : primeList){

            /* 실제 소수 판별 전 1인지 여부 부터 확인 */
            if(inputValue != 1){
                /* 실제 소수 여부 판별 : 1과 본인 수를 제외한 나머지 숫자로 나눠지면 소수가 아님!*/
                boolean isPrime = true;

                for(int i = 2; i < inputValue; i++){
                    if(inputValue % i == 0) { isPrime = false; break; }
                }
                if(isPrime) checkSaveList.add(inputValue);
            }
        }
        System.out.println(checkSaveList.size());
    }
}
