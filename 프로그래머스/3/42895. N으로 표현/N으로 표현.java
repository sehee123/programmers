import java.util.*;

class Solution {
    public int solution(int N, int number) {
        
        if(N == number) return 1;
        
        int answer = 0;
        
        List<Set<Integer>> list = new ArrayList<>();
        for(int i= 0; i<=8; i++){
            list.add(new HashSet<>());
        }
        
        list.get(1).add(N);
        
        for(int i = 2; i<=8; i++){
            
            Set<Integer> currentSet = list.get(i);
            currentSet.add(Integer.parseInt(String.valueOf(N).repeat(i)));
            
            for(int j = 1; j<i; j++){
                Set<Integer> set1 = list.get(j);
                Set<Integer> set2 = list.get(i-j);
                
                for(int a : set1){
                    for(int b : set2){
                        currentSet.add(a*b);
                        currentSet.add(a+b);
                        currentSet.add(a-b);
                        if(b !=0)currentSet.add(a / b);
                    }
                }
            }
             if(currentSet.contains(number)) return i;
        }
        
        return -1;
    }
}