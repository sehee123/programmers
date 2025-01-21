import java.io.*;

public class Main{
    public static void main(String[] args )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] inputArr = br.readLine().split(" ");
        int [] chess = {1,1,2,2,2,8};
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< 6; i++){
            sb.append(chess[i] - Integer.parseInt(inputArr[i]));
            sb.append(" ");
        }
        System.out.println(sb);
    }
}