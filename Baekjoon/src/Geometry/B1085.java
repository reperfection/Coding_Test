package Geometry;
// 직사각형에서 탈출
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;
public class B1085 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String square = br.readLine();
		st = new StringTokenizer(square);
		br.close();
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		int x2 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		int x = x2-x1; int y = y2-y1;
		if(x1<=x && x1<=y1 && x1<= y)
			bw.write(Integer.toString(x1));
		else if(y1<=y && y1<=x1 && y1<=x)
			bw.write(Integer.toString(y1));
		else if(x1>x && y1>x && y>x)
			bw.write(Integer.toString(x));
		else if(y1>y && x1>y && x>y)
			bw.write(Integer.toString(y));
		bw.flush();
		bw.close();
	}
}
