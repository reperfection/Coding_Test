package DP;
// 설탕 배달
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class B2839{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int div3 = 0;
        int div5 = 0;
        int divExp = 0;
        div3 = division3(n);
        div5 = division5(n);
        divExp = divisionExcep(n);
        //System.out.println(div3+ " "+ div5+ " "+divExp);


        if((div3>div5)&&(div3>0)&&(div5>0)&&divExp==0)
            bw.write(Integer.toString(div5));

        else if((div3>div5)&&div5==-1&&divExp==0)
            bw.write(Integer.toString(div3));

        else if((div3<div5)&&div3==-1&&divExp==0)
            bw.write(Integer.toString(div5));

        else if((div3<div5)&&(div3>0)&&(div5>0)&&divExp==0)
            bw.write(Integer.toString(div3));

        else if(div3==div5&&div3==-1 && divExp>0)
            bw.write(Integer.toString(divExp));

        else if(div3==-1&&div5>0&&divExp<div5)
            bw.write(Integer.toString(divExp));

        else if((div5==-1)&&(div3>0)&&(divExp<div3))
            bw.write(Integer.toString(divExp));

        else
            bw.write(Integer.toString(div3));
        bw.flush();
        bw.close();
    }
    static int division3(int n) {
        int div3 = 0;
        int temp = n;
        div3 = temp/3;
        temp = temp%3;
        div3 = div3+(temp/5);

        if(temp%5!=0)
            return -1;
        else
            return div3;
    }

    static int division5(int n) {
        int div5 = 0;
        int temp = n;
        div5 = temp/5;
        temp = temp%5;
        div5 = div5+(temp/3);

        if(temp%3!=0)
            return -1;
        else
            return div5;
    }

    static int divisionExcep(int n) {
        int temp = n/5;
        int result = 0;

        for(int i=1; i<temp; i++) {
            int three1 = 3*2;
            int three2 = 3*3;
            int five = 5*i;
            if(three1+five==n)
                result = 2+i;
            else if(three2+five==n)
                result = 3+i;
        }
        return result;
    }
}