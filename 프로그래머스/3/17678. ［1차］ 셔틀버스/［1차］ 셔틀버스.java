import java.util.*;
class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        String answer = "";
        
        PriorityQueue<Integer> crew = new PriorityQueue<>();
        
        for(String time : timetable){
            crew.offer(timeToInt(time));
        }
        
        //n 셔틀 운행 횟수
        //t 셔틀 운행 간격
        //m 최대 크루 수 
        int startTime = 540; //09:00
        int lastTime = 0; 
        int totalCnt = 0;
        
        for(int i = 0; i<n; i++){
            totalCnt = 0; 
            
            while(!crew.isEmpty()){
                int now = crew.peek(); 
                
                if(now <= startTime && totalCnt < m){
                    crew.poll();
                    totalCnt++;
                    lastTime = now -1; 
                }else {
                    break;
                }
                
            }
            startTime += t;
        }
        
        if(totalCnt < m ){
            lastTime = startTime - t;
        }
        
        String hour =String.format("%02d", lastTime/60);
        String min = String.format("%02d",lastTime%60);
        
        answer = hour+":" + min;
        
        return answer;
    }
    
    public static int timeToInt (String time){
        String [] split = time.split(":");
        
        int hour = Integer.parseInt(split[0]);
        int min = Integer.parseInt(split[1]);
        
        return hour*60+min;
    }
}