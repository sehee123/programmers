import java.util.*;
class Task { 
    
    int idx ; 
    int start ; 
    int runTime;
    
    public Task(int idx , int start , int runTime){
        this.idx = idx;
        this.start = start;
        this.runTime = runTime;
    }
    
}

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;    
        Task [] taskArray = new Task[jobs.length];
        for(int i = 0; i<jobs.length; i++){
            taskArray[i] = new Task(i , jobs[i][0] , jobs[i][1]);
        }
        Arrays.sort(taskArray, Comparator.comparingInt(t -> t.start));
        
        PriorityQueue <Task> pq = new PriorityQueue<>(
            Comparator.comparingInt((Task t) -> t.runTime)
            .thenComparing(t -> t.start)
            .thenComparing(t -> t.idx)
        );
        
       
        int time = 0; 
        int sum = 0; 
        int idx = 0; 
        int count = 0; //완료된 작업 수 
        
       while(count < jobs.length){
           while(idx < jobs.length && taskArray[idx].start <= time){
               pq.offer(taskArray[idx]);
               idx ++;
           }
           
           if(pq.isEmpty()){
               time = taskArray[idx].start;
               continue;
           }
           
           Task t = pq.poll();
           time += t.runTime;
           sum += time - t.start; 
           count++;
           
       }
        
        return sum/jobs.length;
    }
}