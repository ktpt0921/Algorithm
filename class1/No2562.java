package class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2562 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[9];
		int max = 0;
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
			if(arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
	
		bw.write(String.valueOf(max)+"\n");
		bw.write(String.valueOf(index + 1));
		bw.flush();
		bw.close();
	}

}
