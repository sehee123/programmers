class Solution {
    
    int[] answer = {0,0};
    
    public void divided (int [][]arr ,int x , int y , int n ) {
		
		if(zip(arr, x, y, n)) {
			answer[arr[x][y]] += 1;
			
			
			return;
		} else {
			
			divided(arr,x,y,n/2);
			divided(arr,x,y+n/2,n/2);
			divided(arr,x+n/2,y,n/2);
			divided(arr,x+n/2,y+n/2,n/2);
			
		}
	}
    
    	public boolean zip (int [][]arr , int x , int y , int n) {
		
		int pointer = arr[x][y]; 
		
		for(int i=x;i<x+n;i++) {
			for(int j=y;j<y+n;j++) {
				if(pointer != arr[i][j])return false;
			}
		}
		return true;
	}
    
    
    public int[] solution(int[][] arr) {
        
        
        divided(arr, 0, 0, arr.length);
        
        return answer;
    }
}