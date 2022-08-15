package Implementation;
// 최댓값
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class B2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = 9;
		int [] arr = new int[size];
		for(int i=0; i<size; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
		}
		int max = 0;
		max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<=arr[i]) {
				max = arr[i];
				size = i+1;
			}
		}
		bw.write(Integer.toString(max));
		bw.newLine();
		bw.write(Integer.toString(size));
		br.close();
		bw.close();
	}
}
