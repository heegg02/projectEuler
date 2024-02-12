package programers;
//이어 붙인 수
class Problem0_025 {
    public int solution(int[] num_list) {
        int answer = 0;
        String a = "";
        String b = "";
        for(int i=0; i<num_list.length; i++) {
            if (num_list[i]%2==1) {
                a += num_list[i];
            } else {
                b += num_list[i];
            }
        }
        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);
        return answer = aa+bb;
    }
}

