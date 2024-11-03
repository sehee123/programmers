import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


class Solution {
    public String[] solution(String[] record) {
     
        
        ArrayList <String> arrList = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        
        for(String msg : record) {
			String strArr [] = msg.split(" ");
			if(strArr[0].equals("Enter") || strArr[0].equals("Change") ) {
				map.put(strArr[1], strArr[2]);
			}
		}
        
        	for(int i = 0 ; i<record.length; i++) {
			String strArr [] = record[i].split(" ");
			
			String result = map.get(strArr[1])+"님이 ";
			
			if(strArr[0].equals("Enter") || strArr[0].equals("Leave") ) {
				switch (strArr[0]) {
					case "Enter" :
						result = result + "들어왔습니다.";
						break;
					case "Leave" :
						result = result + "나갔습니다.";
						break;
				}
				arrList.add(result);
			}
			
		}
		String [] answer = new String [arrList.size()];
		answer = arrList.toArray(answer);
        return answer ;
        
       
    }
}