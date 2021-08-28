package programmers.ch02;


class Solution {

    // 기능개발 <- level 2 ,꼭 다시풀자..
    public int[] solution(int[] progresses, int[] speeds) {

        int[] temp = new int[100];
        int day = 0;

        for(int i = 0; i < progresses.length; i++){
            while(progresses[i] + (speeds[i] * day) < 100){
                day++;
            }
            temp[day]++;
        }
        // 테스크가 모두 끝났을 때의 사이즈
        int doneJob = 0;
        for(int n : temp){
            if(n != 0) doneJob++;
        }
        int[] answer = new int[doneJob];

        doneJob = 0;
        for(int n : temp){
            if(n != 0) answer[doneJob++] = n;
        }
        return answer;
    }
}



public class Main2 {

}
