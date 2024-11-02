import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};

        Set<String> set = new HashSet<>();
		//중복제거 
		set.add(words[0]);
		
		for(int i = 1; i< words.length; i++) {
			set.add(words[i]);
			if(set.size() != (i+1) || (words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0))) {
                System.out.println(i);
				if((i+1)%n == 0) {
					answer [0] = n;
                    answer [1] = (i+1)/n;
				}else {
					answer [0] = (i+1)%n;
                    answer [1] = ((i+1)/n)+1;
				}
               
				break;
			}
		}

        return answer;
    }
}