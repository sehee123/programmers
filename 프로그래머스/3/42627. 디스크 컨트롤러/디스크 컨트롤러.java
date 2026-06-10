import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        
        //요청시각 순으로 정렬
        Arrays.sort(jobs,(w1,w2)-> Integer.compare(w1[0],w2[0]));
        
        //소요시간이 짧은 순 , 작업의 번호가 작은 것
        PriorityQueue<int[]> pq = new PriorityQueue<>((w1, w2)->{
            
            if(w1[0] != w2[0])return Integer.compare(w1[0],w2[0]);
            
            return Integer.compare(w1[1],w2[1]);
        });
        
        int count = 0; 
        int time = 0;
        int sum = 0; 
        int idx = 0;
        
        while(count < jobs.length){           
            
            while(idx<jobs.length && jobs[idx][0] <=time){
                //소요시간,작업번호,요청시간
                pq.offer(new int []{jobs[idx][1], idx, jobs[idx][0]});
                idx ++;
            }
            
            if(pq.isEmpty()){
                time = jobs[idx][0];
            }else{
                int [] work = pq.poll();
                time += work[0];
                sum += (time - work[2]);
                count ++;
            }
            
        }

        return sum/jobs.length;
    }
}