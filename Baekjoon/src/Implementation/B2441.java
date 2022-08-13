package Implementation;
//별찍기 - 4
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class B2441 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int star = Integer.parseInt(br.readLine());
		br.close();
		for(int i=0; i<star; i++) {
			for(int j=0; j<star; j++) {
				if(j>=i)
					bw.write("*");
				else
					bw.write(" ");
			}
			bw.flush();
			bw.newLine();
		}
		bw.close();
	}
}
