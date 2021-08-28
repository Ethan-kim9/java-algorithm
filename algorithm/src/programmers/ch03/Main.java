package programmers.ch03;
//삼진법 뒤집기 (Level 1)
class Solution {
    public int solution(int n) {
        int answer = 0;
        String third = "";

        while (n > 0) {
            if ((n % 3) < 10) {
                third +=n%3;
                n /= 3;
            }
        }
        System.out.println("뒤집힌 삼진법 >" + third);

        // 뒤집어서 10진법
//        int reverse =1;
//        for (int i = 0; i < third.length(); i++) {
//            answer += Integer.parseInt(third.charAt((third.length()-i) -1)+"") *reverse;
//            reverse *=3;
//        }
        answer = Integer.parseInt(third,3);
        // 있는거 잘 찾아보고 가져다 쓰자..

        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(45));
    }
}
