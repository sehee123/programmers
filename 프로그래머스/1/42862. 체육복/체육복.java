import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 리스트로 변환
        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());

        // 여벌이 있지만 도난당한 학생 처리
        List<Integer> intersection = lostList.stream()
                                             .filter(reserveList::contains)
                                             .collect(Collectors.toList());
        reserveList.removeAll(intersection);
        lostList.removeAll(intersection);

        int cnt = n - lostList.size(); // 도난당한 학생 제외

        // 작은 번호부터 체육복을 빌리도록 정렬
        Collections.sort(lostList);

        // 체육복 빌려주기
        for (int i = 0; i < lostList.size(); i++) {
            int student = lostList.get(i);
            if (reserveList.contains(student - 1)) {
                reserveList.remove(Integer.valueOf(student - 1));
                cnt++;
            } else if (reserveList.contains(student + 1)) {
                reserveList.remove(Integer.valueOf(student + 1));
                cnt++;
            }
        }
        
        return cnt;
    }
}
