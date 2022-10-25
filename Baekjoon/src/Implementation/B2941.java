package src.Implementation;
// 크로아티아 알파벳
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2941 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int alpha = 0;
        String str = br.readLine();
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='c') {
                if(i+1<str.length()&&(str.charAt(i+1)=='=' || str.charAt(i+1)=='-')) {
                    alpha++;
                    i += 1;
                }
                else
                    alpha++;
            }
            else if(str.charAt(i)=='d') {
                if(i+1<str.length()&& str.charAt(i+1)=='-') {
                    alpha++;
                    i += 1;
                }
                else if((i+1<str.length() && str.charAt(i+1)=='z') && (i+2<str.length()&&str.charAt(i+2)=='=')) {
                    alpha++;
                    i += 2;
                }
                else
                    alpha++;
            }
            else if(str.charAt(i)=='l') {
                if(i+1<str.length()&&str.charAt(i+1)=='j') {
                    alpha++;
                    i += 1;
                }
                else
                    alpha++;

            }
            else if(str.charAt(i)=='n') {
                if(i+1<str.length() && str.charAt(i+1)=='j') {
                    alpha++;
                    i += 1;
                }
                else
                    alpha++;
            }
            else if(str.charAt(i)=='s') {
                if(i+1<str.length() && str.charAt(i+1)=='=') {
                    alpha++;
                    i += 1 ;
                }
                else
                    alpha++;
            }
            else if(str.charAt(i)=='z') {
                if(i+1<str.length() && str.charAt(i+1) == '=') {
                    alpha++;
                    i += 1;
                }
                else
                    alpha++;
            }
            else
                alpha++;
        }
        bw.write(Integer.toString(alpha));
        bw.flush();
        bw.close();
    }
}

