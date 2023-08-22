package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main2217_���� {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine()); //���� ���� 
		Integer[] arr = new Integer[n]; //������������ �������� Integer�� ���� 
		
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(bf.readLine()); //�� ������ ��ƿ �� �ִ� �ִ� �߷� 
		}
		
		//k���� ������ �߷��� w�� ��ü�� ���ø��� ������ �������� w/k��ŭ�� �߷��� �ɸ� 
		//�� k���� ������ �� �� �ִ� �߷��� �ִ밪�� k�� ���� �� �߷��� �ּڰ�*k 	
		//ArrayList<int[]> tmp = new ArrayList<int[]>(); //���� �迭(���� �迭)�� ���� ����Ʈ�� ���� 
		
		Arrays.sort(arr,Collections.reverseOrder()); //������������ ����  
	
		int max = arr[0]*1; //�켱 ���� �� ���� �߷� ū �ַ� �ʱ�ȭ �صΰ�  
		//�װͺ��� ���� ������ �ϳ��� ������ ���غ���  
		
		for (int i=0; i<n; i++) {
			int sum = arr[i]*(i+1); //�߷��� �ּڰ� * ���� ���� 
			if (max<sum) { 
				max = sum; 
			}
		}
		System.out.println(max); //���� �ִ� ��� 
		
	}
	
}