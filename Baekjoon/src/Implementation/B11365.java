package Implementation;
//!밀비 급일
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class B11365 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		String rev="";
		StringBuffer sb;
		while(true) {
			rev = br.readLine();
			if(rev.contains("END"))
				break;
			else {
				sb = new StringBuffer(rev);
				String reverse = sb.reverse().toString();
				bw.write(reverse);
				bw.newLine();
				continue;
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
