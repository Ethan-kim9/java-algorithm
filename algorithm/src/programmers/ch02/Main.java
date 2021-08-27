package programmers.ch02;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionFail {
    public int[] solution(int[] progresses, int[] speeds) {

        int[] answer = {};
        List<Integer> schedule = new ArrayList<>(); // 배포일에 배포할 총 테스크 수
        boolean release; // 배포
        int doneJob;     // 배포할 수 있는 테스크들

        // 하루가 지날 때마다 while문이 돌아감(무한반복)
        while(true)// 테스크가 다 배포되어 없으면 while문 종료
            if(progresses.length == 0){
                break;
            }
        {
            release = false;
            doneJob = 0;

            for (int i = 1; i < progresses.length - 1; i++) {
                progresses[i]+=speeds[i];
            }
            release = progresses[0]>=100 ? true : false; // 첫 과업이 종료되는 경우 == 배포할 경우
            // 배포할 경우?
            if(release){
                for(int i =0; i<progresses.length; i++){
                    if(progresses[i] < 100){
                        int newSize = progresses.length-i;
                        int [] newArr = new int[newSize];
                        int [] newArr2 = new int[newSize];

                        for(int j=0; j < newSize; j++){
                            newArr[j] = progresses[i+j];
                            newArr2[j] = speeds[i+j];
                        }
                        progresses = newArr;
                        speeds = newArr2;
                    }
                    doneJob++; // 배포할 것들을 하나씩 더해줌
                }
                schedule.add(doneJob);
            }
            release = false;// release 초기화
        }

        // 배포일정에 맞춰 배포된 것들을 int arr 에 담아 반환
        for(int i = 0; i<schedule.size(); i++){
            answer[i] = schedule.get(i);
        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int [] progresses = {93, 30, 55};
        int [] speeds = {1, 30, 5};

        SolutionFail s = new SolutionFail();

        System.out.println(s.solution(progresses,speeds));
    }
    }
