package String;
// 행복한지 슬픈지
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10769 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int happy = 0;
        int sad = 0;

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)==':') {
                if(str.charAt(i+1)=='-') {
                    if(str.charAt(i+2)==')')
                        happy++;
                    else if(str.charAt(i+2)=='(')
                        sad++;
                }
            }
        }

        if(happy>sad)
            bw.write("happy");
        else if(happy==sad && happy!=0)
            bw.write("unsure");
        else if(happy<sad)
            bw.write("sad");
        else if(happy==0 && sad==0)
            bw.write("none");
        bw.flush();
        bw.close();
    }
}