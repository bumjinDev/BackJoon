package Step1.약수들의합;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {

            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int tempInput = Integer.parseInt(tokenizer.nextToken());

            if (tempInput == -1) {
                break;}

            list.add(tempInput);
        }

        /* 입력 받은 값이 null 이거나 -1 하나만 있을 경우 */
        if(list.isEmpty()){ return; }

        for(int inputValue: list){

            ArrayList<Integer> choiceList = new ArrayList<>();

            StringBuilder sb = new StringBuilder();
            sb.append(inputValue + " =");   // 초기 값

            int checkValue = 0;

            /* 약수 확인 및 수집 */
            for(int i = 1; i < inputValue; i++ ){

                if(inputValue % i == 0){

                    checkValue += i;
                    choiceList.add(i);
                }
            }

            for(int i = 0; i < choiceList.size(); i++){

                sb.append(" " + choiceList.get(i));
                if(i <= choiceList.size() - 2){
                    sb.append(" +");
                }
            }

            if(checkValue == inputValue){
                System.out.println(sb.toString());
            } else {
                System.out.println(inputValue + " is NOT perfect.");
            }
        }
    }
}
