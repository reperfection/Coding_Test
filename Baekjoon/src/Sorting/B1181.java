package Sorting;
// 단어 정렬
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class B1181{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testcase = Integer.parseInt(br.readLine());

        String [] arr = new String[testcase]; // 처음 입력받은 단어를 저장할 배열 선언
        ArrayList<Integer> arrlen = new ArrayList<>();	// 각 단어의 길이를 저장할 배열 선언
        ArrayList<String> arr2 = new ArrayList<>(); // 길이 순대로 저장할 배열
        ArrayList<String> result = new ArrayList<>(); // 결과 배열

        for(int i=0; i<testcase; i++) {
            arr[i] = br.readLine();
            int len = arr[i].length();
            if(!arrlen.contains(len))
                arrlen.add(len);
        }

        Collections.sort(arrlen); // 배열 오름차순으로 정렬

        for(int i=0; i<arrlen.size(); i++) { // 배열 길이만큼 반복
            for(int j=0; j<arr.length; j++) { // 처음 입력받아 저장한 배열 단어 중에서 확인
                if(arrlen.get(i)==arr[j].length()) { //길이 오름차순으로 정렬된 배열의 길이와 저장된 배열의 단어 길이가 같다면
                    if(!arr2.contains(arr[j])) //그리고 그 단어가 중복이 아니라면
                        arr2.add(arr[j]);
                }
            }

            Collections.sort(arr2); // 결과 배열에 순차대로 저장하기 전에 정렬
            for(int j=0; j<arr2.size(); j++)
                result.add(arr2.get(j)); // 결과 배열에 저장
            arr2.clear(); // 길이 순 배열에 저장된 단어 전부 삭제
        }

        for(int i=0; i<result.size();i++) // 결과값
            bw.write(result.get(i)+"\n");

        bw.flush();
        bw.close();
    }
}