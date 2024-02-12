package programers;
//등차수열의 특정한 항만 더하기
class Problem0_022 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int c = a;
        for (int i = 0; i<included.length; i++) {
            if (included[i]) {
                answer += c;
            }
            c+=d;
        }
        return answer;
    }
}

