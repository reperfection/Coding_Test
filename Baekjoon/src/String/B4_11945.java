package String;
//뜨거운 붕어빵
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
public class B4_11945 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine(); // 입력을 1 2로 받는다 치자. 
		//  BufferedReader는 return 값이 String으로 고정되기때문에 int 타입으로 입력을 받기 위해선 
		// Interger.parseInt(str)처럼 타입을 꼭 변환해줘야한다.
		StringTokenizer st = new StringTokenizer(str);
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		String[][] arr = new String[n][m];
		// 입력
		for(int i=0; i<arr.length; i++) {
			String[] num = br.readLine().split(""); // 문자열 배열로 입력받음. 한 공간에 하나씩.
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num[j];
			}
		}
		// 출력
		String [][] re_arr = new String[n][m];
		for(int i=0; i<re_arr.length; i++) {
			for(int j=0; j<re_arr[i].length; j++) {
				re_arr[i][j] = arr[i][m-j-1];
				bw.write(re_arr[i][j]);			// 버퍼에 데이터 저장
			}
			bw.flush();			// 버퍼 출력 및 비우기
			bw.newLine();		// 개행
		}
		bw.close();		// 버퍼 종료.
	}
}
