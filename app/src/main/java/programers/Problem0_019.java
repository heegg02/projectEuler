package programers;
//조건 문자열
class Problem0_019 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean bool = false;
        if(ineq.equals(">")) {
            if(eq.equals("=")) {
                if (n>=m) answer++;
            } else {
                if (n>m) answer++;
            }
        } else {
            if(eq.equals("=")) {
                if (n<=m) answer++;
            } else {
                if (n<m) answer++;
            }
        }
        return answer;
    }
}