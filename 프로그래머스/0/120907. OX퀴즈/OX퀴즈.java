class Solution {
    public String[] solution(String[] quiz) {
        int len = quiz.length;
        String[] result = new String [len];
        
        for(int i =0; i<len; i++){
            String str = quiz[i];
            String [] array = str.split(" ");
            
            int x = Integer.parseInt(array[0]);
            String operator = array[1];
            int y = Integer.parseInt(array[2]);
            int z = Integer.parseInt(array[4]);
            
            
            int caculation = 0;
            switch (operator){
                case "+":
                    caculation= x + y ;
                    break;
                case "-":
                    caculation = x- y;
                    break;
            }
            if(caculation == z){
                result [i] = "O";
            }else{
                result [i] = "X";
            }
            
        }
        
        return result;
    }
}