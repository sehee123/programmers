class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        
        for(int i = 1; i<n ; i=i*2) {
			answer ++;
			if(a/2+a%2 == b/2+b%2) {
				break;
			}
			a = a/2+a%2;
			b = b/2+b%2;
		}

        return answer;
    }
}