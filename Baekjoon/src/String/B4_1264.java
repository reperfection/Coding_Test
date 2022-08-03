package String;
//모음의 개수
import java.util.Scanner;
import java.util.ArrayList;

public class B4_1264 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s;
		int count = 0;
		ArrayList<String> st = new ArrayList<String>();
		
		while(true) {
			s = scanner.nextLine();
			if(s.equals("#"))
				break;
			else
			st.add(s);
		} 
		for(int i=0; i<st.size(); i++) {
			for(int j=0; j<st.get(i).length(); j++) {
				char a = st.get(i).charAt(j);
				if(a == 'A'  || a == 'a')
					count++;
				else if(a == 'E'  || a == 'e')
					count++;
				else if(a == 'I'  || a == 'i')
					count++;
				else if(a == 'O'  || a == 'o')
					count++;
				else if(a == 'U'  || a == 'u')
					count++;
				else
					continue;
			}
			System.out.println(count);
			count = 0;
		}
	}
}

