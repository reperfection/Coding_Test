package Geometry;
// 직각삼각형
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B4153 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		while(true) {
			String tri = br.readLine();
			st = new StringTokenizer(tri);
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			int n3 = Integer.parseInt(st.nextToken());
			if(n1==n2 && n2==n3 && n1==0)
				break;
			else {
				int [] arr = {n1, n2, n3};
				Arrays.sort(arr); // 오름차순으로 배열 정렬
				arr[0] = (int) Math.pow(arr[0], 2);	//제곱 구하기
				arr[1] = (int) Math.pow(arr[1], 2);
				arr[2] = (int) Math.pow(arr[2], 2);
				if(arr[2]==(arr[0]+arr[1])) {
					bw.write("right");
					bw.newLine();
				}
				else {
					bw.write("wrong");
					bw.newLine();
				}
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
