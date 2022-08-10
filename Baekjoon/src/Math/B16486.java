package Math;
// 은동장 한 바퀴
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B16486 {
	static double PIE = 3.141592;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//가로의 길이를 d1, 영역 A의 반지름의 길이 d2
		int d1 = Integer.parseInt(br.readLine());
		int d2 = Integer.parseInt(br.readLine());
		br.close();
		int square = 2*d1;
		double circle = 2 * PIE * d2;
		double sum = square+circle;
		System.out.println(sum);
	}
}
