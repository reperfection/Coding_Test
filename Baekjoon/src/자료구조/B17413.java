package 자료구조;
// 단어 뒤집기2 - 스택

import java.io.*;
import java.util.Stack;

public class B17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        br.close();

        Stack<Character> stack = new Stack<>();
        boolean check = false;	// <>안밖 구분
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            // 열린 꺽새를 만났을 경우, stack이 비어있지 않다면 모든 원소를 꺼내고 check를 true
            if (str.charAt(i) == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                check = true;
            }
            // 닫힌 꺽새를 만났을 경우, check를 false로 입력 후 '>'저장
            else if (str.charAt(i) == '>') {
                check = false;
                sb.append(str.charAt(i));
                continue;
            }

            // check가 true일 경우, '>'를 만나기 전까지 그대로 입력
            if (check == true) {
                sb.append(str.charAt(i));
            }
            // check가 false일 경우, 괄호 이외의 문자를 처리
            else if (check == false) {
                // 해당 인덱스의 i번째 문자가 공백일 경우, 모든 원소를 POP수행 후 공백 추가
                if (str.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    continue;
                } else {
                    // 그외의 경우, Stack에 문자 추가
                    stack.push(str.charAt(i));
                }
            }

            // 반복문이 마지막 횟수일 때, 스택이 비어있지 않다면 원소 추가
            if (i == str.length() - 1) {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}