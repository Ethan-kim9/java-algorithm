package programmers.ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//폰켓몬
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int targetNum = nums.length/2;
        List<Integer> options = new ArrayList<>();
        options.add(nums[0]);

        for(int num :nums){
            if(!options.contains(num)){
                options.add(num);
            }
        }
        answer = options.size() > targetNum ?  targetNum : options.size();
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
    }
}
