class Solution {
//마지막 두 원소
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        if (num_list[num_list.length - 2] < num_list[num_list.length - 1]) {
            answer[answer.length-1] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            answer[answer.length-1] = num_list[num_list.length - 1] * 2;
        }
        return answer;
    }
}

class Solution {
//수 조작하기1
    public int solution(int n, String control) {
        int answer = 0;
        for (int i=0; i<control.length(); i++) {
            if (control.charAt(i)=='w') {
                n += 1;
            } else if (control.charAt(i)=='s') {
                n -= 1;
            } else if (control.charAt(i)=='d') {
                n += 10;
            } else if (control.charAt(i)=='a') {
                n -= 10;
            }
        }
        return answer = n;
    }
}

class Solution {
//수 조작하기2
    public String solution(int[] numLog) {
        String answer = "";
        for (int i=0; i<numLog.length; i++) {
            if (numLog[i+1]==numLog[i]+1) {
                answer += "w";
            } else if (numLog[i+1]==numLog[i]-1) {
                answer += "s";
            } else if (numLog[i+1]==numLog[i]+10) {
                answer += "d";
            } else if (numLog[i+1]==numLog[i]-10) {
                answer += "a";
            }
            if (answer.length()==numLog.length-1) break;
        }
        return answer;
    }
}

class Solution {
//수열과 구간 쿼리3
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int num = 0;
        for (int i=0; i<queries.length; i++) {
            num = arr[queries[i][1]];
            arr[queries[i][1]] = arr[queries[i][0]];
            arr[queries[i][0]] = num;
            // for (int j=0; j<arr.length; j++) {
            //     System.out.print(arr[j]);
            // }
        }
        return answer = arr;
    }
}

import java.util.*;
		class Solution {
            //수열과 구간 쿼리 2
		    public int[] solution(int[] arr, int[][] queries) {
		        int[] result = new int[queries.length];
		        Arrays.fill(result, Integer.MAX_VALUE);
		        for(int i=0; i<queries.length;i++){
		           for(int j=queries[i][0]; j<queries[i][1];j++){
		               if(queries[i][2] < arr[j]){
		                  if(result[i] > arr[j]){
		                      result[i] = arr[j];
		                  }
		               }if(result[i] == Integer.MAX_VALUE){
		                   result[i] = -1;
		               }
		              
		           }
		    
		        }
		    
		        return result;
		    }
		}
