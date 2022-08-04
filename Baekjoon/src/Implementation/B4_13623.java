package Implementation;
// 0 or 1
import java.util.Scanner;
public class B4_13623 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		//앨리스 승리
		if(b==c && a!= b)
			System.out.println("A");
		// 밥승리
		else if(a==c && b!=a)
			System.out.println("B");
		// 클라라 승리
		else if(a==b && c!=a)
			System.out.println("C");
		// 승자 없을 시
		else
			System.out.println("*");
		scanner.close();
	}
}
