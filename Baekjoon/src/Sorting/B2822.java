package Sorting;

// 점수 계산 - Arraylist 이용해서
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class B2822 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>(8);
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i=0; i<8; i++) {
            String num = br.readLine();
            list.add(Integer.parseInt(num));
            temp.add(Integer.parseInt(num));
        }

        Collections.sort(temp);
        for(int i=0; i<3; i++)
            temp.remove(0);

        int [] arr = new int [5];
        int sum =0;

        for(int i=0; i<5; i++) {
            sum += temp.get(i);
            arr[i] = list.indexOf(temp.get(i));
        }

        Arrays.sort(arr);
        bw.write(Integer.toString(sum));
        bw.newLine();
        for(int i=0; i<arr.length; i++) {
            bw.write(Integer.toString(arr[i]+1));
            bw.write(" ");
        }
        bw.flush();
        bw.close();
    }
}
