package Map.회사에있는사람;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashSet<String> inOffice = new HashSet<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String action = st.nextToken();

            if (action.equals("enter")) inOffice.add(name);
            else inOffice.remove(name);
        }

        List<String> result = new ArrayList<>(inOffice);
        result.sort(Comparator.reverseOrder());

        for (String name : result) sb.append(name).append("\n");
        System.out.print(sb);
    }
}