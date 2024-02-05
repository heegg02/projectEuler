package programers;
public class Problem0_010 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
            if(i==s){
                answer += overwrite_string;
                i += overwrite_string.length();
            }
        if(i==my_string.length()) break;
        answer += my_string.charAt(i);
        }
        return answer;
    }
}
