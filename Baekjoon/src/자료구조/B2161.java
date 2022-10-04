package src.자료구조;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class B2161 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();

        int len = Integer.parseInt(br.readLine());

        for(int i = 1; i<=len; i++) {
            queue.add(i);
        }

        while(queue.size()!=0) {
            bw.write(Integer.toString(queue.poll()));
            bw.write(" ");
            if(queue.isEmpty()==true)
                break;
            else
                queue.add(queue.poll());
        }
        bw.flush();
        bw.close();
    }
}

