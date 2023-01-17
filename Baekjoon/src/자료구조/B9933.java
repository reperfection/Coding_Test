package 자료구조;
//민균이의 비밀번호 - 해시셋
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.io.IOException;

public class B9933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        for(int i=0; i<cnt; i++) {
            String temp = br.readLine();
            sb.append(temp);
            String rev = sb.reverse().toString();
            if(temp.equals(rev))
                bw.write(Integer.toString(temp.length())+" "+temp.charAt(temp.length()/2));

            else if(set.contains(temp))
                bw.write(Integer.toString(temp.length())+" "+temp.charAt(temp.length()/2));

            else
                set.add(rev);

            sb.delete(0, rev.length());
        }
        bw.flush();
        bw.close();
    }
}