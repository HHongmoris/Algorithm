class Solution {
    public int solution(int price) {
        int answer = 0;
        answer = price;
        if(price>=100000 && price<300000){
            answer = price*95/100;
        }else if(price>=300000 && price<500000){
            answer = price*90/100;
        }else if(price>=500000){
            answer = price*80/100;
        }
        return answer;
    }
}