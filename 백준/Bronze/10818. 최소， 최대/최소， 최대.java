import java.io.*; 

public class Main{
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String [] arr = br.readLine().split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< n; i++){
            int num = Integer.parseInt(arr[i]);
            if(num<min){
                min =  num;
            }
            if(num > max){
                max = num;
            }

        }

        System.out.println(min + " " + max);
    }
}