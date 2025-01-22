import java.io.*;

public class Main{
    public static void main(String [] args )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0; 
        for(int i = 0 ; i< n; i++){
            String str = br.readLine();
            boolean IsGroup = true;
            int [] alphabetArr = new int [27];
            for(int j = 0; j<str.length(); j++){
                alphabetArr[str.charAt(j)&31] ++ ; 
                if(j>0 && alphabetArr[str.charAt(j) & 31]>1 && str.charAt(j) != str.charAt(j-1)){
                     IsGroup = false;
                }
            }
            if(IsGroup)cnt++;
        }
        System.out.println(cnt);
    }
}