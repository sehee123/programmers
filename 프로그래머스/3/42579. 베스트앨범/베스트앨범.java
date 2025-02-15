import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genre = new HashMap<>();
        Map<String , Map<Integer, Integer>> album = new HashMap<>();
        for(int i = 0; i< genres.length; i++){
            if(genre.containsKey(genres[i])){
                genre.put(genres[i], genre.get(genres[i])+plays[i]);

                album.get(genres[i]).put(i,plays[i]);
            }else{
                genre.put(genres[i],plays[i]);

                Map<Integer, Integer> map = new HashMap<>();
                map.put(i, plays[i]);
                album.put(genres[i] , map);
            }
        }

        //정렬
        List<String> keySet = new ArrayList<>(genre.keySet());
        keySet.sort(Comparator.comparingInt(genre::get).reversed());

        List <Integer> answer = new ArrayList<>();
        for(String key : keySet){
            Map<Integer,Integer> map = album.get(key);
            List<Integer> list = new ArrayList<>(map.keySet());
            list.sort(Comparator.comparingInt(map::get).reversed());
            answer.add(list.get(0));
            if(list.size()>1)answer.add(list.get(1));
        }
        return answer.stream()
                     .mapToInt(i -> i)
                     .toArray(); 
        
    }
}