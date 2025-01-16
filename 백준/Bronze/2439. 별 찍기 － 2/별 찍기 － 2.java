import java.io.*;

public class Main{
public static void main(String [] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i =0; i< n; i++){
            for(int j=1; j<n-i; j++){
                sb.append(" ");
            }
            for(int k=0; k<=i; k++) {
                sb.append("*");
            }
            bw.write(sb.toString());
            bw.newLine();
            sb.setLength(0);
        }
        bw.flush();
        bw.close();
    }
}

