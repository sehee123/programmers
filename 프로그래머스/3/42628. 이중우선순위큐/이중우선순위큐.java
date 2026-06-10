import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        
        PriorityQueue<Integer> min = new PriorityQueue<>(); //오름차순
        PriorityQueue<Integer> max = new PriorityQueue<>((n1,n2) -> Integer.compare(n2,n1)); //내림차순
        
        
        for(String str : operations){
            String operation [] = str.split(" ");
            String command = operation[0];
            
            if(command.equals("I")){
                int num = Integer.valueOf(operation[1]);
                min.offer(num);
                max.offer(num);
            }else{
                if(!min.isEmpty()){
                    if(operation[1].equals("1")){
                        int maxNum = max.poll();
                        min.remove(maxNum);
                    }else{
                        int minnNum = min.poll();
                        max.remove(minnNum);
                    }
                }
            }
        }
        if(!min.isEmpty()){
            return new int []{max.poll(), min.poll()};
        }
        
        return new int []{0,0};
    }
}