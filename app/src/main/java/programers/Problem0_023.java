package programers;
//주사위 게임 2
class Problem0_023 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a==b||a==c||b==c) {
            if (a==b&&a==c) {
                answer += (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
            } else {
                answer += (a+b+c)*(a*a+b*b+c*c);
            }
        } else {
            answer += a+b+c;
        }
        return answer;
    }
}
