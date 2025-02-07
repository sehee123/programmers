class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = 1;
        int left = 1; 
        int right = 100000;
     
        while(left<=right){
            int level = (right+left)/2;
            
            long time = getTotalTime(diffs, times,level);
            
            if(time <=limit){
                answer = level;
                right = level-1;
            }else{
                left = level+1;
            }
        }

        return answer;
    }
    private static long getTotalTime(int[] diffs, int[] times, int level){
        long time = 0;
        time += times[0];
        for(int i = 1; i<diffs.length; i++){
            if(diffs[i] <= level){
                time += times[i];
            }else{
                time += (times[i]+times[i-1])*(diffs[i]-level) + times[i];
            }
        }
        return time;
    }
}