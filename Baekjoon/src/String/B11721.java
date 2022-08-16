package String;
// 열 개씩 끊어 출력하기
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;


public class B11721 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String sentence = br.readLine();
		br.close();
		int len = (sentence.length()/10);
		for(int i=0; i<=len; i++) {
			if(sentence.length()>=10) {
				bw.write(sentence.substring(0, 10));
				bw.newLine();
				sentence = sentence.substring(10);
			}
			else {
				bw.write(sentence.substring(0));
			}
		}
		bw.flush();
		bw.close();
	}
}
