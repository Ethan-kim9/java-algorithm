package programmers.solution92334;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    /* 신고관련 해시맵 (신고당한 사람 , 신고한 사람[리스트])
     * 리스트 사이즈가 리미트보다 크면, 신고당한 사람은 정지 및 신고한 사람전원에게 문자가 가는 문제
     * */
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];


        /* 개인이 신고한 아이디들을 묶어주는 맵
        * 해시셋은 중복된 값을 허용하지 않기 때문에 해시셋에 아이디를 넣어주면, 동일인이 중복신고 된 경우에도 카운팅 되지 않는다.
        *  */
        HashMap<String, HashSet<String>> reportedMap = getReportMap(id_list,report);
        HashMap<String, Integer> idCheckMap = getIdCheckMap(id_list);
        answer = calculateWithLimit(reportedMap, idCheckMap , id_list ,k);
        return answer;
    }

    // 마지막
    private HashMap<String, Integer> getIdCheckMap(String[] id_list) {
        HashMap<String, Integer> idCheckMap = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            idCheckMap.put(id_list[i], i);
        }
        return idCheckMap;
    }

    private int[] calculateWithLimit(HashMap<String, HashSet<String>> reportedMap,
                                     HashMap<String , Integer> idCheckMap,
                                     String[] ids,
                                     int limit) {

        int returnValue [] = new int[ids.length];

        for (int i = 0; i < ids.length; i++) {
            HashSet<String> reporters = reportedMap.get(ids[i]); // 신고 대상을 신고한 아이디들의 묶음 reporters
            if(reporters.size() >= limit){
                for(String name : reporters){
                    returnValue[idCheckMap.get(name)] ++;
                }
            }
        }
        return returnValue;
    }

    // 리포트를 해시맵에 담아주기 위한 메서드
    public HashMap<String,HashSet<String>> getReportMap(String [] ids, String[] reports){
        HashMap<String,HashSet<String>> reportedMap = new HashMap<>();

        for(String id :ids){
            reportedMap.put(id,new HashSet<>()); // 초기화 작업 진행
        }
        for (String report: reports) { // 해시맵의 셋에 신고자들 담아줌
            String[] reportDetail = report.split(" ");
            String reporter = reportDetail[0];
            String reported = reportDetail[1];
            reportedMap.get(reported).add(reporter);
        }
        return reportedMap;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        String [] idList = {"muzi", "frodo", "apeach", "neo"};
        String [] reportList = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int[] ints = solution.solution(idList, reportList, 2);

        for (int i:
             ints) {
            System.out.print(i + " ");
        }
    }
}

