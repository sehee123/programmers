class Solution {
    
    int count = 0; 
    int number = 0;
    boolean [] visited ;
    
    public int solution(int[] numbers, int target) {
        visited = new boolean [numbers.length];
        number = target;
        dfs(numbers, 0,0);
        return count;
    }
    
    public void dfs(int [] numbers, int sum, int idx){
        if(idx==numbers.length){
            if(sum == number)count ++;
            return;
        }
        
        
        dfs(numbers, sum+numbers[idx], idx+1);
        dfs(numbers, sum-numbers[idx], idx+1);
    }
}