import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
      
        return my_string.toLowerCase()
            .chars()
            .mapToObj(s -> String.valueOf((char)s))
            .sorted()
            .collect(Collectors.joining());
    }
}