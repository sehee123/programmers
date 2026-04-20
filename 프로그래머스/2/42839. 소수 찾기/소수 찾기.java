import java.util.*;

class Solution {
    
    Set<Integer> numberSet = new HashSet<>();
    
    public int solution(String numbers) {
        int answer = 0;
        
        //1.숫자 조합 
        dfs("",numbers);
        //2.소수 판별
       Iterator<Integer> it = numberSet.iterator();
        while(it.hasNext()){
            int number = it.next();
           
            if(isPrime(number))
                answer++;
        }
        
        return answer;
    }
    
    public void dfs(String comb, String others){
        if(!comb.equals(""))numberSet.add(Integer.valueOf(comb));
        
        for(int i = 0; i<others.length(); i++){
            dfs(comb+others.charAt(i), others.substring(0,i)+others.substring(i+1));
        }
        
    }
    
    public boolean isPrime(int number){
        if(number < 2) return false;
        int lim = (int)Math.sqrt(number);
         
        for(int i=2; i<=lim ; i++){
            if(number%i == 0) return false;
        }
       
        return true;
    }
}