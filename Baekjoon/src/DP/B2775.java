package DP;
// 부녀회장이 될테야
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class B2775{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testcase = Integer.parseInt(br.readLine());
        for(int i=0; i<testcase; i++) {
            int height = Integer.parseInt(br.readLine());
            int row = Integer.parseInt(br.readLine());
            bw.write(Integer.toString(apart_matrix(height, row)));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
    static int apart_matrix(int height, int row) {
        int [][] arr = new int [height+1][row]; // 아파트는 1층부터 있다. 0층의 row호에는 row명이 산다
        for(int i=0; i<height+1; i++) {
            for(int j=0; j<row; j++) {
                if(i==0) // 0층일때 row 명만큼 산다
                    arr[0][j] = j+1;
                else {
                    if(j==0) // 각층의 1호에는 1명이 산다
                        arr[i][0] = 1;
                    else { // 그리고 각층의 row호에는 아래층의 1호부터 row호까지 사람들의 수의 합만큼 산다
                        arr[i][j] = matrixSum(arr, i, j);
                    }
                }
            }
        }
        return arr[height][row-1];
    }

    static int matrixSum(int [][]arr, int height, int row) {
        int sum = 0;
        for(int i=0; i<=row; i++) {
            sum += arr[height-1][i];
        }
        return sum;
    }
}
