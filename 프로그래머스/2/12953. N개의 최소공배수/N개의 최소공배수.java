import java.util.*;
class Solution {
    public int solution(int[] arr) {
        
        if(arr.length ==1) return arr[0];
        
        int answer = 0;
        
        Arrays.sort(arr);
        int lcm = lcm(arr[0],arr[1]);
        
        for(int i =1; i<arr.length-1; i++){
            int a = lcm ;
            int b = arr[i+1];
            
            lcm = lcm(a,b);
            
        }
        
        return lcm;
    }
    
    public int gcd(int a, int b){
        int r = 0;
        while(b > 0 ){
            r = a % b;
            a = b;
            b = r;
        }
        return a; 
    }
    
    public int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}