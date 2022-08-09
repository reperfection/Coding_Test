package Implementation;
// 숫자의 함
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
public class B4_11720 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int howmany = Integer.parseInt(br.readLine());
		String num = br.readLine();
		String [] arr = num.split(""); // new String 선언하지 않고도 가능..
		int [] array = new int [arr.length];
		
		for(int i=0; i<arr.length; i++) 
			array[i] = Integer.parseInt(arr[i]);
		
		int sum = 0;
		for(int i=0; i<array.length; i++)
			sum += array[i];
		String string_sum = Integer.toString(sum);
		bw.write(string_sum);
		bw.flush();
		bw.close();
	}
}
