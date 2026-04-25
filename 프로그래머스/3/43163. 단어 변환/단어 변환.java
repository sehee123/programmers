class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        for(String word: words){
           if(word.equals(target)){
               answer ++;
           }
        }
        if(answer == 0) return 0; 
        
        answer --;
        
        
        for(String word: words){
            if(valid(begin,target)){
                System.out.println(begin + " : " + target);
                return ++answer;
            }
            if(valid(begin, word)){
                answer ++;
                begin = word;
            }
            
        }
        
        return answer;
    }
    
    public boolean valid(String word, String nextWord){
        //알파벳 1개만 바꿔서 nextWord 가 될 수있는지 확인
        int count = 0; 
        for(int i =0; i<word.length(); i++){
            if(word.charAt(i) != nextWord.charAt(i))count++;
            if(count>1) return false;
        }
        return true;
    }
}