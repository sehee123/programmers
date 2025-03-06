import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {0,0,0};
        
        int [] person1 = {1,2,3,4,5}; //5
        int [] person2 = {2,1,2,3,2,4,2,5}; // 8
        int [] person3 = {3,3,1,1,2,2,4,4,5,5}; //10
        
        for(int i = 0; i<answers.length ; i++){
            if(answers[i] == person1[i%5])answer[0]++;
            if(answers[i] == person2[i%8])answer[1]++;
            if(answers[i] == person3[i%10])answer[2]++;
        }
        
        int max = Math.max(answer[0],Math.max(answer[1],answer[2]));
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i< 3; i++){
            if(answer[i]== max){
                list.add(i+1);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}