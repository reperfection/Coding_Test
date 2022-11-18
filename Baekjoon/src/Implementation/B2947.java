package Implementation;
// 나무조각
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B2947 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str = br.readLine();
        int [] arr = new int [5];
		/*
		Stick stick = new Stick(str);
		stick.array();
		stick.arr = stick.arrange();
		 */
        st = new StringTokenizer(str);
        for(int i=0; i<arr.length; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        while(true) {
            if(arr[0]!=1)
                arr = arrange(arr);
            else if(arr[1]!=2)
                arr = arrange(arr);
            else if(arr[2]!=3)
                arr =arrange(arr);
            else if(arr[3]!=4)
                arr =arrange(arr);
            else if(arr[4]!=5)
                arr =arrange(arr);
            else
                break;
        }
        bw.flush();
        bw.close();
    }
    static int [] arrange(int [] arr) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i]>arr[i+1]) {
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
                for(int j=0; j<arr.length; j++)
                    bw.write(Integer.toString(arr[j]) + " ");
            }
            else {
                for(int j=0; j<arr.length; j++)
                    bw.write(Integer.toString(arr[j])+ " ");
            }
        }
        return arr;
    }
}
/*
class Stick{
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	StringTokenizer st;
	String str;
	int [] arr;

	Stick(String str) {
		this.str=str;
	}

	void array() {
		st = new StringTokenizer(str);
		arr = new int [5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
	}

	int [] arrange() throws IOException {
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				int temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp;
				for(int j=0; j<arr.length; j++)
					bw.write(Integer.toString(arr[j])+ " ");
			}
			else {
				for(int j=0; j<arr.length; j++)
					bw.write(Integer.toString(arr[j])+ " ");
			}
		}
		if(arr[0]!=1) {
			arrange();
		}
		else if(arr[1]!=2)
			arrange();
		else if(arr[2]!=3)
			arrange();
		else if(arr[3]!=4)
			arrange();
		else if(arr[4]!=5)
			arrange();
		else
			return arr;
		return arr;
	}
}
*/