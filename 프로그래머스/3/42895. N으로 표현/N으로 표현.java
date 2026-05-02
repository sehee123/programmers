import java.util.*;

class Solution {
    public int solution(int N, int number) {
        int answer = 0;
        
        if(N ==number) return 1;
        
        Set<Integer>[] dp = new HashSet [9];
        
        for(int i =1; i<9; i++){
            dp[i] = new HashSet<>();
        }
        
        //N, NN, NNN .. 넣어주기
        int tmp = 0;
        for(int i = 1; i<9; i++){
            tmp = tmp*10 +N;
            dp[i].add(tmp);
        }
        
        //사칙연산 
        //1+3, 2+2, 3+1 을 생각하기
        for(int i =2; i<9; i++){
            for(int j= 1; j<i; j++){
                for(int a :dp[i-j]){
                    for(int b : dp[j]){
                        dp[i].add(a+b);
                        dp[i].add(a-b);
                        dp[i].add(a*b);
                        if(b != 0) dp[i].add(a/b);
                    }
                }
            }
            if(dp[i].contains(number)) return i;
        }
        return -1;
    }
}