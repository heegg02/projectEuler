package programers;
public class Problem0_013 {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i=0; i<k; i++) {
            answer += my_string;
        }
        return answer;
    }
}
