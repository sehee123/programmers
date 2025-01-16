import java.io.*;

public class Main{
    
    public static void main (String [] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true){
            String [] numArr = br.readLine().split(" ");
            int a = Integer.parseInt(numArr[0]);
            int b = Integer.parseInt(numArr[1]);
            
            if(a==0 && b==0){
                break;
            }
            
            int sum = a+b ;
            bw.write(String.valueOf(sum));
            bw.newLine();
        }
            bw.flush();
            bw.close();
    }

}