import java.util.*;

class Solution {
    public int solution(int N, int number) {
        if(N == number)return 1;
        
        //1 : 5 
        //2 : 55, 25, 1, 0
        Set<Integer> [] arr = new HashSet [9];
       
        for(int i =1; i< 9; i++){
            Set<Integer> set = new HashSet<>();
            
            int repeat = 0; 
            for(int j =0; j<i; j++){
                repeat = repeat*10 +N;                
            }
            set.add(repeat);
            
            for(int j= 1; j<i; j++){
                for(int a : arr[j]){
                    for(int b: arr[i-j]){
                        set.add(a+b);
                        set.add(a-b);
                        set.add(a*b);
                        if(b != 0)set.add(a/b);
                    }
                }
            }
            
            if(set.contains(number)) return i;
            arr[i] = set;
            
        }
        
        
        return -1;
    }
}