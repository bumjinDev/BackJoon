package Step1.벌집;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        int circleValue = 1;
        int circleLoopIncreateValue = 6;

        int Distance = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int searchValue = Integer.parseInt(tokenizer.nextToken());
//        System.out.println("searchValue : " + searchValue);
//
//        System.out.println("\n\nStartLoop!\n");

        do{
//            System.out.println("circleValue : " + circleValue);
//            System.out.println("Distance : " + Distance);
//            System.out.println("circleLoopIncreateValue : " + circleLoopIncreateValue);
//            System.out.println("----------------------------------------\n\n");

//            /* 테스트용 */
//            if(Distance == 10){ break;}

            if(searchValue <= circleValue){
                System.out.println(Distance);
                break;
            }

            circleValue += circleLoopIncreateValue;
            circleLoopIncreateValue += 6;   // 문제 제시한 육각형 구조 근거로 점직적으로 육각형 타원 크기가 이만큼 증가함. 추가하는 값.
            Distance++;

        } while (true);

    }
}
