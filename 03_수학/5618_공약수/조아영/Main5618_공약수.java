package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main5618_����� {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //�Է¹��� 
		
		int n = Integer.parseInt(br.readLine()); //�־����� �ڿ��� ���� 
		String num = br.readLine(); //�ڿ����� ���ڿ��� �ϴ� ���� 
		int[] arr = {};  //���ڵ��� ���� �迭 
		
		StringTokenizer st = new StringTokenizer(num," "); //���ڿ��� ���� ���ڵ� �ɰ� 
		
		if (n==2) { //���� 2���� ���� 2¥�� �迭�� ���� 
			arr = new int[2];
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
		} else if (n==3) {
			arr = new int[3]; //���� 3���� ���� 3¥�� �迭�� ���� 
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr); //�������� ���ķ� ���ڵ� �� �ּڰ��� arr[0]�� ����� 
		
		int[] gys = new int[arr[0]]; //����� ���� �迭 
		int cnt=0; //����� ���� 
		
		//2�� �Ǵ� 3���� ���ڸ� 1���� arr[0]������ ���� �������� 
		for (int i=1; i<=arr[0]; i++) { //
			switch (n) {
			case 2:
				if (arr[0]%i==0 && arr[1]%i==0) { //������ i�� ����������� 
					gys[cnt]=i; cnt++;  //����� �迭�� �߰� 
				}
				break;
			case 3:
				if (arr[0]%i==0 && arr[1]%i==0 && arr[2]%i==0) {
					gys[cnt]=i; cnt++;
				}
				break;
			}
		}
		
		for(int i=0; i<cnt; i++) {
			System.out.println(gys[i]);
		}
		
		
	}
	
}
