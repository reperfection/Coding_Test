package Math;
// 나머지
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.io.IOException;


public class B3052{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++) {
            int temp = Integer.parseInt(br.readLine());
            temp = temp%42;
            if(!(list.contains(temp))) {
                list.add(temp);
            }
        }
        bw.write(Integer.toString(list.size()));
        bw.flush();
        bw.close();
    }
}