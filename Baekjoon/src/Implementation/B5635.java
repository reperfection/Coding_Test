package src.Implementation;
// 생일
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B5635 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int cnt = Integer.parseInt(br.readLine());
        String [] arr= new String [cnt];

        for(int i=0; i<cnt; i++) {
            arr[i] = br.readLine();
        }
        String name = "";
        int day=0, month=0, year =0;
        // 가장 적은 사람
        for(int i=0; i<cnt; i++) {
            st = new StringTokenizer(arr[i]);
            if(i==0) {
                String tempname = st.nextToken();
                name = tempname;
                int tempday = Integer.parseInt(st.nextToken());
                day = tempday;
                int tempmonth = Integer.parseInt(st.nextToken());
                month = tempmonth;
                int tempyear = Integer.parseInt(st.nextToken());
                year = tempyear;
            }
            else {
                String tempname = st.nextToken();
                int tempday = Integer.parseInt(st.nextToken());
                int tempmonth = Integer.parseInt(st.nextToken());
                int tempyear = Integer.parseInt(st.nextToken());
                if(tempyear==year) {
                    if(tempmonth==month) {
                        if(tempday>day) {
                            day = tempday;
                            month = tempmonth;
                            year = tempyear;
                            name = tempname;
                        }
                    }
                    else if(tempmonth>month) {
                        day = tempday;
                        month = tempmonth;
                        year = tempyear;
                        name = tempname;
                    }
                }
                else if(tempyear>year) {
                    day = tempday;
                    month = tempmonth;
                    year = tempyear;
                    name = tempname;
                }
            }
        }
        bw.write(name);
        bw.newLine();
        // 가장 큰 사람
        for(int i=0; i<cnt; i++) {
            st = new StringTokenizer(arr[i]);
            if(i==0) {
                String tempname = st.nextToken();
                name = tempname;
                int tempday = Integer.parseInt(st.nextToken());
                day = tempday;
                int tempmonth = Integer.parseInt(st.nextToken());
                month = tempmonth;
                int tempyear = Integer.parseInt(st.nextToken());
                year = tempyear;
            }
            else {
                String tempname = st.nextToken();
                int tempday = Integer.parseInt(st.nextToken());
                int tempmonth = Integer.parseInt(st.nextToken());
                int tempyear = Integer.parseInt(st.nextToken());
                if(tempyear==year) {
                    if(tempmonth==month) {
                        if(tempday<day) {
                            day = tempday;
                            month = tempmonth;
                            year = tempyear;
                            name = tempname;
                        }
                    }
                    else if(tempmonth<month) {
                        day = tempday;
                        month = tempmonth;
                        year = tempyear;
                        name = tempname;
                    }
                }
                else if(tempyear<year) {
                    day = tempday;
                    month = tempmonth;
                    year = tempyear;
                    name = tempname;
                }
            }
        }
        bw.write(name);
        bw.flush();
        bw.close();
    }

}
