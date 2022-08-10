package Arithmetic;
// 치킨 두마리
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
public class B14489 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String account = br.readLine();
		int price = Integer.parseInt(br.readLine());
		price = price*2;
		StringTokenizer st = new StringTokenizer(account);
		int account1 = Integer.parseInt(st.nextToken());
		int account2 = Integer.parseInt(st.nextToken());
		int accountsum = account1+account2;
		br.close();
		
		if(accountsum>=price)
			bw.write(Integer.toString(accountsum-price));
		else 
			bw.write(Integer.toString(accountsum));
		bw.flush();
		bw.close();
	}
}
