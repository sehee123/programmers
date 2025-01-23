import java.io.*;

public class Main {
    public static void main(String [] args )throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int n = Integer.parseInt(NM[0]);
        int m = Integer.parseInt(NM[1]);
        int[][] sumArr = new int[2*n][m];
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                sumArr[i][j] = Integer.parseInt(arr[j]);
            }
        }
        for (int i = n; i < 2 * n; i++) {
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                sumArr[i][j] = Integer.parseInt(arr[j]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< n; i++){
           for(int j = 0 ; j<m ; j++){
              sb.append(sumArr[i][j]+sumArr[i+n][j]).append(" ");
           }
           sb.append("\n");
        }
        System.out.println(sb);

    }
}