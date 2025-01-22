import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String [] croatianAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(String alphabet : croatianAlphabet){
            str = str.replace(alphabet,"*");
        }
        System.out.println(str.length());
    }
}