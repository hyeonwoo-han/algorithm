import java.util.HashMap;
// import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];   // 사진 개수만큼 배열 설정

        HashMap<String, Integer> yearningByName = new HashMap<>();

        // 1. 이름과 점수를 담은 hashmap 생성
        for(int i = 0; i < name.length; i++){
            yearningByName.put(name[i], yearning[i]);
        }

        // 2. 사진에 점수 할당
        for(int i = 0; i < photo.length; i++){
            // i번째 사진
            for(int j = 0; j < photo[i].length; j++){
                // i번째 사진의 j번째 사람
                // i번째 사진의의 j번째 사람 이름이 map에 있으면 점수추가, 없으면 0
                answer[i] += yearningByName.getOrDefault(photo[i][j], 0);
            }
        }

        return answer;
    }
}
