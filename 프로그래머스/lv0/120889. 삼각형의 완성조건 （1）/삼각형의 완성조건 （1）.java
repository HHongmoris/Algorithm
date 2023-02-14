class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int l = 0;
        int sum = 0;
        for(int i=0; i<3; i++) {
        	if(sides[i]>l) {
        		l = sides[i];
        	}
        	sum += sides[i];
        }
        if((sum-l)>l) {
        	answer = 1;
        }else {
        	answer = 2;
        }
        return answer;
    }
}