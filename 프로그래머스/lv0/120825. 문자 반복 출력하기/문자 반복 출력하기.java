class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] tr = my_string.toCharArray();
        for(int i=0; i<tr.length; i++) {
        	for(int j=0; j<n; j++) {
        		answer += tr[i];
        	}
        }
        return answer;
    }
}