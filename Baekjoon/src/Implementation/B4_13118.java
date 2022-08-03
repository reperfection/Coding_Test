package Implementation;
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class B4_13118 {
	public static void main(String[] args) throws IOException{
		// BufferedREader를 사용하기 위해선 throws IEOxception을 해 주어야 한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 위치를 나타내는 네 정수
		StringTokenizer st = new StringTokenizer(br.readLine()); // readLine으로 받은 입력 데이터는 String임, 
		int p1 = Integer.parseInt(st.nextToken());
		int p2 = Integer.parseInt(st.nextToken());
		int p3 = Integer.parseInt(st.nextToken());
		int p4 = Integer.parseInt(st.nextToken());
		
		// x, y, r를 나타내는 세 정수
		StringTokenizer st2 = new StringTokenizer(br.readLine()); //사과값
		int x = Integer.parseInt(st2.nextToken());
		int y = Integer.parseInt(st2.nextToken());
		int r = Integer.parseInt(st2.nextToken());
		int zero=0;
		br.close();
		//첫 번째 줄에 사과와 충돌하는 사람의 번호를 출력한다. 단, 사과와 충돌하는 사람이 없다면 0을 대신 출력한다.
		if(x==p1) {
			bw.write(p1); bw.flush();
		}
		else if(x==p2) {
			bw.write(p2); bw.flush();
		}
		else if(x==p3) {
			bw.write(p3); bw.flush();
		}
		else if(x==p4) {
			bw.write(p4); bw.flush();
		}
		else {
			bw.write(zero); bw.flush();
		}
		bw.close();
	}
}*/
import java.util.Scanner;
public class B4_13118 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int p1 = scanner.nextInt();
		int p2 = scanner.nextInt();
		int p3 = scanner.nextInt();
		int p4 = scanner.nextInt();
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int r = scanner.nextInt();
		if(x==p1)
			System.out.println(1);
		else if(x==p2)
			System.out.println(2);
		else if(x==p3)
			System.out.println(3);
		else if(x==p4)
			System.out.println(4);
		else
			System.out.println(0);
		scanner.close();
	}
}