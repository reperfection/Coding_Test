package 자료구조;
/*
AC - 자료구조, 문자열, 덱
10자리수로 넘어가면 해결하지 못하는 문제
->charAt()으로 숫자 하나하나만 받아들여 문자열로 저장했기 때문.
*/

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class B5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcase; i++) {
            String order = br.readLine();
            int cnt = Integer.parseInt(br.readLine());
            String num = br.readLine();
            AC ac = new AC(order, cnt, num);
            ac.deque();
            bw.write(ac.toString());
            if(i!=testcase-1)
                bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

class AC {
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    Deque<Integer> deque = new LinkedList<>();
    private int len; // 길이
    private String num; // 숫자
    private String order; // 명령어
    private int reverse_cnt; // 짝수면 정방향, 홀수면 뒤에서


    AC(String order, int cnt, String num) {
        this.len = cnt;
        this.order = order;
        this.num = num;
    }

    void deque() {
        num = num.substring(1, num.length() - 1);
        st = new StringTokenizer(num, ",");
        for (int i = 0; i < len; i++) {
            String temp = "";
            temp = st.nextToken();
            if (temp.length() > 0)
                deque.add(Integer.parseInt(temp));
        }


        for (int i = 0; i < order.length(); i++) {
            if (order.charAt(i) == 'R') {
                if (reverse_cnt == 0)
                    reverse_cnt++;
                else if (reverse_cnt == 1)
                    reverse_cnt--;
            } else if (order.charAt(i) == 'D') {
                if (reverse_cnt == 0) {
                    if (deque.peek() == null) {
                        num = "error";
                        break;
                    } else
                        deque.poll();
                } else if (reverse_cnt == 1) {
                    if (deque.peek() == null) {
                        num = "error";
                        break;
                    } else
                        deque.pollLast();
                }
            }
        }
    }

    public String toString() {
        if (!num.equals("error")) {
            sb.append("[");

            if (reverse_cnt == 0) {
                while (deque.isEmpty() != true) {
                    sb.append(deque.poll());
                    sb.append(",");
                }
            } else if (reverse_cnt == 1) {
                while (deque.isEmpty() != true) {
                    sb.append(deque.pollLast());
                    sb.append(",");
                }
            }
            if (sb.length() > 2)
                sb.deleteCharAt(sb.length() - 1);
            sb.append("]");
            num = sb.toString();
            return num;
        } else
            return num;

    }
}