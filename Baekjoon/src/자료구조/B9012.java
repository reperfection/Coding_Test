// 괄호
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class B9012 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++) {
            Stack <Character> stack = new Stack<>();
            String vps = br.readLine();

            for(int j=0; j<vps.length(); j++) {
                if(vps.charAt(j)=='(')
                    stack.push(vps.charAt(j));
                else {
                    if(stack.contains('('))
                        stack.pop();
                    else
                        stack.push(vps.charAt(j));
                }
            }
            if(stack.isEmpty()) {
                bw.write("YES");
                bw.newLine();
            }
            else {
                bw.write("NO");
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}