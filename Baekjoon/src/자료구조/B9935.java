package 자료구조;

// 문자열 폭발 - 스택

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class B9935 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<String> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();

        String str = br.readLine();

        String check = br.readLine();
        br.close();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)==check.charAt(0)) {
                if(str.substring(i, i+check.length()-1).equals(check.substring(0, check.length()-1))) {
                    i = i+check.length()-1;
                    break;
                }

            }

            else {
                char word = str.charAt(i);
                String word1 = Character.toString(word);
                stack.push(word1);
            }
        }

        if(stack.size()==0) {
            bw.write("FRULA");
        }

        else {
            while(stack.empty()!=true)
                stack1.push(stack.pop());

            while(stack1.empty()!=true)
                bw.write(stack1.pop());
        }
        bw.flush();
        bw.close();
    }
}
