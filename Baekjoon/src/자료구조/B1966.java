package src.자료구조;

// B1966 - 프린터 큐
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int cnt = Integer.parseInt(br.readLine());
        for(int i=0; i<cnt; i++) {
            String temp = br.readLine();
            PrinterQueue prtQ = new PrinterQueue(temp);

            prtQ.getImportances(br.readLine());
            prtQ.createPaper();
            prtQ.findPaper();
        }
        bw.flush();
        bw.close();
    }
}
class PrinterQueue {
    Queue<Paper> prtQ = new LinkedList<>(); // 프린터큐 객체가 담긴 큐 선언, linkedlist 이용
    StringTokenizer st;
    private String cnt_findNum;
    private int number;	// 프린터 큐 객체 숫자
    private int choice;	// 원하는 문서 순서
    private String importances; // 중요도

    int [] arr = new int [9]; // 배열에 중요도 저장

    PrinterQueue(String cnt_findNum) {
        this.cnt_findNum = cnt_findNum;
        st = new StringTokenizer(cnt_findNum);
        this.number = Integer.parseInt(st.nextToken());	// 프린터 큐 객체 숫자
        this.choice = Integer.parseInt(st.nextToken());	// 원하는 문서 순서
    }

    void getImportances(String importances) {
        this.importances = importances;
    }

    void createPaper() {
        st = new StringTokenizer(importances);
        for(int i=0; i<number; i++) { // 반복문을 이용한 객체 생성, 큐 삽입
            int importance = Integer.parseInt(st.nextToken()); // 중요도
            Paper paper = new Paper(i, importance);	// 큐에 삽입
            prtQ.add(paper);
            arr[importance-1]++;
        }
    }

    int findPaper() {
        while(true) {
            if(choice==prtQ.peek().order) {
                for(int i=prtQ.peek().importance; i<arr.length; i++) {
                    if(arr[i]!=0) {
                        prtQ.add(prtQ.peek());
                        prtQ.remove();
                    }
                }
            }
        }
    }
}

class Paper {
    int order;
    int importance;

    Paper(int order, int importance) {
        this.order = order;
        this.importance = importance;
    }
}
