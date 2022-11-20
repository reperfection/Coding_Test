package Implementation;

// 팰린드롬인지 확인하기
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10988 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringBuffer sb = new StringBuffer(str);
        String rev = sb.reverse().toString();

        int check = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)!=rev.charAt(i)) {
                break;
            }
            else if(i==str.length()-1 && str.charAt(i)==rev.charAt(i))
                check++;
        }
        bw.write(Integer.toString(check));
        bw.flush();
        bw.close();
    }
}
