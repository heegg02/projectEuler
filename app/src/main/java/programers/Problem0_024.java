package programers;
//원소들의 곱과 합
class Problem0_024 {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 0;
        int b = 1;
        for (int i=0; i<num_list.length; i++) {
            a += num_list[i];
        }
        a=(int)(Math.pow(a, 2));
        for (int i=0; i<num_list.length; i++) {
            b *= num_list[i];
        }
        if(a>b) answer=1;
        return answer;
    }
}

