import java.io.*;
import java.util.*;

public class Main {
    
      public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] arr = br.readLine().split(" ");
        int cntA = Integer.parseInt(arr[0]);
        int cntB = Integer.parseInt(arr[1]);

        Set <String> setA = new HashSet<>();
        Set <String> setB = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i< cntA; i++){
            setA.add(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<cntB; i++){
            setB.add(st.nextToken());
        }
        
          
        for(String a : setA){
            if(setB.contains(a)){
                cntB--;
            }
        }

        for(String b : setB){
            if(setA.contains(b)){
                cntA--;
            }
        }
        System.out.print(cntA + cntB);

    }
    
}