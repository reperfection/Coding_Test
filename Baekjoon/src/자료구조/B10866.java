package src.자료구조;

// 덱
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.LinkedList;

public class B10866{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Deque deque = new Deque();
        int cnt = Integer.parseInt(br.readLine());
        for(int i=0; i<cnt; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);
            String order = st.nextToken();

            if(order.equals("push_front"))
                deque.push_front(Integer.parseInt(st.nextToken()));

            else if(order.equals("push_back"))
                deque.push_back(Integer.parseInt(st.nextToken()));

            else if(order.equals("front"))
                bw.write(Integer.toString(deque.front())+"\n");

            else if(order.equals("back"))
                bw.write(Integer.toString(deque.back())+"\n");

            else if(order.equals("empty"))
                bw.write(Integer.toString(deque.empty())+"\n");

            else if(order.equals("size"))
                bw.write(Integer.toString(deque.size())+"\n");

            else if(order.equals("pop_front"))
                bw.write(Integer.toString(deque.pop_front())+"\n");

            else if(order.equals("pop_back"))
                bw.write(Integer.toString(deque.pop_back())+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

class Deque {
    LinkedList<Integer> list = new LinkedList<>();

    void push_front(int x) {
        list.addFirst(x);
    }

    void push_back(int x) {
        list.addLast(x);
    }

    int pop_front() {
        if(list.size()>0) {
            return list.pollFirst();
        }
        else
            return -1;
    }

    int pop_back() {
        if(list.size()>0)
            return list.pollLast();
        else
            return -1;
    }

    int size() {
        return list.size();
    }

    int empty() {
        if(list.isEmpty())
            return 1;
        else
            return 0;
    }

    int front() {
        if(list.isEmpty())
            return -1;
        else
            return list.peekFirst();
    }

    int back() {
        if(list.isEmpty())
            return -1;
        else
            return list.peekLast();
    }
}
