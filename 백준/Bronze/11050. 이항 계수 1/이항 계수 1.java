import java.io.*; 

public class Main {
    public static void main(String [] args)throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        System.out.println(factorial(n)/ (factorial(n-k) * factorial(k)));
    }
    private static int factorial(int n){
        int answer = 1;
        for(int i = 1; i<=n; i++){
            answer *= i;
        }
        return answer ;
    }
}