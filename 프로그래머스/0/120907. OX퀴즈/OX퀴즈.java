class Solution {
    public String[] solution(String[] quiz) {
        int len = quiz.length;
        String[] result = new String [len];
        
        for(int i =0; i<len; i++){
            String [] array = quiz[i].split(" ");
            
            int x = Integer.parseInt(array[0]);
            String op = array[1];
            int y = Integer.parseInt(array[2]);
            int z = Integer.parseInt(array[4]);

            int calc = op.equals("+")?x+y :x-y;
            result[i] = calc==z?"O":"X";
        }
        
        return result;
    }
}