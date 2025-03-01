class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        char [] charArr = s.toCharArray();
       
        int count = 0 ; 
		
        for(int i = 0; i<charArr.length; i++) {
			
			if('(' == charArr[i]) {
				count ++ ; 
			}else if (')' == charArr[i]) {
				count --;
			}
			if(count < 0) {
				break;
			}
		}
		if(count > 0 || count < 0) {
			answer = false;
		}
        
        return answer;
    }
}