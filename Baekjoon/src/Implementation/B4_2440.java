package Implementation;
// 별찍기 - 3
import java.util.Scanner;
public class B4_2440 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i=num; i>0; i--) {
			for(int j=0; j<num; j++) {
				if(i>j)
					System.out.print("*");
				//문제의 예제를 보면 뒤에 공백이 없다..
				else
					break;
			}
			System.out.println();
		}
		scanner.close();
	}
}
