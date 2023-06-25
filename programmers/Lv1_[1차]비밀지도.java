class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] answer = new String[n];
        String tmp = "";

        // arr1, arr2 의 값을 2진수 변환 -> 2진수를 #, 공백 문자열로 변환 
        for(int i = 0; i < n; i++){
            tmp = Integer.toBinaryString(arr1[i] | arr2[i]);    // 1101 == 01101
            while(tmp.length() < n){
                tmp = "0" + tmp;    // "0" + "1101"
            }
            tmp = tmp.replaceAll("1", "#");
            tmp = tmp.replaceAll("0", " ");
            answer[i] = tmp;

            System.out.println("완성된 문자열 : " + tmp);
        }


        return answer;
    }
}
