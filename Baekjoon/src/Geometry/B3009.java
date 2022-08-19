package Geometry;
// 네 번째 점
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;
public class B3009 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		String point1 = br.readLine();
		st = new StringTokenizer(point1);
		String x1 = st.nextToken();
		String y1 = st.nextToken();
		
		String point2 = br.readLine();
		st = new StringTokenizer(point2);
		String x2 = st.nextToken();
		String y2 = st.nextToken();
		
		String point3 = br.readLine();
		st = new StringTokenizer(point3);
		String x3 = st.nextToken();
		String y3 = st.nextToken();
		br.close();
		
		if(x1.equals(x2))
			bw.write(x3);
		else if(x1.equals(x3))
			bw.write(x2);
		else if(x2.equals(x3))
			bw.write(x1);
		
		if(y1.equals(y2))
			bw.write(" "+ y3);
		else if(y1.equals(y3))
			bw.write(" "+ y2);
		else if(y2.equals(y3))
			bw.write(" "+ y1);
		bw.flush();
		bw.close();
		
	}
}
