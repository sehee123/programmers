import java.util.*; 

class Solution {
    public int solution(int[][] dots) {
       
        
        Set<Integer> Xset = new HashSet<>();
        Set<Integer> Yset = new HashSet<>();
        for(int [] dot : dots){
            Xset.add(dot[0]);
            Yset.add(dot[1]);
        }
        int width = 0;
        int height = 0;
        List<Integer> list = new ArrayList<>();
        for(int x : Xset){
            list.add(x);
        }
        width = Math.abs(list.get(0)- list.get(1));
        for(int y : Yset){
            list.add(y);
        }
        height = Math.abs(list.get(2)- list.get(3));
    
        return width*height;
    }
}