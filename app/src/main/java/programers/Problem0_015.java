package programers;

public class Problem0_015 {
    public int solution(int a, int b) {
        int answer = 0;
        
        double c = (int)(Math.log10(b)+1);
        int d = b+(int)(a*Math.pow(10, c));
        
        int f = 2*a*b;

        if(d > f) {
            answer = d;
        } else {
            answer = f;
        }
        return answer;
    }
}