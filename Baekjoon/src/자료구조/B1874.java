package src.자료구조;

// 스택 수열
// 메모리 초과->출력 형식 문제->시간초과->런타임에러(emptystack)->성공
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;

public class B1874 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());
        Stack<Integer>stack = new Stack<>();
        Stack<Integer>numStack = new Stack<>();
        ArrayList<Character> list = new ArrayList<>();
        String no = "";
        for(int i=size; i>=1; i--) {
            numStack.push(i);
        }
        int check = 0;
        for(int i=0; i<size; i++) {
            int temp = Integer.parseInt(br.readLine());
            while(true) {
                if(stack.isEmpty()||(stack.peek()<temp&&numStack.isEmpty()==false)) {
                    list.add('+');
                    list.add('\n');
                    //yes = yes + "+"+ "\r\n";
                    if(!numStack.isEmpty())
                        stack.push(numStack.pop());
                    else {
                        no = "NO";
                        check++;
                        break;
                    }
                }
                else if(!stack.contains(temp)&&numStack.isEmpty()) {
                    no = "NO";
                    check++;
                    break;
                }
                else if(stack.peek()==temp){
                    //sb.append("-");
                    //sb.append("\r\n");
                    list.add('-');
                    list.add('\n');
                    //yes = yes + "-"+ "\r\n";
                    stack.pop();
                    break;
                }
                else if(stack.contains(temp)) {
                    //sb.append("+");
                    //sb.append("\r\n");
                    list.add('+');
                    list.add('\n');
                    //yes = yes + "-"+ "\r\n";
                    stack.pop();
                }
                else {
                    no = "NO";
                    check++;
                    break;
                }
            }
            if(check==1)
                break;
        }
        if(no.contains("NO"))
            bw.write(no);
        else {
            for(char word : list)
                //bw.write(sb.toString());
                bw.write(word);
        }
        bw.flush();
        bw.close();
    }
}
