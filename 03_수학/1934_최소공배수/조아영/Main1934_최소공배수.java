package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1934_�ּҰ���� {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //�Է¹��� bf
		int tc = Integer.parseInt(bf.readLine()); //���� ���� 
		StringTokenizer st; 
		
		for (int t=1; t<=tc; t++) {
			
		String tmp = bf.readLine(); //���ڵ��� �ϴ� �о�� 
		st = new StringTokenizer(tmp," "); //�ѷ� �ɰ��� �ϳ��� ���� 
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		System.out.println(lcm(a,b));
		
		}
		
	}
	
	//�ִ�����(GCD, Greatest Common Divisor)
	//��Ŭ���� ȣ����
	public static int gcd(int n, int m) { 
		
		if (n%m==0) { //������(remainder)�� 0�� �� �� 
			return m; //����(������ ��. divisor)�� ��ȯ�ϰ� ���� 
		}
		
		return gcd(m,n%m); //�������� 0�� �� ������ ����Լ��� ���� 
		
	}	
	
	//�ּҰ����(LCM, Least Common Multiple) 
	public static int lcm(int n, int m) {

		return n*m/gcd(n,m); //�� ���� �ּҰ���� = �� ���� ���� �ִ������� ������ �ȴ� 
		
	}

	
}
