import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        char[] str = S.toCharArray();
        int[] alp = new int[26];

        for(int i=0; i<26; i++){
            alp[i] = -1;
        }
        for(int i=0; i<str.length; i++){
            int check = str[i] - 97;
            if(alp[check] == -1){
                alp[check] = i;
            }
        }

        for(int i=0; i<26; i++){
            System.out.print(alp[i]+" ");
        }


    }
}