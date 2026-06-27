import java.util.*;

class Solution {
    
    private Map<String,Integer> dp = new HashMap<>();
    
    public int solution(int dist_limit, int split_limit) {
        
        if(dist_limit == 0)return 1; 

        return getMaxLeaf(dist_limit, split_limit, 1);
    }
    
    private int getMaxLeaf(int dist, int split, int N){
        
        //더 이상 노드를 쪼갤 dist 가 없거나, 분배도 제약(split)이 1이하가 되면 현재 층에 있는 N개의 노드들은 더 이상 자라지 못하고 전부 리프 노드가 된다. 
        if(dist == 0 || split<=1){
            return N;
        }
        
        //메모제이션 체크 : 이미 똑같은 상태를 계산한 적이 있다면 바로 반환
        String key = dist + ":" +split +":" + N;
        if(dp.containsKey(key)){
            return dp.get(key);
        }
        
        //현재 층에서 실제 분배 노드로 만들 수 있는 최대 개수 구하기 
        //내가 가진 노드 (N) 보다 dist 가 적다면 dist 만큼만 쪼갤 수 있음
        int splitCount = Math.min(N, dist);
        
        //이번 층에서 안 쪼개고 그냥 리프노드로 멈춰 세울 노드의 개수 
        int leafHere = N - splitCount; 
        
        //선택지 1 : 이번 층을 2배 분기 층으로 결정 했을때 최종 리프 노드 수
        int case2 = leafHere + getMaxLeaf(dist-splitCount, split/2, splitCount*2 );
        
        //선택지2 : 이번 층을 3배 분기 층으로 결정했을때 최종 리프 노드 수 
        int case3 = 0; 
        if(split > 2){
             case3 = leafHere + getMaxLeaf(dist - splitCount, split/3 , splitCount*3);
        }
        
        
        //두가지 중 더 많은 리프 노드를 만드는 값을 고른다
        int result = Math.max(case2, case3);
        
        dp.put(key, result);
        return result;
    }
}