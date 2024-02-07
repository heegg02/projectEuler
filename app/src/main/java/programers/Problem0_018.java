package programers;
//홀짝에 따라 다른 값 변환하기
class Problem0_018 {
    public int solution(int n) {
        int answer = 0;
        if(n % 2==0){
            for(int i=0; i <= n; i+=2){
                answer += i*i;
            }
        }else {
            for(int i=1; i <= n; i+=2){
                answer += i;
            } 
        }
        return answer;
    }
}