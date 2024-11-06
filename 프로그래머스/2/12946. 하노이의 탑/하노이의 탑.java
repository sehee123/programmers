import java.util.ArrayList;

class Solution {
    
    ArrayList<int[]> list = new ArrayList<>();
    
    public int[][] solution(int n) {
        int [][] answer = new int [(int)((Math.pow(2, n))-1)][2];
        
        hanoi(1, 2, 3, n);
		
		for(int i = 0; i<list.size(); i++) {
			int [] arr = list.get(i);
			answer[i][0] = arr[0];
			answer[i][1] = arr[1];
		}
        return answer; 
    }
    
    private void hanoi (int from , int via , int to, int n ) {
		
		int[]move = {from,to};
	
		if(n == 1) {
			list.add(move);
		}else{
			this.hanoi(from, to, via, n-1);
			list.add(move);
			this.hanoi(via , from , to , n-1);
		}		
		
	}
}