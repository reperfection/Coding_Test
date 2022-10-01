package 자료구조;

// 좋은 단어 - 스택
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class B3986 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int len = Integer.parseInt(br.readLine());
        int goodword = 0;
        for(int i=0; i<len; i++) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            for(int j=0; j<str.length(); j++) {
                if(j==0)
                    stack.push(str.charAt(j));

                else if(stack.isEmpty())
                    stack.push(str.charAt(j));

                else if(str.charAt(j)==stack.peek())
                    stack.pop();

                else if(str.charAt(j)!=stack.peek())
                    stack.push(str.charAt(j));

            }
            if(stack.isEmpty())
                goodword++;
        }
        bw.write(Integer.toString(goodword));
        bw.flush();
        bw.close();
    }
}

