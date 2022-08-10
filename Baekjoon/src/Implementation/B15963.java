package Implementation;
// CASIO
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class B15963 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String battery = br.readLine();
		br.close();
		StringTokenizer st = new StringTokenizer(battery);
		String song = st.nextToken();
		String teacher = st.nextToken();
		if(song.equals(teacher))
			bw.write("1");
		else
			bw.write("0");
		bw.flush();
		bw.close();
	}
}
