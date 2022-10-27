package src.Implementation;
// 그룹 단어 체커
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1316 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int check = 0;
        int cnt = Integer.parseInt(br.readLine());
        for(int i=0; i<cnt; i++) {
            String str = br.readLine();
            String al = "";
            for(int j=0; j<str.length(); j++) {
                String temp = Character.toString(str.charAt(j));
                if(!al.contains(temp)) {
                    if(j==str.length()-1) {
                        check++;
                        break;
                    }
                    else {
                        al = al + temp + " ";
                    }
                }
                else {
                    if(str.charAt(j-1)==str.charAt(j)) {
                        if(j==str.length()-1) {
                            check++;
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                    else
                        break;
                }
            }
        }
        bw.write(Integer.toString(check));
        bw.flush();
        bw.close();
    }
}

