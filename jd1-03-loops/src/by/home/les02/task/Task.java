package by.home.les02.task;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		//task01();
		//task02();
		//task03();
		//task04();
		//task05();
		//task06();
		//task07();
		//task08();
		//task09();
		//task10();
		//task11();
		//task12();
		//task13();
		//task14();
		//task15();
		//task16();
		//task17();
		//task18();
		//task19();
		//task20();
		//task21();
		//task22();
		//task23();
		//task24();
		//task25();
		//task26();
		//task27();
		//task28();
		//task29();
		
		//task31();
		
		//task33();
		//task34();
		task35();
}
	public static void task01() {
		//���������� ������� �� ����� ����� �� 1 �� 5.
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
	public static void task02() {
		//���������� ������� �� ����� ����� �� 5 �� 1.
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
	}
	public static void task03() {
		//���������� ������� �� ����� ������� ��������� �� 3:
		for(int i = 1; i <= 10; i++) {
			int j = 3 * i;
			System.out.println(j);
		}
	}
	
	public static void task04() {
		//� ������� ��������� while �������� ��������� ������ ���� ������ ����� � ���������
		//�� 2 �� 100 ������������.
		int i = 2;
		while(i <= 100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
	
	public static void task05() {
		//� ������� ��������� while �������� ��������� ����������� ����� ���� ��������
		//����� � ��������� �� 1 �� 99 ������������.
		int i = 1;
		int sum = 0;
		while (i <= 99) {
			if (i % 2 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
	}
	
	public static void task06() {
		//�������� ���������, ��� ������������ ������ ����� ����� ������������� �����. �
		//��������� ��������� ��� ����� �� 1 �� ���������� ������������� �����.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any integer positive number: ");
		int a = scan.nextInt();
		int i = 1;
		int sum = 0;
		for (;i < a; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static void task07() {
		//��������� �������� ������� �� ������� [�,b] c ����� h:
		double a = 0.0;
		double b = 4.0;
		double h = 0.5;
		double x = a;
		double y;
		for(;x <= b; x += h) {
			if (x > 2) {
				y = x;
			} else {
				y = -x;
			}
			System.out.println(h + " | " + y);
		}
	}
	
	public static void task08() {
		//��������� �������� ������� �� ������� [�,b] c ����� h:
		int a = (int)(Math.random()*20);
		int b = (int)(Math.random()*20);
		int c = (int)(Math.random()*20);
		int h = 1;
		int x;
		int y;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		if (a > b) {
			x = b;
			for(;x <= a; x += h) {
				if (x == 15) {
					y = (x + c) * 2;
				}else {
					y = (x - c) + 6;
				}
				System.out.println(x + " | " + y);
			}
		}else {
			x = a;
			for(;x <= b; x += h) {
				if (x == 15) {
					y = (x + c) * 2;
				}else {
					y = (x - c) + 6;
				}
				System.out.println(x + " | " + y);
			}
		}
	}
	
	public static void task09() {
		//����� ����� ��������� ������ ��� �����.
		int i = 0;
		int j = 0;
		int sum = 0;
		while (i <= 100) {
			j = (int)Math.pow(i, 2);
			sum += j;
			i++;
		}
		System.out.println(sum);
	}
	
	public static void task10() {
		//��������� ��������� ���������� ������������ ��������� ������ ������� �����.
		BigInteger x; // ������ ����� ����� �������������� �����
		BigDecimal y; //������ ������������ ����� �������������� �����
		Integer i;
		i = 56;
		x = new BigInteger("67");
		
		x = x.multiply(x); //��������� � �� �
		int j;
		long mult = 1;
		while (i <= 200) {
			j = (int)Math.pow(i, 2);
			mult *= j;
			i++;
		}
		System.out.println(mult);
	}
	
	public static void task11() {
		//��������� ��������� ���������� �������� ����� ������ ������� �����
		int i = 1;
		int j;
		long dif = 0;
		while (i <= 200) {
			j = (int)Math.pow(i, 3);
			dif -= j;
			i++;
		}
		System.out.println(Math.abs(dif));
	}
	
	public static void task12() {
		//12. ������������������ �n �������� ���: �1 = 1, an =6+ �n-1 , ��� ������� n >1 ���������
		//��������� ���������� ������������ ������ 10 ������ ���� ������������������.
		long mult = 1;
		int[] mas = new int[10];
		for(int i = 0; i < 10; i++) {
			if(i == 0) {
				mas[i] = 1;
			}else if (i > 0) {
				mas[i] = 6 + mas[i-1];
			}
		}
		for(int i = 0; i < mas.length; i++) {
			mult = mult * mas[i];
		}
		for(int i = 0; i < mas.length - 1; i++) {
			System.out.print(mas[i] + ", ");
		}
		System.out.println();
		System.out.println(mult);
	}
	
	public static void task13() {
		//13. ��������� ������� �������� ������� y = 5 - x2/2 �� ������� [-5; 5] � ����� 0.5.
		double y;
		for (double x = -5; x <= 5; x = x + 0.5) {
			System.out.print("x = " + x + " | ");
			y = 5 - (Math.pow(x, 2) / 2);
			System.out.println("y = " + y + ";");
		}
	}
	
	public static void task14() {
		//14. ���� ����������� n. ���������: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
		int n = (int)(Math.random() * 20 + 5);
		System.out.println("n = " + n);
		double y = 0;
		double i = 1;
		for (; i <= n; i++) {
			y = y + 1 / i;
		}
		System.out.println("y = " + y);
	}
	
	public static void task15() {
		//15. ��������� : 1+2+4+8+...+ 2 � 10 �������.
		int x = 2;
		int y = 0;
		for(int i = 0; i <= 10; i++) {
			y = y + (int)Math.pow(x, i);
		}
		System.out.println("y = " + y);
	}
	
	public static void task16() {
		//16. ���������: (1+2)*(1+2+3)*...*(1+2+...+10).
		int y = 1 + 2;
		long mult = y;
		for (int i = 3; i <= 10; i++) {
			y = y + i;
			mult = mult * y;
			System.out.println(mult);
		}
		System.out.println("������������ ���� ������������������ = " + mult);
	}
	
	public static void task17() {
		//17. ���� �������������� (�) � ����������� (n). ���������: a(a+1)...(a+n-1)
		double a = 5.5;
		int n = 5;
		double mult = 1;
		for (int i = 0; i <= n; i++) {
			mult = mult*(a+i);
		}
		System.out.println(mult);
	}
	
	public static void task18() {
		//18. ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������ �������
		//������ ��� ����� ��������� �. ����� ���� ���� ����� ���:
		double e = Math.random() * 2;
		int n = (int)(Math.random() * 20 + 1);
		System.out.println("e = " + e);
		System.out.println("n = " + n);
		double an = 1;
		double sum = 0;
		for (int i = 0; i <= n; i++) {
			an = Math.pow(-1, i-1) / i;
			System.out.println("an = " + an);
			if (Math.abs(an) >= e) {
				sum = sum + an;
			}
		}
		System.out.println("����� �����: " + sum);
	}
	
	public static void task19() {
		//19. ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������ �������
		//������ ��� ����� ��������� �. ����� ���� ���� ����� ���:
		double e = Math.random();
		int n = (int)(Math.random() * 20 + 1);
		System.out.println("e = " + e);
		System.out.println("n = " + n);
		double an = 1;
		double sum = 0;
		for (int i = 0; i <= n; i++) {
			an = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
			System.out.println("an = " + an);
			if (Math.abs(an) >= e) {
				sum = sum + an;
			}
		}
		System.out.println("����� �����: " + sum);
	}
	
	public static void task20() {
		//20. ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������ �������
		//������ ��� ����� ��������� �. ����� ���� ���� ����� ���:
		double e = Math.random() - 1;
		int n = (int)(Math.random() * 20 + 1);
		System.out.println("e = " + e);
		System.out.println("n = " + n);
		double an = 1.0;
		double sum = 0;
		for (double i = 0; i <= n; i++) {
			an = (1 / ((3 * i - 2) * (3 * i + 1)));
			System.out.println("an = " + an);
			if (Math.abs(an) >= e) {
				sum = sum + an;
			}
		}
		System.out.println("����� �����: " + sum);
	}
	
	public static void task21() {
		//21. ��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�, b] � �����
		//h. ��������� ����������� � ���� �������, ������ ������� ������� � �������� ���������,
		//������ - ��������������� �������� �������:
		double a = -5;
		double b = 5;
		System.out.println("a = " + a + ", b = " + b);
		double h = 0.5;
		double y = 0;
		for (double x = a; x <= b; x = x + h) {
			y = x - Math.sin(x);
			System.out.println("-----------------------------------------------------");
			System.out.println("x = " + x + " || y = " + y );
		}
		System.out.println("-----------------------------------------------------");
	}
	
	public static void task22() {
		//22. ��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�, b] � �����
		//h. ��������� ����������� � ���� �������, ������ ������� ������� � �������� ���������,
		//������ - ��������������� �������� �������:
		double a = -5;
		double b = 5;
		System.out.println("a = " + a + ", b = " + b);
		double h = 0.5;
		double y = 0;
		for (double x = a; x <= b; x = x + h) {
			y = Math.pow(Math.sin(x), 2);
			System.out.println("-----------------------------------------------------");
			System.out.println("x = " + x + " || y = " + y );
		}
		System.out.println("-----------------------------------------------------");
	}
	
	public static void task23() {
		//23. ��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�, b] � �����
		//h. ��������� ����������� � ���� �������, ������ ������� ������� � �������� ���������,
		//������ - ��������������� �������� �������:
		double a = -5;
		double b = 5;
		System.out.println("a = " + a + ", b = " + b);
		double h = 0.5;
		double y = 0;
		for (double x = a; x <= b; x = x + h) {
			y = (1 / Math.tan(x / 3)) + 0.5 * Math.sin(x);
			System.out.println("-----------------------------------------------------");
			System.out.println("x = " + x + " || y = " + y );
		}
		System.out.println("-----------------------------------------------------");
	}
	
	public static void task24() {
		//24. �������� ����������� �����. ����� ����� ������ ����, �������� � ��� ������.
		//������������� ��� � ������ �����, ����� �������� ����� ��������� � �������� ������� ��
		//��������� � ��������� ������.
		int n = 563547846;
		System.out.println("�������� �����: " + n);
		int m = n;
		int sum = 0;
		int k = 0;
		int i = 0;
		for(; n > 0; n = n / 10) {
			k = n % 10;
			if (k % 2 == 0) {
				sum = sum + k;
			}
			i++;
		}
		System.out.println("����� ������ �����: " + sum);
		int sum1 = 0;
		for(; m > 0; m = m / 10) {
			k = m % 10;
			int u = k * (int)Math.pow(10, i-1);
			sum1 = sum1 + u;
			i--;
		}
		System.out.println("�������������� �����: " + sum1);
	}
	
	public static void task25() {
		//25. ��������� ���������� ��������� �����, ������� ���� ������������.
		Scanner sc = new Scanner(System.in);
		System.out.print("������� �����: ");
		while (sc.hasNextInt() == false) {
			String s = sc.next();
			System.out.print("������� �����: ");
		}
		int n = sc.nextInt();
		int mult = 1;
		for (int i = 1; i <= n; i++) {
			mult = mult * i;
		}
		System.out.println("!" + n + " = " + mult);
	}
	
	public static void task26() {
		//26. ������� �� ����� ������������ ����� ��������� � �� ���������� ������������� �
		//������ ���������� (������� ASCII).
		for(int i = 1; i <= 127; i++) {
			char c = (char) i;
			System.out.println("| " + i + "||" + c + " |");
		}
	}
	
	public static void task27() {
		//27. ��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������, �����
		//������� � ������ �����. m � n �������� � ����������.
		Scanner sc = new Scanner(System.in);
		int m;
		int n;
		System.out.print("������� m: ");
		while(sc.hasNextInt() == false) {
			String s = sc.next();
			System.out.print("��������� ���� �������� m: ");
		}
		m = sc.nextInt();
		System.out.print("������� n: ");
		while(sc.hasNextInt() == false) {
			String s = sc.next();
			System.out.print("��������� ���� �������� n: ");
		}
		n = sc.nextInt();
		if (m < n) {
			for(int k = m; k <= n; k = k + 1) {
				System.out.print("�������� ����� " + k + ": ");
				for(int i = 2; i < k; i++) {
					if (k % i == 0) {
						System.out.print(i + " | ");
					}
				}
				System.out.println();
			}
		}
		if (m > n) {
			for(int k = n; k <= m; k = k + 1) {
				System.out.print("�������� ����� " + k + ": |");
				for(int i = 2; i < k; i++) {
					if (k % i == 0) {
						System.out.print(i + " | ");
					}
				}
				System.out.println();
			}
		}
	}
	
	public static void task28() {
		//282. �������� ���������, � ������� �������� ��� �������� � � Y � ���� �������� (+, �, /,*). 
		//��������� ��������� Z � ����������� �� �����. ������������� ������� �� ���������
		//�������� ���� ��������, � ����� �� ���� Y=0 ��� �������. ������������ �����������
		//������������ ���������� ��� ������������ ��������� (�.�. ��������� ����). � ��������
		//������� ����������� ���������� ������� �0�.
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("������� ����: ");
			char c = sc.next().charAt(0);
			if (c == '0') {
				System.out.println("���������� ���������!");
				break;
			}else if (c == '+' || c == '-' || c == '/' || c == '*') {
				int X;
				int Y;
				System.out.print("������� X: ");
				while(sc.hasNextInt() == false) {
					sc.next();
					System.out.print("��������� ���� �������� X: ");
				}
				X = sc.nextInt();
				System.out.print("������� Y: ");
				while(sc.hasNextInt() == false) {
					sc.next();
					System.out.print("��������� ���� �������� Y: ");
				}
				Y = sc.nextInt();
				int z;
				if (c == '+') {
					z = X + Y;
					System.out.println("X + Y = " + z);
				} else if (c == '-') {
					z = X - Y;
					System.out.println("X - Y = " + z);
				} else if (c == '/') {
					if (Y != 0) {
						z = X / Y;
						System.out.println("X / Y = " + z);
					}else {
						System.out.println("������� �� 0!");
					}
				} else if (c == '*') {
					z = X * Y;
					System.out.println("X * Y = " + z);
				}
			}else {
				System.out.println("������ ���� �� ������������.");
			}
			System.out.println("________________________________");
		}		
	}
	
	public static void task29() {
		//29. ���� ��� �����. ���������� �����, �������� � ������ ��� ������� ��� � ������� �����.
		int n1 = 240;
		int n2 = 332;
		int m2 = n2;
		int i = 0;
		for(; n1 > 0; n1 = n1 / 10) {
			int k1 = n1 % 10;
			
			//System.out.println("k1 = " + k1);
			for(; n2 > 0; n2 = n2 / 10) {
				int k2 = n2 % 10;
				//System.out.println("k2 = " + k2);
				if (k1 == k2) {
					System.out.println("���������� ����� " + k1 + ".");
					i++;
					break;
				}
			}
			n2 = m2;
		}
		if (i == 0) {
			System.out.println("���������� �� �������.");
		}
	}
	
	public static void task30() {
		//30. �������� ���������, ����������� ������� ����� � ��������.
		
	}
	
	public static void task31() {
		//31. ��������� ���������� ���� ����� � ��������� �� 1 �� 15 ������������. �������
		//�������� �� �������. ��������� ������ �������� ��������� � ����������� ����� �� ���,
		//��� ������������� ���������, � ����� ��������� ����� ������������.
		int[] mas = new int[5];
		int[] mas1 = new int[5];
		int[] mas2 = new int[5]; //���������
		int[] mas3 = new int[5]; //�����������
		int[] mas4 = new int[5]; //��������� �����
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int)(Math.random() * 15 + 1);
		}
		System.out.print("{");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println("}");
		for (int i = 0; i < mas1.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("������� ����� " + (i + 1) + ": ");
			while (sc.hasNextInt() == false) {
				sc.next();
				System.out.print("������� ����� " + (i + 1) + ": ");
			}
			mas1[i] = sc.nextInt();
		}
		//����� ��������� �����
		System.out.println();
		System.out.print("��������� �����: {");
		for (int i = 0; i < mas1.length; i++) {
			System.out.print(mas1[i] + " ");
		}
		System.out.println("}");
		for (int a = 0; a < mas1.length; a++) {
			if (mas1[a] > 15 | mas1[a] < 1) {
				mas4[a] = mas1[a];
			}
		}
		//����� ��������� �����
		System.out.print("��������� �����: {");
		for (int i = 0; i < mas4.length; i++) {
			System.out.print(mas4[i] + " ");
		}
		System.out.println("}");
		int m = 0;
		for (; m < mas1.length; m++){
			for (int j = 0; j < mas.length; j++) {
				//System.out.println(mas1[m] + "|||" + mas[j]);
				if(mas1[m] == mas[j]) {
					mas2[m] = mas1[m];
				}
			}
			for (int j = 0; j < mas.length; j++) {
				if(mas1[m] != mas[j]) {
					mas3[m] = mas1[m];
				}
			}
		}
		System.out.print("��������� �����: {");
		for (int k = 0; k < mas2.length; k++) {
			System.out.print(mas2[k] + " ");
		}
		System.out.print("}");
		
		System.out.println();
		System.out.print("����������� �����: {");
		for (int l = 0; l < mas3.length; l++) {
			System.out.print(mas3[l] + " ");
		}
		System.out.print("}");
		
	}
	public static void task33() {
		//33. ������� ���������� ����� ������� ������������ �����.
		int m = (int)(Math.random() * 9000000 + 1);
		System.out.println("��������� �����: " + m);
		int m1 = m;
		int i = 0;
		for(; m > 0; m = m / 10) {
			i++;
		}
		int[] mas = new int[i];
		int j = 0;
		for (; m1 > 0; m1 = m1 / 10) {
			mas[j] = m1 % 10;
			j++;
		}
		int max = mas[0];
		for(int z = 0; z < mas.length; z++) {
			if (max < mas[z]) {
				max = mas[z];
			}
		}
		System.out.println("������������ �����: " + max);
	}
	public static void task34() {
		//34. ������� ��� �������������� �����, ����� ���� ������� �� ������� ����� 15.
		int n1 = 1000;
		int n2 = 9999;
		int sum = 0;
		for (int i = n1; i <= n2; i = i + 1) {
			int j = i;
			for (; j > 0; j = j / 10) {
				sum = sum + (j % 10);
			}
			if (sum == 15) {
				System.out.println("| " + i + " |");
			}
			sum = 0;
		}
	}
	public static void task35() {
		//35. ������� ���������� ������ ���� ������� ������������ �����.
		int m = (int)(Math.random() * 9000000 + 1);
		System.out.println("��������� �����: " + m);
		int i = 0;
		for (; m > 0; m = m / 10) {
			int k1 = m % 10;
			if (k1 == 0) {	
			}else if (k1 % 2 == 0) {
				i++;
			}
		}if (i == 0) {
			System.out.println("������ ���� ���.");
		} else {
			System.out.println("���������� ������ ����: " + i);
		}
	}
}
