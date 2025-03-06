import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        
        int sum = brown + yellow;
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<=Math.sqrt(yellow); i++){
            if(yellow % i== 0){
                int a = i; 
                int b = yellow/i;
                a+=2;
                b+=2;
                if(a*b == sum){
                    list.add(a);
                    list.add(b);
                    break;
                } 
            }
        }

        return list
            .stream()
            .sorted(Comparator.reverseOrder())
            .mapToInt(i->i)
            .toArray();
    }
}