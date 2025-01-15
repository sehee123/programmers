import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        n= n/4 ;
        String str = "int";
        for(int i=0 ; i<n ; i++){
            str = "long "+str;
        }
        System.out.println(str);
    }
}