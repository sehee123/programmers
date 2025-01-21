import java.io.*; 

public class Main{
    public static void main(String []args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        // 4 1 4
        // 3 3 3
        // 2 5 2
        // 1 7 1
        // 0 9 0

        for(int i = 0; i<n; i++){
            for(int j = 1; j<n-i;j++){
                sb.append(" ");
            }
            for(int j = 0; j<=2*i;j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        // 1 7 1
        // 2 5 2
        // 3 3 3
        // 4 1 4
        for(int i = n-1; i>0 ; i--){
            for(int j = 0; j<n-i;j++){
                sb.append(" ");
            }
            for(int j = 1; j<=2*i-1; j++){
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
