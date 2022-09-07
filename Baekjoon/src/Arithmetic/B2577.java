package src.Arithmetic;

// 숫자의 개수
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int n3 = Integer.parseInt(br.readLine());
        int num = n1* n2 * n3;
        int [] arr = new int [10];
        String strNum = Integer.toString(num);
        for(int i=0; i<10; i++) {
            for(int j=0; j<strNum.length(); j++) {
                if(strNum.charAt(j)-48==i)
                    arr[i]++;
            }
            bw.write(Integer.toString(arr[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}