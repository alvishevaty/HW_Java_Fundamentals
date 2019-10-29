package by.home.les02.task;

public class Task {

	public static void main(String[] args) {
		// task01();
		// task02();
		// task03();
		// task04();
		// task06();
		// task07();
		// task08();
		// task09();
		// task10();
		// task11();
		// task12();
		// task13();
		// task14();
		// task15();
		// task16();
		// task17();
		// task18();
		// task19();
		// task20();
		// task21();
		// task22();
		// task23();
		// task24();
		// task25();
		// task26();
		// task27();
		// task28();
		// task29();
		// task30();
		// task31();
		// task32();
		// task33();
		// task34();
		// task35();
		// task36();
		// task37();
		// task38();
		// task39();
		// task40();
	}

	public static void task01() {
		
		/*
		 * 1. Даны два действительных числа х и у. Вычислить их сумму, разность,
		 * произведение и частное.
		 */
		
		double x = Math.random();
		double y = Math.random();

		System.out.println("x =" + x + "; y = " + y);
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
	}

	public static void task02() {

		/*
		 *  2. Найдите значение функции: с = 3 + а.
		 */

		double a = Math.random();
		double c = (3 + a);

		System.out.println("a = " + a);
		System.out.println("c = " + c);
	}

	public static void task03() {

		/*
		 *  3. Найдите значение функции: z = 2 * x + ( y – 2 ) * 5.
		 */

		double z;
		int x = (int) (Math.random() * 10);
		int y = (int) (Math.random() * 10);

		z = (2 * x + (y - 2) * 5);

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}

	public static void task04() {

		/*
		 *  4. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
		 */

		double z;
		double a = (Math.random() * 10);
		double b = (Math.random() * 10);
		double c = (Math.random() * 10);

		z = (((a - 3) * b / 2) + c);

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("z = " + z);
	}

	public static void task05() {

		/*
		 * 5. Составить алгоритм нахождения среднего арифметического двух чисел 1)
		 * Инициализируем два числа и присваиваем им значения. 2) Находим сумму чисел.
		 * 3) Делим сумму на количество чисел (на 2). 4) Выводим результат.
		 */
	}

	public static void task06() {

		/*
		 * 6. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько
		 * литров молока в m больших бидонах, если в каждом большом бидоне на 12 л.
		 * больше, чем в малом?
		 */

		int n = (int) (Math.random() * 10);
		int x;
		int m = (int) (Math.random() * 10);
		int m1;
		int k = (80 / n);

		m1 = (k + 12);
		x = m1 * m;

		System.out.println("Литров в малом бидоне: " + k);
		System.out.println("Литров в большом бидоне: " + m1);
		System.out.println("Всего литров в больших бидонах: " + x);
	}

	public static void task07() {

		/*
		 * 7. Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь
		 * прямоугольника
		 */

		int a = (int) (Math.random() * 100);
		int b = a / 2;
		int s;

		s = a * b;

		System.out.println("Длина прямоугольника a = " + a);
		System.out.println("Ширина прямоугольника b = " + b);
		System.out.println("Площадь = " + s);
	}

	public static void task08() {

		/*
		 * 8. Вычислить значение выражения по формуле (все переменные принимают
		 * действительные значения): (b + √b2 + 4ac)/ 2a − a3c + b−2
		 */

		double a = (Math.random() * 100 + 1);
		double b = (Math.random() * 100 + 1);
		double c = (Math.random() * 100 + 1);
		double z;

		z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - (Math.pow(a, 3) * c + Math.pow(b, -2));

		System.out.println("z = " + z);
	}

	public static void task09() {

		/*
		 * 9. Вычислить значение выражения по формуле (все переменные принимают
		 * действительные значения)
		 */

		double a = (Math.random() * 100 + 1);
		double b = (Math.random() * 100 + 1);
		double c = (Math.random() * 100 + 1);
		double d = (Math.random() * 100 + 1);
		double z;

		z = ((a / c) * (b / d)) - ((a * b - c) / (c * d));

		System.out.println("z = " + z);
	}

	public static void task10() {

		/*
		 * 10. Вычислить значение выражения по формуле (все переменные принимают
		 * действительные значения)
		 */

		double x = (Math.random() * 100 + 1);
		double y = (Math.random() * 100 + 1);
		double z;

		z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * (Math.tan(x * y));

		System.out.println("z = " + z);
	}

	public static void task11() {

		/*
		 * 11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b
		 * двух катетов.
		 */

		double a = (Math.random() * 100);
		double b = (Math.random() * 100);
		double c = Math.sqrt(a * a + b * b);
		double p;
		double s;

		p = a + b + c;
		s = a * b / 2;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("p = a + b + c = " + p);
		System.out.println("s = a * b / 2 = " + s);
	}

	public static void task12() {

		/*
		 * 12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и
		 * (x2, у2).
		 */

		int x1 = (int) (Math.random() * 20 - 10);
		int y1 = (int) (Math.random() * 20 - 10);
		int x2 = (int) (Math.random() * 20 - 10);
		int y2 = (int) (Math.random() * 20 - 10);
		int x = 0;
		int y = 0;
		double s;

		if (x1 > 0 && x2 > 0) {
			x = Math.abs(x1 - x2);
		} else if (x1 <= 0 && x2 <= 0) {
			x = Math.abs(x1 - x2);
		} else if ((x1 >= 0 && x2 <= 0) || (x1 <= 0 && x2 >= 0)) {
			x = Math.abs(x1) + Math.abs(x2);
		}

		if (y1 >= 0 && y2 >= 0) {
			y = Math.abs(y1 - y2);
		} else if (y1 <= 0 && y2 <= 0) {
			y = Math.abs(y1 - y2);
		} else if ((y1 >= 0 && y2 <= 0) || (y1 <= 0 && y2 >= 0)) {
			y = Math.abs(y1) + Math.abs(y2);
		}

		s = Math.sqrt(x * x + y * y);
		System.out.println("(x1, y1) = (" + x1 + ", " + y1 + ")");
		System.out.println("(x2, y2) = (" + x2 + ", " + y2 + ")");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("s = " + s);
	}

	public static void task13() {

		/*
		 * 13. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3).
		 * Найти его периметр и площадь.
		 */

		int x1 = (int) (Math.random() * 20 - 10);
		int y1 = (int) (Math.random() * 20 - 10);
		int x2 = (int) (Math.random() * 20 - 10);
		int y2 = (int) (Math.random() * 20 - 10);
		int x3 = (int) (Math.random() * 20 - 10);
		int y3 = (int) (Math.random() * 20 - 10);

		int xa = 0;
		int ya = 0;
		int xb = 0;
		int yb = 0;
		int xc = 0;
		int yc = 0;

		double a;
		double b;
		double c;

		double P;
		double p;
		double S;

		if (x1 > 0 && x2 > 0) {
			xa = Math.abs(x1 - x2);
		} else if (x1 <= 0 && x2 <= 0) {
			xa = Math.abs(x1 - x2);
		} else if ((x1 >= 0 && x2 <= 0) || (x1 <= 0 && x2 >= 0)) {
			xa = Math.abs(x1) + Math.abs(x2);
		}

		if (y1 >= 0 && y2 >= 0) {
			ya = Math.abs(y1 - y2);
		} else if (y1 <= 0 && y2 <= 0) {
			ya = Math.abs(y1 - y2);
		} else if ((y1 >= 0 && y2 <= 0) || (y1 <= 0 && y2 >= 0)) {
			ya = Math.abs(y1) + Math.abs(y2);
		}

		if (x2 > 0 && x3 > 0) {
			xb = Math.abs(x2 - x3);
		} else if (x2 <= 0 && x3 <= 0) {
			xb = Math.abs(x2 - x3);
		} else if ((x2 >= 0 && x3 <= 0) || (x2 <= 0 && x3 >= 0)) {
			xb = Math.abs(x2) + Math.abs(x3);
		}

		if (y2 >= 0 && y3 >= 0) {
			yb = Math.abs(y2 - y3);
		} else if (y2 <= 0 && y3 <= 0) {
			yb = Math.abs(y2 - y3);
		} else if ((y2 >= 0 && y3 <= 0) || (y2 <= 0 && y3 >= 0)) {
			yb = Math.abs(y2) + Math.abs(y3);
		}

		if (x3 > 0 && x1 > 0) {
			xc = Math.abs(x3 - x1);
		} else if (x3 <= 0 && x1 <= 0) {
			xc = Math.abs(x3 - x1);
		} else if ((x3 >= 0 && x1 <= 0) || (x3 <= 0 && x1 >= 0)) {
			xc = Math.abs(x3) + Math.abs(x1);
		}

		if (y3 >= 0 && y1 >= 0) {
			yc = Math.abs(y3 - y1);
		} else if (y3 <= 0 && y1 <= 0) {
			yc = Math.abs(y3 - y1);
		} else if ((y3 >= 0 && y1 <= 0) || (y3 <= 0 && y1 >= 0)) {
			yc = Math.abs(y3) + Math.abs(y1);
		}

		a = Math.sqrt(xa * xa + ya * ya);
		b = Math.sqrt(xb * xb + yb * yb);
		c = Math.sqrt(xc * xc + yc * yc);

		P = a + b + c;
		p = P / 2;
		S = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println("(x1, y1) = (" + x1 + ", " + y1 + ")");
		System.out.println("(x2, y2) = (" + x2 + ", " + y2 + ")");
		System.out.println("(x3, y3) = (" + x3 + ", " + y3 + ")");

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		System.out.println("Периметр треугольника = " + P);
		System.out.println("Площадь треугольника S = " + S);
	}

	public static void task14() {

		/*
		 * 14. Вычислить длину окружности и площадь круга одного и того же заданного
		 * радиуса R.
		 */

		int R = 15;
		double C = 2 * Math.PI * R;
		double A = Math.PI * Math.pow(R, 2);

		System.out.println("Длина окружности = " + C);
		System.out.println("Площадь круга = " + A);
	}

	public static void task15() {

		/*
		 * 15. Написать программу, которая выводит на экран первые четыре степени числа
		 * π.
		 */

		int i = 1;

		while (i <= 4) {
			double pi = Math.pow(Math.PI, i);
			System.out.println("Число ПИ в степени " + i + " = " + pi);
			i++;
		}
	}

	public static void task16() {

		/*
		 * 16. Найти произведение цифр заданного четырехзначного числа.
		 */

		int n = (int) (Math.random() * 9000 + 1000);
		int p = 1;

		System.out.println("n = " + n);

		for (; n > 0; n = n / 10) {
			int a = n % 10;
			System.out.println("a = " + a);
			p = p * a;
		}

		System.out.println("p = " + p);
	}

	public static void task17() {

		/*
		 * 17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее
		 * геометрическое модулей этих чисел.
		 */

		int a = (int) (Math.random() * 20 - 10);
		int b = (int) (Math.random() * 20 - 10);
		double a3 = Math.pow(a, 3);
		double b3 = Math.pow(b, 3);
		double ar;
		double ge;

		ar = a3 * b3 / 2;
		ge = Math.sqrt(Math.abs(a) * Math.abs(b));

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		System.out.println("Среднее арифметическое кубов чисел: " + ar);
		System.out.println("Средне геометрическое модулей чисел: " + ge);
	}

	public static void task18() {

		/*
		 * 18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и
		 * объем этого куба.
		 */

		int a = 8;
		int Sg = a * a;
		int S = Sg * 6;
		double V = Math.pow(a, 3);

		System.out.println("Площадь грани: " + Sg);
		System.out.println("Площадь полной поверхности: " + S);
		System.out.println("Объем куба: " + V);
	}

	public static void task19() {

		/*
		 * 19. Дана сторона равностороннего треугольника. Найти площадь этого
		 * треугольника, его высоту, радиусы вписанной и описанной окружностей.
		 */

		int a = (int) (Math.random() * 20 + 1);
		double h = Math.sqrt(3) * a / 2;
		double S = a * h / 2;
		double r = a / (2 * Math.sqrt(3));
		double R = a / Math.sqrt(3);

		System.out.println("Сторона треугольника: " + a);
		System.out.println("Высота треугольника: " + h);
		System.out.println("Площадь треугольника: " + S);
		System.out.println("Радиус вписанной окружности: " + r);
		System.out.println("Радиус описанной окружности: " + R);
	}

	public static void task20() {

		/*
		 * 20. Известна длина окружности. Найти площадь круга, ограниченного этой
		 * окружностью.
		 */

		double C = (Math.random() * 100 + 1);
		double R = C / 2 / Math.PI;
		double A = Math.PI * Math.pow(R, 2);

		System.out.println("Длина окружности: " + C);
		System.out.println("Радиус окружности: " + R);
		System.out.println("Площадь круга: " + A);
	}

	public static void task21() {

		/*
		 * 21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной
		 * и целой частях). Поменять местами дробную и целую части числа и вывести
		 * полученное значение числа.
		 */

		double R = 123.456;
		int i = (int) R;
		int j = (int) ((R - i) * 1000);
		double k = (double) i / 1000;
		double r = j + k;

		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(r);

	}

	public static void task22() {

		/*
		 * 22. Дано натуральное число Т, которое представляет длительность прошедшего
		 * времени в секундах. Вывести данное значение длительности в часах, минутах и
		 * секундах в следующей форме: ННч ММмин SSc.
		 */

		int T = 1234567890;
		int sec = T % 60;
		T = T / 60;
		int min = T % 60;
		T = T / 60;
		int hour = T % 24;

		System.out.println(hour + "ч " + min + "мин " + sec + "с");

	}

	public static void task23() {

		/*
		 * 23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R
		 * (R> r).
		 */

		int r = 15;
		int R = 20;
		double s = Math.PI * r * r;
		double S = Math.PI * R * R;
		double Sk = S - s;

		System.out.println("Площадь кольца: " + Sk);
	}

	public static void task24() {

		/*
		 * 24. Найти площадь равнобедренной трапеции с основаниями а и b и углом α при
		 * большем основании а.
		 */

		int a = 24;
		int b = 12;
		int alfa = 60;
		int c = (a - b) / 2;
		double h = c * Math.tan(alfa * Math.PI / 180);
		double S = (a + b) * h / 2;

		System.out.println(S);
	}

	public static void task25() {

		/*
		 * 25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными
		 * коэффициентами a, b и с (предполагается, что а≠0 и что дискриминант уравнения
		 * неотрицателен).
		 */

		int a = (int) (Math.random() * 20 - 10);

		while (a == 0) {
			a = (int) (Math.random() * 20 - 10);
		}

		int b = (int) (Math.random() * 20 - 10);
		int c = (int) (Math.random() * 20 - 10);
		double D = Math.pow(b, 2) - 4 * a * c;
		double x, x1, x2;

		System.out.println("a, b, c = " + a + ", " + b + ", " + c);
		System.out.println("D = " + D);

		if (D == 0) {
			x = (-b) / (2 * a);
			System.out.println("Корень квадратного уравнения: x = " + x);
		} else if (D > 0) {
			x1 = ((-b) + Math.sqrt(D)) / (2 * a);
			x2 = ((-b) - Math.sqrt(D)) / (2 * a);
			System.out.println("Корни квадратного уравнения: x1 = " + x1 + ", x2 = " + x2);
		}

	}

	public static void task26() {

		/*
		 * 26. Найти площадь треугольника, две стороны которого равны а и b, а угол
		 * между этими сторонами у.
		 */

		int a = (int) (Math.random() * 20 + 1);
		int b = (int) (Math.random() * 20 + 1);
		int y = 30;
		double S = a * b * Math.sin(y * Math.PI / 180) / 2;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println(Math.sin(y * Math.PI / 180));
		System.out.println("Площадь треугольника: " + S);

	}

	public static void task27() {

		/*
		 * 27. Дано значение a. Не используя никаких функций и никаких операций, кроме
		 * умножения, получить значение а8 за три операции и а10 за четыре операции.
		 */

		int a = (int) (Math.random() * 10 + 1);
		int a2 = a * a;
		int a4 = a2 * a2;
		int a8 = a4 * a4;
		int a10 = a8 * a2;

		System.out.println("a = " + a);
		System.out.println("Р°8 = " + a8);
		System.out.println("a10 = " + a10);

	}

	public static void task28() {

		/*
		 * 28. Составить программу перевода радианной меры угла в градусы, минуты и
		 * секунды.
		 */

		double y = Math.PI / 2;
		double deg = y * 180 / Math.PI;
		double sec = deg * 60;
		double min = sec * 60;

		System.out.println(y + " радиан = " + deg + " градусов.");
		System.out.println(y + " радиан = " + sec + " секунд.");
		System.out.println(y + " радиан = " + min + " минут.");

	}

	public static void task29() {

		/*
		 * 29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
		 */

		int a = 14;
		int b = 9;
		int c = 15;

		double p = (a + b + c) / 2;
		double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		// S = 1/2 * a*b*sin(alfa)
		// РЅР°С…РѕРґРёРј x = sin(alfa)
		double x = (2 * S) / (a * b);

		double ang1_rad = Math.asin(x);
		double ang1_deg = ang1_rad * 180 / Math.PI;

		double y = (2 * S) / (b * c);
		double ang2_rad = Math.asin(y);
		double ang2_deg = ang2_rad * 180 / Math.PI;

		double z = (2 * S) / (c * a);
		double ang3_rad = Math.asin(z);
		double ang3_deg = ang3_rad * 180 / Math.PI;

		double sum = ang1_deg + ang2_deg + ang3_deg;

		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		System.out.println(x);
		System.out.println("Угол между сторонами a и b: " + ang1_rad + " радиан, " + ang1_deg + " градусов.");
		System.out.println("Угол между сторонами b и c: " + ang2_rad + " радиан, " + ang2_deg + " градусов.");
		System.out.println("Угол между сторонами c и a: " + ang3_rad + " радиан, " + ang3_deg + " градусов.");
		System.out.println(sum);

	}

	public static void task30() {

		/*
		 * 30. Три сопротивления R1 R2, и R3 соединены параллельно. Найдите
		 * сопротивление соединения.
		 */

		double R1 = 110;
		double R2 = 120;
		double R3 = 115;
		double R = ((R1 * R2 * R3) / (R2 * R3 + R1 * R3 + R1 * R2));

		System.out.println("Полное сопротивление: R = " + R);
	}

	public static void task31() {

		/*
		 * 31. Составить программу для вычисления пути, пройденного лодкой, если ее
		 * скорость в стоячей воде v км/ч, скорость течения реки v1 км/ч, время движения
		 * по озеру t1 ч, а против течения реки — t2 ч.
		 */
		int v = 15;
		int v1 = 5;
		int t1 = 2;
		int t2 = 3;
		int v2 = v - v1;
		int s1 = v * t1;
		int s2 = v2 * t2;
		int S = s1 + s2;

		System.out.println("Полный путь: " + S);

	}

	public static void task32() {

		/*
		 * 32. Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к
		 * с (0 ≤к ≤59). Какое время будут показывать часы через р ч q мин r с?
		 */

		int m = (int) (Math.random() * 23);
		int n = (int) (Math.random() * 59);
		int k = (int) (Math.random() * 59);

		int p = (int) (Math.random() * 23);
		int q = (int) (Math.random() * 59);
		int r = (int) (Math.random() * 59);

		System.out.println("Исходное время: " + m + "ч" + n + "мин " + k + "с");
		System.out.println("Интервал: " + p + "ч " + q + "мин " + r + "с");

		k = k + r;
		if (k > 60) {
			k = k - 60;
			n = n + 1;
		}

		n = n + q;
		if (n > 60) {
			n = n - 60;
			m = m + 1;
		}

		m = m + p;
		if (m == 24) {
			m = 0;
		} else if (m > 24) {
			m = m - 24;
		}

		System.out.println("Конечное время: " + m + "ч " + n + "мин " + k + "с");

	}

	public static void task33() {

		/*
		 * 33. Ввести любой символ и определить его порядковый номер, а также указать
		 * предыдущий и последующий символы.
		 */

		char j = (char) (Math.random() * 65535);
		int code = j;
		char c1 = (char) (code - 1);
		char c2 = (char) (code + 1);

		System.out.println("Символ: " + j + " порядковый помер: " + code);
		System.out.println("Предудущий символ: " + c1 + " порядковый номер " + (code - 1));
		System.out.println("Последующий символ: " + c2 + " порядковый номер " + (code + 1));

	}

	public static void task34() {

		/*
		 * 34. Дана величина А, выражающая объем информации в байтах. Перевести А в
		 * более крупные единицы измерения информации.
		 */

		double A = 1_234_567_890;
		double kb = A / 1000;
		double mb = kb / 1000;
		double gb = mb / 1000;

		System.out.println(A + " byte");
		System.out.println(kb + " Kb");
		System.out.println(mb + " Mb");
		System.out.println(gb + " Gb");

	}

	public static void task35() {

		/*
		 * 35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и
		 * младшую цифру целой части числа M/N.
		 */

		double M = Math.random() * 100000 + 1000000;
		double N = Math.random() * 100 + 100;

		double K = Math.round((M / N) * 1000.0) / 1000.0;
		int C = (int) K;

		double D = (Math.round((K - C) * 1000.0) / 1000.0) * 1000;
		int T = (int) D;

		int c = 0;
		int k = 0;
		int t = 0;
		int d = 0;

		while (C > 0) {
			c = C % 10;
			if (c > k) {
				k = c;
			}
			C /= 10;
		}

		while (T > 0) {
			t = T % 10;
			if (t > d) {
				d = t;
			}
			T /= 10;
		}

		System.out.println("Натуральные числа: M = " + M + " N = " + N);
		System.out.println("Результат деления: = " + K);
		System.out.println("Младшая цифра целой части: " + k);
		System.out.println("Старшая цифра дробной части: " + d);

	}

	public static void task36() {

		/*
		 * 36. Найти частное произведений четных и нечетных цифр четырехзначного числа.
		 */

		int n = (int) (Math.random() * 9000 + 1000);

		System.out.println(n);

		int me = 1;
		int mo = 1;
		int n1 = 0;
		int n2 = 0;

		for (; n > 0; n = n / 10) {
			int m = n % 10;
			if (m == 0) {
				continue;
			}

			if (m % 2 == 0) {
				me = me * m;
				n1++;
			} else if (m % 2 != 0) {
				mo = mo * m;
				n2++;
			}
		}

		if (n1 == 0) {
			me = 0;
		}
		if (n2 == 0) {
			mo = 0;
		}

		System.out.println(me + "  " + mo);
		System.out.println("Частное произведений: " + (me - mo));

	}

	public static void task37() {

		/*
		 * 37. Составить линейную программу, печатающую значение true, если указанное
		 * высказывание является истинным, и false — в противном случае: 
		 * • Целое число N является четным двузначным числом. 
		 * • Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр. 
		 * • Сумма цифр данного трехзначного числа N является четным числом. 
		 * • Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п). 
		 * • Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа. 
		 * • Треугольник со сторонами а,b,с является равнобедренным. 
		 * • Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре. 
		 * • Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4). 
		 * • График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п).
		 */

		boolean b = true;

		/*
		 * Задача 1: Целое число N является четным двузначным числом.
		 */

		int N = (int) (Math.random() * 100 + 1);
		int n1 = 0;
		int n2 = N;

		for (; n2 > 0; n2 = n2 / 10) {
			n1++;
		}

		System.out.print("1.	N = " + N + ": ");

		if (N % 2 == 0 && n1 == 2) {
			System.out.println(b);
		} else {
			System.out.println(!b);
		}

		/*
		 * Задача 2: Сумма двух первых цифр заданного четырехзначного числа равна сумме
		 * двух его последних цифр.
		 */

		int M = (int) (Math.random() * 9000 + 1000);
		int m4 = M;
		int m5 = 0;
		int m1 = 0;
		int m2 = 0;
		int m3 = 0;

		for (; M > 0; M = M / 10) {
			m5 = M % 10;
			if (m3 >= 2) {
				m1 = m1 + m5;
				m3++;
				continue;
			}
			m2 = m2 + m5;
			m3++;
		}

		System.out.print("2.	M = " + m4 + " : ");

		if (m1 == m2) {
			System.out.println(b);
		} else {
			System.out.println(!b);
		}

		/*
		 * Задача 3: Сумма цифр данного трехзначного числа N является четным числом.
		 */

		int Z = (int) (Math.random() * 900 + 100);
		int z1 = Z;
		int z2 = 0;
		int z3 = 0;

		for (; Z > 0; Z = Z / 10) {
			z2 = Z % 10;
			z3 = z3 + z2;
		}

		System.out.print("3.	Z = " + z1 + " : ");

		if (z3 % 2 == 0) {
			System.out.println(b);
		} else {
			System.out.println(!b);
		}

		/*
		 * Задача 4: Точка с координатами (х, у) принадлежит части плоскости, лежащей
		 * между прямыми х= т, х= п (т<п).
		 */

		int x = (int) (Math.random() * 40 - 20);
		int y = (int) (Math.random() * 40 - 20);
		int m = (int) (Math.random() * 40 - 20);
		int n = (int) (Math.random() * 40 - 20);

		while (m > n) {
			m = (int) (Math.random() * 40 - 20);
		}

		System.out.print("4.	(x,y) = (" + x + "," + y + ") ; m = " + m + " ; n = " + n + " : ");

		if (x >= m & x <= n) {
			System.out.println(b);
		} else {
			System.out.println(!b);
		}

		/*
		 * Задача 5: Квадрат заданного трехзначного числа равен кубу суммы цифр этого
		 * числа.
		 */

		int X = (int) (Math.random() * 900 + 100);
		int x1 = (int) Math.pow(X, 2);
		int x2 = X;
		int x3 = 0;
		int x4 = 0;

		for (; X > 0; X = X / 10) {
			x3 = X % 10;
			x4 = x4 + x3;
		}

		x4 = (int) Math.pow(x4, 3);

		System.out.print("5.	X = " + x2 + " : ");

		if (x1 == x4) {
			System.out.println(b);
		} else {
			System.out.println(!b);
		}

		/*
		 * Задача 6: Треугольник со сторонами а,b,с является равнобедренным.
		 */

		int A = (int) (Math.random() * 19 + 1);
		int B = (int) (Math.random() * 19 + 1);
		int C = (int) (Math.random() * 19 + 1);

		System.out.print("6.	a,b,c = " + A + "," + B + "," + C + " : ");

		if (A == B && B == C && C == A) {
			System.out.println(!b);
		} else if (A == B || B == C || C == A) {
			System.out.println(b);
		} else {
			System.out.println(!b);
		}

		/*
		 * Задача 7: Сумма каких-либо двух цифр заданного трехзначного натурального
		 * числа N равна третьей цифре.
		 */

		N = (int) (Math.random() * 900 + 100);
		n1 = N;
		n2 = N % 10;
		N = N / 10;
		int n3 = N % 10;
		N = N / 10;
		int n4 = N % 10;

		System.out.print("7.	N = " + n1 + " : ");

		if ((n4 + n3) == n2 || (n4 + n2) == n3 || (n3 + n2) == n4) {
			System.out.println(b);
		} else {
			System.out.println(!b);
		}

		/*
		 * Р—Р°РґР°С‡Р° 8: Заданное число N является степенью числа а (показатель
		 * степени может находиться в диапазоне от 0 до 4).
		 */

		int a = (int) (Math.random() * 20 + 1);
		N = (int) (Math.random() * 100 + 1);

		System.out.print("8.	a = " + a + "; N = " + N + " : ");

		if (N == Math.pow(a, 0) || N == Math.pow(a, 1) || N == Math.pow(a, 2) || N == Math.pow(a, 3)
				|| N == Math.pow(a, 4)) {
			System.out.println(b);
		} else {
			System.out.println(!b);
		}

		/*
		 * Задача 9: График функции у = ах2 + bх+ с проходит через заданную точку с
		 * координатами (m, п).
		 */

		int a1 = 2;
		int b1 = -6;
		int c1 = 0;

		m = 3;
		n = 0;

		System.out.print("9.	(m,n) = " + "(" + m + "," + n + ") : ");

		if (a1 * m * m + b1 * m + c1 == n) {
			System.out.println(b);
		} else {
			System.out.println(!b);
		}

	}

	public static void task38() {

		/*
		 * 38. Для данных областей составить линейную программу, которая печатает true,
		 * если точка с координатами (х, у) принадлежит закрашенной области, и false — в
		 * противном случае
		 */

		int x = (int) (Math.random() * 10 - 5);
		int y = (int) (Math.random() * 10 - 5);

		System.out.println("(x,y) = " + "(" + x + "," + y + ") : ");

		// Рисунок а:

		if (x >= 0 & x <= 4 & y >= 0 & y <= 4 - x) {
			System.out.println("a) " + true);
		} else if (x <= 0 & x >= -4 & y >= 0 & y <= 4 + x) {
			System.out.println("a) " + true);
		} else {
			System.out.println("a) " + false);
		}

		// Рисунок б:

		if (x >= -2 & x <= 2 & y <= 4 & y >= 0) {
			System.out.println("b) " + true);
		} else if (x >= -4 & x <= 4 & y <= 0 & y >= -3) {
			System.out.println("b) " + true);
		} else {
			System.out.println("b) " + false);
		}

		// Рисунок с:

		if (x >= 0 & y >= 0 & x * x + y * y <= 16) {
			System.out.println("c) " + true);
		} else if (x >= 0 & y <= 0 & x * x + y * y <= 25) {
			System.out.println("c) " + true);
		} else {
			System.out.println("c) " + false);
		}

	}

	public static void task39() {

		/*
		 * 39. Дано действительное число х. Не пользуясь никакими другими
		 * арифметическими операциями, кроме умножения, сложения и вычитания, вычислите
		 * за минимальное число операций: 2x4 - 3х3 + 4х2 - 5х + 6.
		 */

		double x = (Math.random() * 10 + 1);
		double y = 2 * Math.pow(x, 4) - 3 * Math.pow(x, 3) + 4 * Math.pow(x, 2) - 5 * x + 6;

		System.out.println(x);
		System.out.println("y = 2x4 - 3С…3 + 4С…2 - 5С… + 6 = " + y);

	}

	public static void task40() {
		/*
		 * 40. Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3 .
		 * Позаботьтесь об экономии операций.
		 */

		int x = 5;
		double y1;
		double y2;

		y1 = (-2) * x + 3 * Math.pow(x, 2) - 4 * Math.pow(x, 3);
		y2 = 1 + 2 * x + 3 * Math.pow(x, 2) + 4 * Math.pow(x, 3);

		System.out.println("y1 = " + y1);
		System.out.println("y2 = " + y2);

	}

}