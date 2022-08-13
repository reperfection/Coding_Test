package Implementation;
//별찍기 - 6
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class B2443 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num_star = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num_star; i++) {
			for(int j=0; j<i; j++) 
				bw.write(" ");
			for(int k=2*(num_star-i-1)+1; k>0; k--)
					bw.write("*");
			bw.flush();
			bw.newLine();
		}
		bw.close();
	}
}
