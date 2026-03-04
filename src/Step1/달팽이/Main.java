package Step1.달팽이;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        /* 초기 값 */
        int height = 0;         /* 현재 달팽이가 올라가고 있는 높이 */
        int dayCount = 0;       /* 달팽이가 올라가는데 걸린 기간*/


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int days = (int) Math.ceil((double)(V - A) / (A - B)) + 1;
        System.out.println(days);
    }
}
