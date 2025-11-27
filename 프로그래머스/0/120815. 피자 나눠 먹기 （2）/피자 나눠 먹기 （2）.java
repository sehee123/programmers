class Solution {
    public int solution(int n) {     
        int gcd = gcd(n,6);
        
        return n/gcd;
    }
    public int gcd(int a, int b){
        
        while(b != 0){
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}