import java.util.*;

class Solution {
    private static class Song{

        int idx;
        int plays;
        
        Song(int idx, int plays){
            this.idx = idx; 
            this.plays =plays;
        }

    }
    public int[] solution(String[] genres, int[] plays) {
    
        Map<String, Integer> genreTotal = new HashMap<>();
        Map<String, List<Song>> byGenre = new HashMap<>();
        
        for(int i =0; i<genres.length; i++){
            String genre = genres[i];
            int play = plays[i];
            
            genreTotal.put(genre, genreTotal.getOrDefault(genre,0)+plays[i]);
            byGenre.computeIfAbsent(genre, k-> new ArrayList<>()).add(new Song(i, play));
        }
        
        List<String> genreOrder = new ArrayList<>(genreTotal.keySet());
        genreOrder.sort((a,b)-> genreTotal.get(b) - genreTotal.get(a));
        
        List<Integer> answer = new ArrayList<>();
        for(String genre: genreOrder){
            List<Song> songs = byGenre.get(genre);
            songs.sort((s1,s2) -> {
                if(s1.plays != s2.plays) return s2.plays-s1.plays; 
                return s1.idx - s2.idx; 
            });
            for(int k = 0; k<songs.size() && k<2; k++){
                answer.add(songs.get(k).idx);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
        
    }
}