class Solution {
    public int solution(int n) {
        int nCount = getOneCount(n);
        int count = 0;
        while(nCount != count){
            n++ ;
            count = getOneCount(n);
        }
        return n;
    }
    public int getOneCount(int num){
        int count = 0; 
        while(num > 0){
            if((num & 1) ==1){
                count ++;
            }
            num >>>= 1;
        }
        return count;
    }
}