package Implementation;
// 트라이두
// (같은 숫자 세 개로 이루어진) 쓰리 카드는 (같은 숫자 두 개로 이루어진) 페어를 이깁니다.
// 더 높은 숫자로 이루어진 쓰리 카드가 더 낮은 숫자로 이루어진 쓰리 카드를 이깁니다.
// 더 높은 숫자로 이루어진 페어가 더 낮은 숫자로 이루어진 페어를 이깁니다.
import java.util.Scanner;
public class B4_13597 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int card1 = scanner.nextInt();
		int card2 = scanner.nextInt();
		// 1. 쓰리카드승리
		if(card1==card2) 
			System.out.println(card1);
		// 2. 페어 승리
		else {
			if(card1>card2) 
				System.out.println(card1);
			else
				System.out.println(card2);
		}
		scanner.close();
	}
}
