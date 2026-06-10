import java.util.*;

class Genre {
    String name;
    int count;
    
    public Genre (String name , int count){
        this.name = name;
        this.count = count;
    }
}

class Solution {
    
    public int[] solution(String[] genres, int[] plays) {
        
        int len = genres.length;
        
        Map<String,Integer> genreCount = new HashMap<>();
        Map<String,PriorityQueue<int []>> songOrderBy = new HashMap<>();
        
        for(int i =0; i<len; i++){
            String key = genres[i];
            
            genreCount.put(key, genreCount.getOrDefault(key,0)+plays[i]);
            songOrderBy.computeIfAbsent(key, k-> 
                                       new PriorityQueue<>((p1,p2) -> {
                //재생 횟수 
                if(p1[0] != p2[0]) return Integer.compare(p2[0],p1[0]);
                //고유번호 
                return Integer.compare(p1[1],p2[1]);
            })).offer(new int []{plays[i],i}); 
        }
        
        PriorityQueue<Genre> genreOrderBy = new PriorityQueue<>((g1,g2)-> Integer.compare(g2.count,g1.count));
        
        for(Map.Entry<String,Integer> entry :genreCount.entrySet()){
            genreOrderBy.offer(new Genre(entry.getKey(),entry.getValue()));
        }
        
        List<Integer> answer = new ArrayList<>();
        
        while(!genreOrderBy.isEmpty()){
            
            Genre g = genreOrderBy.poll();
            
            PriorityQueue<int []> pq = songOrderBy.get(g.name);
            
            int count = 0;
            
            while(!pq.isEmpty() && count <2){
                count ++;
                answer.add(pq.poll()[1]);
            }
            
        }
        
        return answer.stream().mapToInt(k->k).toArray();
    }
}