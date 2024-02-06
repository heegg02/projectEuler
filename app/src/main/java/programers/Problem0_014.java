package programers;
public class Problem0_014 {
    public int solution(int a, int b) {
        int answer = 0;
        double c = 0.0;
        
        c = (int)(Math.log10(b)+1);
        int d = b+(int)(a*Math.pow(10, c));
        
        c = (int)(Math.log10(a)+1);
        int f = a+(int)(b*Math.pow(10, c));
        
        if(d > f) {
            answer = d;
        } else {
            answer = f;
        }
        return answer;
    }
}