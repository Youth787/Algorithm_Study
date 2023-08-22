package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1110_���ϱ����Ŭ {
	
	public static int cnt = 0; //����Ŭ �� 
	public static int origin; //���� �� 
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine()); //���ڷ� ��ȯ 
		origin = n; //�Է¹��� ���� ���� ���� ������ 
		
		cycle(n); //����Լ� ���� 
		
		System.out.println(cnt); //����Ŭ ������ Ƚ�� ���
	
	}
	
	public static int cycle(int n) {
	
		if (n==origin && cnt>0) { //n�� ����Ŭ 1ȸ �̻��� ���� ������ ���� ���ƿ� ��� 
			return cnt; //cnt ���� ��ȯ�� 
		}
		
		//������ ���� ���ư��� �ʾҴٸ� ������ ����Ŭ�� ������ 
		int num1 = n%10; //���� �־��� ���� ���� ������ �ڸ� �� 
		int num2 = ( n/10 + n%10 ) %10; //�� �ڸ� ���� ���� ���� ������ �ڸ� �� 
		n = num1*10+num2; //�� ���ڸ� �̾���� 
		cnt++; //����Ŭ �ѹ� �������ϱ� cnt+1 

		return cycle(n); //����Լ� ����
	
	}
	

}
