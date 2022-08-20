package Implementation;
// 윷놀이
import java.io.*;
public class B2490 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<3; i++) {
            String play = br.readLine();
            String [] sp = play.split("\\s");
            int front = 0;
            for(int j=0; j<sp.length; j++) {
                if(sp[j].equals("0"))
                    front++;
            }
            if(front==0) {
                bw.write("E");
                bw.newLine();
            }
            else if(front==1) {
                bw.write("A");
                bw.newLine();
            }
            else if(front==2) {
                bw.write("B");
                bw.newLine();
            }
            else if(front==3) {
                bw.write("C");
                bw.newLine();
            }
            else {
                bw.write("D");
                bw.newLine();
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
