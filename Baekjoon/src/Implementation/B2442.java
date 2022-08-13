package Implementation;
//별찍기 - 5
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class B2442 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int star = Integer.parseInt(br.readLine());
		for(int i=0; i<star; i++) {
			for(int k=i; k<star-1; k++) {
				bw.write(" ");
			}
			for(int j=0; j<(2*i+1); j++) {
				bw.write("*");
			}
			bw.flush();
			bw.newLine();
		}
		bw.close();
	}
}
