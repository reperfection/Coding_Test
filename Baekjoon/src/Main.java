//원형 큐 공부..
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    private Node front;
    private Node rear;
    private int size = 0;

    public void LinkedQueue(int size) {
        this.size = size;
        this.queue = new Object[size];
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return (front==null);
    }

    public void enQueue(Object item) {
        Node newNode = new Node();
        newNode.data = item;
        newNode.link = null;
        if(isEmpty()) {
            front = newNode;
            rear = newNode;
        }
        else {
            rear.link = newNode;
            rear = newNode;
        }
    }
    public Object deQueue() {
        if(isEmpty()) {
            return null;
        }
        else {
            Object item = front.data;
            front = front.link;
            if(front==null)
                rear = null;
            return item;
        }
    }

    private class Node {
        Object data;
        Node link;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        String alpha = br.readLine();
        int [] arr = new int [3];
        StringTokenizer st = new StringTokenizer(num);
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //String [] arr = num.split("\\s");
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++) {
            if(alpha.charAt(i)=='A')
                bw.write(arr[0]+ " ");
            else if(alpha.charAt(i)=='B')
                bw.write(arr[1]+ " ");
            else if(alpha.charAt(i)=='C')
                bw.write(arr[2]+ " ");
        }
        bw.flush();
        bw.close();
    }
}
