package Implementation;
// 별찍기2
import java.util.Scanner;
public class B4_2439 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		int num = scanner.nextInt(); // N번째 줄
		String star = "*";
		for(int i=1; i<=num; i++) {
			for(int j=num-i-1; j>=0; j--) {
				System.out.print(" "); 
			}
			System.out.println(star.repeat(i)); //repeat 메서드는 반복 횟수만 넣으면 된다
		}
		*/
		int num = scanner.nextInt();
		String star = "*";
		for (int i=num; i>0; i--) {
			for(int j = 1 ; j<=num; j++) {
				if(i>j)
					System.out.print(" ");
				else
					System.out.print(star);
			}
			System.out.println();
		}
		scanner.close();
	}
}
