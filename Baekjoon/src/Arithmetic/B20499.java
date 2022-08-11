package Arithmetic;
// 다리우스님 한타 안 함?
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class B20499 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String darius = br.readLine();
		StringTokenizer st = new StringTokenizer(darius, "/");
		br.close();
		int kill = Integer.parseInt(st.nextToken());
		int death = Integer.parseInt(st.nextToken());
		int assist = Integer.parseInt(st.nextToken());
		if(kill+assist>=death) {
			if(death!=0)
				bw.write("gosu");
			else
				bw.write("hasu");
		}
		else
			bw.write("hasu");
		bw.flush();
		bw.close();
	}
}
