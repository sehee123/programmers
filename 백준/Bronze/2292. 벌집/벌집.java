import java.io.*;

public class Main {
    
    public static void main(String [] args )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int des = Integer.parseInt(br.readLine());
        int start = 1;
        int idx = 1;
        while(des > start){
            start +=idx*6;
            idx ++;
        }
        System.out.print(idx);
    }
    
}