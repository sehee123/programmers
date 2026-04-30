
import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int [] student = new int [n+1];
        
        Arrays.fill(student,1);
        
        for(int r: reserve){
            student[r]++; // 체육복 두개임
        }
        
        for(int l : lost){
            student[l]--; // 체육복 도난
        }
        
        for(int i =1; i<student.length; i++){
            //체육복 없음
            if(student[i] ==0){
                if(student[i-1]>1 && i>1){
                    answer ++;
                    student[i-1] --;
                }else if(i+1<student.length && student[i+1]>1){
                    answer ++;
                    student[i+1] --;
                }
            }else if(student[i]>0){
                answer ++;
            }
        }
        
        return answer;
    }
}