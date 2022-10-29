package Implementation;
// 집합
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;
public class B11723 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int linecnt = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<linecnt; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);
            String order= st.nextToken();
            if(order.equals("add")) {
                set.add(Integer.parseInt(st.nextToken()));
            }
            else if(order.equals("remove")) {
                set.remove(Integer.parseInt(st.nextToken()));
            }
            else if(order.equals("check")) {
                if(set.contains(Integer.parseInt(st.nextToken()))==true) {
                    bw.write("1");
                    bw.newLine();
                }
                else {
                    bw.write("0");
                    bw.newLine();
                }
            }
            else if(order.equals("toggle")) {
                int temp = Integer.parseInt(st.nextToken());
                if(set.contains(temp)==true)
                    set.remove(temp);
                else
                    set.add(temp);
            }
            else if(order.equals("all")){
                set.clear();
                for(int j=1; j<21; j++) {
                    set.add(j);
                }
            }
            else if(order.equals("empty")){
                set.clear();
            }
        }
        bw.flush();
        bw.close();
    }
}
