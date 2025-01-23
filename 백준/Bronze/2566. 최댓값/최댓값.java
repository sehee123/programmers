import java.io.*;

public class Main {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0 ; 
        int [] info = {1,1};
        for(int i = 1; i<10;i++){
            String [] row = br.readLine().split(" ");
            for(int j = 0; j<9; j++){
                int val = Integer.parseInt(row[j]);
                if(val>max){
                    max = val;
                    info[0] = i;
                    info[1] = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.print(info[0]+" "+info[1]);
    }
}