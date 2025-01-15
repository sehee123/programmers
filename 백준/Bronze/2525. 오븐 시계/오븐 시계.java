import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String currentTime = br.readLine();
        String addTime = br.readLine();

        String [] currentTimeArr = currentTime.split(" ");
        int [] intArr = {Integer.parseInt(currentTimeArr[0]),Integer.parseInt(currentTimeArr[1])};
        intArr[1] += Integer.parseInt(addTime);
        while(intArr[1] >= 60){
            intArr[1]-=60;
            intArr[0]+=1;
             if(intArr[0] > 23){
                intArr[0] = 0 ;
            }
        }
        System.out.println(intArr[0]+" " + intArr[1]);

    }
    
}