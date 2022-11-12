package src.DP;
// 거스름돈ㅎ
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class B14916 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int money = Integer.parseInt(br.readLine());
        int sum = 0;
        br.close();
        if(money>=5) {
            if((money)%5==2 || (money)%5==4)
                sum = ((money)/5) + ((money)%5)/2;
            else if((money)%5==1|| (money)%5==3){
                sum = ((money/5)-1);
                money = money - (sum*5);
                sum = sum + (money/2);
            }
            else if((money)%5==0)
                sum = (money)/5;
        }
        else if(money==2 || money==4)
            sum = money/2;
        else
            sum = -1;
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
    }

}
