package src.Implementation;
// 명령 프롬프트
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1032 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        String str = br.readLine();
        char [] arr = new char[str.length()];

        for(int j=0; j<str.length(); j++)
            arr[j]=str.charAt(j);

        if(cnt==1) {
            for(char i : arr)
                bw.write(i);
        }

        else {
            for(int i=0; i<cnt-1; i++) {
                String temp = br.readLine();
                for(int j=0; j<temp.length(); j++) {
                    if(arr[j]==temp.charAt(j))
                        continue;
                    else
                        arr[j] = '?';
                }
            }
            for(char i : arr)
                bw.write(i);
        }
        bw.flush();
        bw.close();
    }

}
