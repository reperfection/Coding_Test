package Arithmetic;

import java.util.Scanner;
public class B4_14470 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int meat_cel = scanner.nextInt(); // 원래 고기 온도 A
		int target_cel = scanner.nextInt(); // 목표 온도 B
		int freeze_meat_heat = scanner.nextInt(); // 얼어 있는 고기 1도 데우는 데 걸리는 시간
		int freeze_meat_time = scanner.nextInt(); // 얼어 있는 고기 해동하는 데 걸리는 시간 D
		int meat_heat_time = scanner.nextInt(); // 얼어 있지 않은 고기 걸리는 시간
		int realtime = 0; // 소요 시간
		//고기가 얼어있고 0도 미만
		if(meat_cel<0) {
			realtime = -(meat_cel) * freeze_meat_heat; // 얼어있는 고기 0도까지 걸리는 시간
			realtime += freeze_meat_time; //해동시간
			realtime = realtime + (target_cel * meat_heat_time); // 목표 온도까지 시간
			System.out.println(realtime);
		}
		else if(meat_cel == 0) {
			realtime += freeze_meat_time; //해동시간
			realtime = realtime + (target_cel * meat_heat_time);
			System.out.println(realtime);
		}
		else {
			realtime = target_cel - meat_cel;
			realtime = realtime * meat_heat_time;
			System.out.println(realtime);
		}
		scanner.close();
	}
}
