package src.Implementation;
// DNA
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B1969 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str = br.readLine();
        st = new StringTokenizer(str);

        int cnt = Integer.parseInt(st.nextToken()); // 행
        int len = Integer.parseInt(st.nextToken()); // 열

        char [][] arr = new char[cnt][len];
        for(int i=0; i<cnt; i++) {
            String temp = br.readLine();
            for(int j=0; j<temp.length(); j++) {
                arr[i][j] = temp.charAt(j);

            }
        }

        String dna = ""; // 합이 가장 작은 DNA
        int hamming_distance = 0; // hamming distance 합

        for(int i=0; i<len; i++) {
            int [] hamming = new int[4]; // A, T, G, C순
            hamming[0] = 0;
            hamming[1] = 0;
            hamming[2] = 0;
            hamming[3] = 0;

            for(int j=0; j<cnt; j++) {
                if(arr[j][i]=='A')
                    hamming[0]++;
                else if(arr[j][i]=='T')
                    hamming[1]++;
                else if(arr[j][i]=='G')
                    hamming[2]++;
                else if(arr[j][i]=='C')
                    hamming[3]++;
            }
            int max = 0;
            char temp = 0;

            for(int j=0; j<hamming.length; j++) {

                if(j==0) {
                    max = hamming[0];
                    temp = 'A';
                }
                // A, T, G, C순
                else {
                    if(max>hamming[j])
                        continue;
                    else if(max<hamming[j]) {
                        if(j==1) {
                            temp = 'T';
                            max = hamming[j];
                        }
                        else if(j==2) {
                            temp = 'G';
                            max = hamming[j];
                        }
                        else {
                            temp = 'C';
                            max = hamming[j];
                        }
                    }

                    else if(max==hamming[j]) {
                        if(temp=='A')
                            continue;
                        else if(temp=='T'&&j==2)
                            temp = 'G';
                        else if(temp=='T'&&j==3)
                            temp = 'C';
                        else if(temp=='G'&&j==3)
                            temp = 'C';
                    }
                }
            }
            dna += temp;

            for(int j=0; j<cnt; j++) {
                char temp1 = arr[j][i];

                if(temp1!=temp)
                    hamming_distance++;
            }
        }
        // 출력
        bw.write(dna);
        bw.newLine();
        bw.write(Integer.toString(hamming_distance));
        bw.flush();
        bw.close();
    }

}

