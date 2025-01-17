import java.io.*;
import java.util.ArrayList;

public class Main{
     public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] numArr = new int [31];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<28; i++){
            int num = Integer.parseInt(br.readLine());
            numArr[num] = num ;
        }
        for(int i = 1; i<31 ;i++){
            if(numArr[i]==0){
                list.add(i);
            }
        }
        System.out.println(Math.min(list.get(0),list.get(1)));
        System.out.println(Math.max(list.get(0),list.get(1)));
    }

}