

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)throws IOException {
        int [] correctCnt = {1,1,2,2,2,8};

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] brArr = br.readLine().split(" ");

        for(int i =0; i<6; i++) {
            sb.append(correctCnt[i] - Integer.parseInt(brArr[i]));
            if (i != 5) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
