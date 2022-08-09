package Implementation;
// 와글와글 숭고한
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
public class B4_17388 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String SKH = br.readLine();
		br.close();
		StringTokenizer st = new StringTokenizer(SKH);
		int s = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int sum = s+k+h;
		if(sum >=100) {
			bw.write("OK"); bw.flush();
		}
		else if(s<k && s<h) {
			bw.write("Soongsil"); bw.flush();
		}
		else if(k<s && k<h) {
			bw.write("Korea"); bw.flush();
		}
		else {
			bw.write("Hanyang"); bw.flush();
		}
		bw.close();
	}
}
