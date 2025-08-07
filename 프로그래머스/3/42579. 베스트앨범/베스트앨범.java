import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        
        //장르별 count
        Map<String, Integer> genreMap = new HashMap<>();
        //장르,노래별 count
        Map<String, Map<Integer,Integer>> musicCntMap = new HashMap<>();
        
        for(int i =0; i<genres.length; i++){
            String genre = genres[i];
            if(genreMap.containsKey(genre)){
                genreMap.put(genre, genreMap.get(genre)+ plays[i]);
                
                musicCntMap.get(genre).put(i,plays[i]);
            }else{
                genreMap.put(genre, plays[i]);
                
                Map<Integer,Integer> music = new HashMap<>();
                music.put(i, plays[i]);
                musicCntMap.put(genre, music);
            }
        }
        
        //정렬
        List<String> genreKeys = new ArrayList<>(genreMap.keySet());
        genreKeys.sort(Comparator.comparingInt(genreMap::get).reversed());
        
        List <Integer> answer = new ArrayList<>();
        for(String genre : genreKeys){
            Map<Integer, Integer> music = musicCntMap.get(genre);
            List<Integer> musics = new ArrayList<>(music.keySet());
            musics.sort(Comparator.comparingInt(music::get).reversed());
            answer.add(musics.get(0));
            if(musics.size()>1)answer.add(musics.get(1));
        }
        
        return answer.stream().mapToInt(i ->i).toArray();
    }
}