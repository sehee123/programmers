import java.io.*;

public class Main {
    public static void main(String [] args )throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        String reverseStr = sb.append(str).reverse().toString();
        if(str.equals(reverseStr)){
            System.out.print("1");
        }else{
            System.out.println("0");
        }
       
    }
}