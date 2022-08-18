package Implementation;
// 별 찍기 - 1
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
public class B2438 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				bw.write("*");
			}
			bw.flush();
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
