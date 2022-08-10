package Implementation;
//팬들에게 둘러싸인 홍준
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
public class B14581 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String fan = ":fan::fan::fan:";
		String hong = br.readLine();
		String hongandfan = ":fan::"+hong+"::fan:";
		br.close();
		bw.write(fan);
		bw.newLine();
		bw.write(hongandfan);
		bw.newLine();
		bw.write(fan);
		bw.flush();
		bw.close();
	}
}
