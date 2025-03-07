import java.util.*;

class Solution {
    
    static Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        int answer = 0;
        
        char [] arr = numbers.toCharArray();
        boolean[] visited = new boolean [arr.length];
        dfs(arr,visited , "",0);
        
        for(int num : set){
            if(isPrime(num))answer++;
        }
        
        return answer;
    }
    public static void dfs (char [] arr , boolean [] visited , String match , int depth){
        
        if(!match.isEmpty()){
            set.add(Integer.parseInt(match));
        }
        
        if(arr.length == depth) return;
        
        for(int i = 0; i<arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(arr,visited , match+arr[i], depth+1);
                visited[i] = false;
            }
        }
        
    }
    
    public static boolean isPrime(int num){
        if(num<2)return false;
        for(int i = 2; i<=Math.sqrt(num) ; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}