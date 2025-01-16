import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while((str = br.readLine()) != null){
            String [] strArr = str.split(" ");
            int a = Integer.parseInt(strArr[0]);
            int b = Integer.parseInt(strArr[1]);
            bw.write(String.valueOf(a+b));
            bw.newLine();
        }
       bw.flush();
       bw.close();
    }
}