import java.util.ArrayList;
import java.util.stream.*;

class Solution {
    public int solution(String t, String p) {
        
        int answer = 0;
        long pLong = 0;
        try{
            pLong = Long.parseLong(p);
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
        
        for(int i = 0; i <= t.length() - p.length(); i++){
            String tmp = t.substring(i, i + p.length());
            // System.out.print("tmp: " + tmp);
            try{
                long tmpLong = Long.parseLong(tmp);
                // System.out.println(", tmpInt: " + tmpInt);
                if(tmpLong <= pLong){
                    answer++;
                }
            }catch(NumberFormatException e){
                e.printStackTrace();
            }
        }
        
        // 부분문자열 t 리스트
        // ArrayList<String> intTList = IntStream.rangeClosed(0, t.length() - p.length())
        //     .mapToObj(index -> t.substring(index, index + p.length()))
        //     .collect(Collectors.toCollection(ArrayList::new));
            
        
        // 리스트 순회하며 비교 
        // for(String item : intTList){
        //     try{
        //         int tmp = Integer.parseInt(item);
        //         if(tmp <= intP){
        //             answer++;
        //         }
        //     }catch(NumberFormatException e){
        //         e.printStackTrace();
        //     }
        // }
            
        return answer;
    }
}
