import java.io.*;

public class Main {
    public static void main(String argsp[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int range = 0;
        int jump = 0;
        int end = 0;

        while (end < num ){
            jump ++;
            end +=jump;
            range ++;
        }


        int distance = end - num;
        if(range%2 == 0){
            System.out.println((range - distance)+"/" + (1+distance));
        }else {
            System.out.println(1+distance+"/"+(range-distance));
        }

    }
}
