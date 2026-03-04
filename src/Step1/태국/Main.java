package Step1.태국;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer inPutValue = new StringTokenizer(br.readLine());
        String input = inPutValue.nextToken();

        int st = Integer.parseInt(String.valueOf(input));

        System.out.println(st - 543);
    }
}
