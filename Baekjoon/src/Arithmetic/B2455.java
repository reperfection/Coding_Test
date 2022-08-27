// 지능형 기차
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class B2455 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int max = 0; int max_people = 0;
        for(int i=0; i<4; i++) {
            String train = br.readLine();
            st = new StringTokenizer(train);
            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());

            int people = in-out;
            if(max_people<max+people) {
                max_people = max+people;
                max += people;
            }
            else {
                max += people;
            }
        }
        bw.write(Integer.toString(max_people));
        bw.flush();
        bw.close();
    }
}
