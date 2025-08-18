   
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String [] strArr = str.split(" ");
        int [] nums = {Integer.parseInt(strArr[0]),Integer.parseInt(strArr[1]),Integer.parseInt(strArr[2])};
        int answer = 0 ;
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<i ; j++){
                for(int k = 0; k<j; k++){
                    if(nums[i] == nums[j] && nums[j] == nums[k] && nums[k] == nums[i]){
                        answer = 10000 + 1000*nums[i];
                    }else if(nums[i] == nums[j] ){
                        answer = 1000 + 100*nums[i];
                    } else if (nums[j] == nums[k]) {
                        answer = 1000 + 100*nums[j];
                    } else if(nums[i] == nums[k]){
                        answer = 1000 + 100*nums[k];
                    }else if(nums[i] != nums[j] && nums[j] != nums[k] && nums[i] != nums[k]){
                            int num =  0;
                            for(int n=0; n<nums.length; n++){
                                if(num< nums[n]){
                                    num = nums[n];
                                }
                            }
                            answer = 100* num;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
