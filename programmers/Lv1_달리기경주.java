import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 바뀔 대상 tmp 저장 
        // 추월자 이동 
        // 바뀔 대상 이동
        HashMap<String, Integer> playersMap = new HashMap<>();
        String frontPlayer = "";

        for(int i = 0; i < players.length; i++){
            playersMap.put(players[i], i);
        }

        for(String called : callings){
            int rating = playersMap.get(called);  // 불린 선수 순위 

            // 자리바꾸기
            frontPlayer = players[rating - 1];  // 불린 선수 앞 선수 이름
            players[rating - 1] = called;
            players[rating] = frontPlayer;

            // Map에 바뀐 순서 반영
            playersMap.put(frontPlayer, rating);
            playersMap.put(called, rating - 1);
        }

        return players;




//         String[] answer = new String[players.length];
//         String tmp = "";

//         for(int i = 0; i < callings.length; i++){
//             for(int j = 0; j < players.length; j++){
//                 if(players[j].equals(callings[i])){
//                     tmp = players[j - 1];
//                     players[j - 1] = players[j];
//                     players[j] = tmp;
//                 }
//             }
//         }

//         return players;
    }
}
