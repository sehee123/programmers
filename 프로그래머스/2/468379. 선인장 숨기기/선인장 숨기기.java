import java.util.*;

class Solution {
    public int[] solution(int m, int n, int h, int w, int[][] drops) {
        int totalCells = m * n ; 
        int INF = drops.length + 1; 
        
        //1. 메모리 초과 방지를 위해 1차원 평탄화 배열 사용 
        // 각 칸에 비가 내리는 시점을 기록(안내리면 INF)
        
        int []grid = new int [totalCells];
        Arrays.fill(grid, INF);
        for(int time = 0; time<drops.length; time ++){
            int row = drops[time][0]; 
            int col = drops[time][1];
            grid[row * n + col] = time;
        }
        
        int limitC = n - w + 1;
        int [] rowMin = new int [m * limitC];
        
        for(int r = 0; r<m ; r++){
            Deque<Integer> deque = new ArrayDeque<>();//인덱스 저장용 덱 
            for(int c = 0; c<n ; c++){
                //윈도우 범위를 벗어난 맨 왼쪽 원소 제거 
                if(!deque.isEmpty() && deque.peekFirst() <= c-w){
                    deque.pollFirst();
                }
                //현재 값 보다 큰 이전 값들은 최솟값 후보가 될 수 없으므로 제거 
                int val = grid[r * n + c];
                while(!deque.isEmpty() && grid[r * n + deque.peekLast()] >= val){
                    deque.pollLast();
                }
                deque.addLast(c);
                
                if(c >= w -1){
                    rowMin[r * limitC + (c - w + 1)] = grid[r * n + deque.peekFirst()];
                }
            }
        }
        
        //3. 세로 방향(col 별)으로 크기 h 의 슬라이딩 윈도우 최적화 
        //선인장 시작점이 가질 수 있는 최종결과 탐색 
        int limitR = m - h + 1;
        int maxTime = -1;
        int ansR = 0; 
        int ansC = 0; 
        
        int [] colFinalMin = new int [limitR * limitC];
        for(int c = 0; c<limitC; c++){
            Deque<Integer> deque = new ArrayDeque<>(); 
            for(int r = 0; r<m; r++){
                if(!deque.isEmpty() && deque.peekFirst() <= r -h){
                    deque.pollFirst();
                }
                int val = rowMin[r * limitC + c];
                while(!deque.isEmpty() && rowMin[deque.peekLast() * limitC + c] >= val){
                    deque.pollLast();
                }
                deque.addLast(r);
                
                if(r >= h -1){
                    colFinalMin [(r - h +1) * limitC + c] = rowMin[deque.peekFirst() * limitC + c];
                }
            }
        }
        
        //4. 최종 최적의 위치 찾기 
        for(int r = 0; r<limitR; r++){
            for(int c = 0; c<limitC; c++){
                int time = colFinalMin[r * limitC + c];
                //끝까지 비를 안맞았으면 정답 
                if(time ==INF){
                    return new int []{r,c}; 
                }
                
                //가장 늦게 맞는 곳 
                if(time> maxTime){
                    maxTime = time;
                    ansR = r;
                    ansC = c;
                }
            }
        }
        return new int []{ansR, ansC};
        
        
    }
}