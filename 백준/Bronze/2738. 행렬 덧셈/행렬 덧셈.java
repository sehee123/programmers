import java.io.*;

public class Main {
    public static void main(String [] args )throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        
        int n = Integer.parseInt(NM[0]);
        int m = Integer.parseInt(NM[1]);
        
        int[][] sumArr = new int[n][m];
        
        for(int i = 0; i<2; i++){
        	for(int j = 0; j<n; j++){
            String [] arr =  br.readLine().split(" ");
            	for(int k=0;k<m; k++){
                	sumArr[j][k]+=Integer.parseInt(arr[k]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< n; i++){
           for(int j = 0 ; j<m ; j++){
              sb.append(sumArr[i][j]).append(" ");
           }
           sb.append("\n");
        }
        System.out.println(sb);

    }
}