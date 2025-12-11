class Solution {
    public int solution(int n) {
        double sqrt = Math.sqrt(n);
        return n%sqrt==0?1:2;
    }
}