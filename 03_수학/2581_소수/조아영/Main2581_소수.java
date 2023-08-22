package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main2581_�Ҽ� {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		//m �̻� n ���� �� �� �Ҽ��� ��� �̵��� �հ� �ּڰ� ã�� 
		
		List<Integer> prime = new ArrayList<>(); //�Ҽ�
		List<Integer> num = new ArrayList<>(); //�Ҽ� ���� ���ڵ� 
		
		for (int i=2; i<=n; i++) {
			if (num.contains(i)) { //�Ҽ� ���� ���ڿ� ���ԵǾ� �ִ� ��� �ǳʶ� 
				continue;
			} else { //�ƴ϶�� 
				prime.add(i); //�Ҽ��� �ְ� 
				for (int j=i+1; j<=n; j++) { //�ش� ������ ū �� �� i�� ����� ���� num�� ���� (�Ҽ��� ����� �Ҽ��ƴϴϱ� ����) 
					if (j%i==0) {
						num.add(j);
					}
				}
			}
		}
		
		int sum = 0; //��
		int min = 10001; //�ּڰ�  
		
		for (int i : prime) { //����Ʈ ��ȸ�ϸ鼭 
			if (i>=m) { //m���� ū �Ҽ��� ���� 
				sum = sum+i;
		}
			if (i>=m && i<min) { //�ּڰ� ã�� 
				min = i; 
			}
		}
		
		if (sum==0) { //���� �����ϴ� �Ҽ��� ������ 
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
			
	}

}
