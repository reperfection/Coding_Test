package Math;
// Vera and Outfits
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class B4_15439 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		int set = num * (num-1);
		
		System.out.println(set);
		//bw.write(set);
		//bw.flush();
		//bw.close();
		//int형 변수가 제대로 출력되지 않는 이유는?
	}
}
