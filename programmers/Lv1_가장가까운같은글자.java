class Solution {
    public int[] solution(String s) {

        char[] charArr = s.toCharArray();
        int[] answer = new int[charArr.length];

        for(int i = 0; i < charArr.length; i++){
            if(i == 0){
                answer[i] = -1;
            }else{
                if(s.lastIndexOf(charArr[i], i - 1) == -1){
                    answer[i] = -1;
                }else{
                    answer[i] = i - s.lastIndexOf(charArr[i], i - 1);
                }
            }
        }

        return answer;
    }
}
