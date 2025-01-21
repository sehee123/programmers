import java.io.*;

public class Main {
    
    public static void main(String []args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] InputArr = br.readLine().split(" ");
        String [] arr  = new String [2];
        for(int i = 0; i<2; i++){
            StringBuilder sb = new StringBuilder();
            for(int j =InputArr[i].length()-1;j>=0;j--){
                char c = InputArr[i].charAt(j);
                sb.append(c);
            }
            arr [i] = sb.toString();
        }

        System.out.print(Math.max(Integer.parseInt(arr[0]),Integer.parseInt(arr[1])));
    }
    
}