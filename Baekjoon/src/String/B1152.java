package src.String;

// 단어의 개수
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class B1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        //int n = Integer.parseInt(br.readLine());

        String str = br.readLine();
        st = new StringTokenizer(str);

        bw.write(Integer.toString(st.countTokens()));
        bw.flush();
        bw.close();
    }
}
