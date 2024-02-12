package programers;
//코드 처리하기
class Problem0_021 {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int i=0; i<code.length(); i++) {  
            if (code.charAt(i) == '1') {
                if (mode == 1) {
                    mode--;
                } else {
                    mode++;
                }
                continue;
            }
            if (mode == 0) {
                if (i%2==0) {
                    answer += code.charAt(i);
                }
            } else if (mode == 1) {
                if (i%2==1) {
                    answer += code.charAt(i);
                }
            }
        }
        if (answer.equals("")){
            answer += "EMPTY";
        }
        return answer;
    }
}

