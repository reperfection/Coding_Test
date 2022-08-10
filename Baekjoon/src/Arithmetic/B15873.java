package Arithmetic;
// 공백 없는 A + B
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
public class B15873 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String num = br.readLine();
		String [] arr = num.split("");
		int num1 = 0;
		int num2 = 0;
		if(arr[1].equals("0")) {
			num1 = 10;
			if(arr.length>3)
				num2 = 10;
			else
				num2 = Integer.parseInt(arr[2]);
		}
		else {
			num1 = Integer.parseInt(arr[0]);
			if(arr.length>2)
				num2 = 10;
			else
				num2 = Integer.parseInt(arr[1]);
		}
		bw.write(Integer.toString(num1+num2));
		bw.flush();
		bw.close();
	}
}
