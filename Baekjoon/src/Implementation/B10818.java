package Implementation;
// 최소, 최대
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
public class B10818 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		StringTokenizer st;
		int size = Integer.parseInt(br.readLine());
		int [] find_num = new int[size];
		String num = br.readLine();
		st = new StringTokenizer(num);
		for(int i=0; i<size ;i++) {
			int number = Integer.parseInt(st.nextToken());
			find_num[i] = number;
		}
		Arrays.sort(find_num);
		bw.write(Integer.toString(find_num[0])+ " ");
		bw.write(Integer.toString(find_num[size-1]));
		bw.flush();
		bw.close();
	}
}
