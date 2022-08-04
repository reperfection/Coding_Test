package Implementation;
// 기찍 N
import java.util.Scanner;
public class B4_2742 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i=num; i>0; i--) {
			System.out.print(i + "\n");
		}
		scanner.close();
	}
}
