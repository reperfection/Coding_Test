package Implementation;
// 연세대학교
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
public class B4_15680 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String num = br.readLine();
		if(num.equals("0")) {
			bw.write("YONSEI");
			bw.flush();
		}
		else {
			bw.write("Leading the Way to the Future");
			bw.flush();
		}
		bw.close();
	}
}
