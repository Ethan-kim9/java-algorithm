package programmers.ch01;
import java.util.ArrayList;
import java.util.List;

//폰켓몬 level 1
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> options = new ArrayList<>(); // 리스트를 중복을 제거해준다.
        for(int num :nums){
            if(!options.contains(num)){
                options.add(num);// 리스트에 해당 배열이 없을 경우 리스트를 더해줌 (리스트 사이즈 = 중복되지 않은 총 숫자)
            }
        }
        answer = options.size() > nums.length/2 ?  nums.length/2 : options.size();
        // 뽑을 수 있는 수(nums의 크기 /2) 보다, 중복되지 않은 숫자가 클 경우 뽑을 수 있는 수까지만 반환
        return answer;
    }
}
// 친구는 Hash를 이용하여 문제를 해결했고, 더 좋은 점수를 받았다. 어레이리스트가 아닌 해쉬로 문제를 푸는 방법에 대해 고민해보자.

public class Main {
    public static void main(String[] args) {
    }
}
