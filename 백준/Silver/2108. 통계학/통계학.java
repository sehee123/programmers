import java.io.*;
import java.util.*;

public class Main {

    //시작점
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int [] nums = new int [n];

        int sum = 0 ;
        Map<Integer , Integer> cntMap = new HashMap<>();
        for(int i = 0; i<n; i++){
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
            int cnt = cntMap.getOrDefault(nums[i],0);
            cntMap.put(nums[i] ,cnt +1);
        }

        Arrays.sort(nums); //2. 중앙값

        int maxFreq = Collections.max(cntMap.values());
        List<Integer> modes = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : cntMap.entrySet()){
            if(entry.getValue() == maxFreq){
                modes.add(entry.getKey());
            }
        }
        Collections.sort(modes);
        int mode = (modes.size() > 1)? modes.get(1) : modes.get(0);

        bw.write(Math.round((float)sum/n) +"\n");
        bw.write(nums[n/2] + "\n");
        bw.write(mode + "\n");
        bw.write(nums[n-1] - nums[0]+ "\n") ;
        bw.flush();
        bw.close();



    }


}
