import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Set <String> set = new HashSet<>();
        int idx = 0;
        for(int i = 0; i<str.length();i++){
            idx ++;
            for(int j = 0; j<str.length()-i; j++){
                set.add(str.substring(j,j+idx));
            }
        }
        System.out.print(set.size());
    }
    
}