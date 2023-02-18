class Solution {
    public String solution(String my_string) {
        
        char[] str = my_string.toCharArray();
        char[] nstr = new char[str.length];
        for(int i=0; i<str.length; i++){
            nstr[i] = str[str.length-1-i];
        }
        String answer = new String(nstr);
        return answer;
    }
}