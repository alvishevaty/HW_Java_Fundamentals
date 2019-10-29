package by.home.les02.task;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

		// task01();
		// task02();
		// task03();
		// task04();
		// task05();
		// task06();
		// task07();
		// task08();
		// task09();
		// task10();
		// task11();
		// task12();
		// task13() Задача на составление алгоритма
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
		task40();

	}

	public static void task01() {

		/*
		 * 1. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести
		 * на экран цифру 7, в противном случае – цифру 8.
		 */

		int a = 1;
		int b = 2;

		if (a < b) {
			System.out.println(7);

		} else {
			System.out.println(8);
		}

	}

	public static void task02() {

		/*
		 * 2. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести
		 * на экран слово «yes», в противном случае – слово «no»
		 */

		int a = 1;
		int b = 2;

		if (a < b) {
			System.out.println("yes");

		} else {
			System.out.println("no");
		}

	}

	public static void task03() {

		/*
		 * 3. Составить программу сравнения введенного числа а и цифры 3. Вывести на
		 * экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Введите число: ");

		int a = scan.nextInt();
		int b = 3;

		if (a < b) {
			System.out.println("yes");

		} else {
			System.out.println("no");
		}

	}

	public static void task04() {

		/*
		 * 4. Составить программу: равны ли два числа а и b?
		 */

		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);

		if (a == b) {
			System.out.println("Numders a and b are equel");

		} else {
			System.out.println("Numbers a and b are different");
		}

	}

	public static void task05() {

		/*
		 * 5. Составить программу: определения наименьшего из двух чисел а и b.
		 */

		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		if (a < b) {
			System.out.println("Наименьшим числом является a");

		} else {
			System.out.println("Наименьшим числом является b");
		}
	}

	public static void task06() {

		/*
		 * 6. Составить программу: определения наибольшего из двух чисел а и b.
		 */

		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		if (a > b) {
			System.out.println("Наибольшим числом является a");

		} else {
			System.out.println("Наибольшим числом является b");
		}

	}

	public static void task07() {

		/*
		 * 7. Составить программу нахождения модуля выражения a*x*x + b*x + c при
		 * заданных значениях a, b, c и х
		 */

		double a = -2.4;
		double b = 1.0;
		double c = -7.7;
		double x = 5.3;
		double z;

		z = Math.abs(a * x * x + b * x + c);

		System.out.println("z = " + z);

	}

	public static void task08() {

		/*
		 * 8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.
		 */

		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		int a2 = (int) Math.pow(a, 2);
		int b2 = (int) Math.pow(b, 2);

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a в квадрате = " + a2);
		System.out.println("b в квадрате = " + b2);

		if (a2 < b2) {
			System.out.println("Квадрат числа a меньше");

		} else {
			System.out.println("Квадрат числа b меньше");
		}
	}

	public static void task09() {

		/*
		 * 9. Составить программу, которая определит по трем введенным сторонам,
		 * является ли данный треугольник равносторонним.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Введите значение стороны a: ");

		int a = scan.nextInt();

		System.out.print("Введите значение стороны b: ");

		int b = scan.nextInt();

		System.out.print("Введите значение стороны c: ");

		int c = scan.nextInt();

		if (a == b && a == c && b == c) {
			System.out.println("Треугольник АВС - равносторонний");

		} else {
			System.out.println("Треугольник АВС - НЕ равносторонний");
		}

	}

	public static void task10() {

		/*
		 * 10. Составить программу, которая определит площадь какого круга меньше.
		 */

		double R1 = (Math.random() * 10);
		double R2 = (Math.random() * 10);
		double s1;
		double s2;

		s1 = Math.PI * Math.pow(R1, 2);
		s2 = Math.PI * Math.pow(R2, 2);

		System.out.println("R1 = " + R1);
		System.out.println("R2 = " + R2);
		System.out.println("s1 = pi*R1*R1 = " + s1);
		System.out.println("s2 = pi*R2*R2 = " + s2);

		if (s1 < s2) {
			System.out.println("Площадь круга s1 - меньше");

		} else if (s1 > s2) {
			System.out.println("Площадь круга s2 - меньше");

		} else {
			System.out.println("Площади равны");
		}

	}

	public static void task11() {

		/*
		 * 11. Составить программу, которая определит площадь какого треугольника
		 * больше.
		 */

		double h1 = (Math.random() * 10);
		double a1 = (Math.random() * 10);
		double h2 = (Math.random() * 10);
		double a2 = (Math.random() * 10);
		double h3 = (Math.random() * 10);
		double a3 = (Math.random() * 10);

		double s1 = h1 * a1 / 2;
		double s2 = h2 * a2 / 2;
		double s3 = h3 * a3 / 2;

		System.out.println("Высота h1 и сторона a1 равны: " + h1 + ", " + a1);
		System.out.println("Высота h2 и сторона a2 равны: " + h2 + ", " + a2);
		System.out.println("Высота h3 и сторона a3 равны: " + h3 + ", " + a3);

		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);

		if (s1 > s2) {
			if (s1 > s3) {
				System.out.println("Площадь треугольника 1 больше");

			} else {
				System.out.println("Площадь треугольника 3 больше");
			}

		} else if (s1 < s2) {
			if (s2 > s3) {
				System.out.println("Площадь треугольника 2 больше");

			} else {
				System.out.println("Площадь треугольника 3 больше");
			}

		} else if (s1 == s2) {
			if (s1 == s3) {
				System.out.println("Площади треугольников равны");
			}

		}

	}

	public static void task12() {

		/*
		 * 12. Даны три действительных числа. Возвести в квадрат те из них, значения
		 * которых неотрицательны, и в четвертую степень — отрицательные.
		 */

		double a = (Math.random() * 100 - 50);
		double b = (Math.random() * 100 - 50);
		double c = (Math.random() * 100 - 50);

		if (a < 0) {
			a = Math.pow(a, 4);

		} else if (a >= 0) {
			a = Math.pow(a, 2);
		}

		if (b < 0) {
			b = Math.pow(b, 4);

		} else if (b >= 0) {
			b = Math.pow(b, 2);
		}

		if (c < 0) {
			a = Math.pow(c, 4);

		} else if (c >= 0) {
			c = Math.pow(c, 2);
		}

		System.out.print("a = " + a + " : new a = ");
		System.out.println(a);

		System.out.print("b = " + b + " : new b = ");
		System.out.println(b);

		System.out.print("c = " + c + " : new c = ");
		System.out.println(c);

	}

	public static void task13() {

		/*
		 * 13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
		 * которая из точек находится ближе к началу координат. 
		 * 1. Объявить переменные x1,y1,x2,y2 и присвоить им значения. 
		 * 2. Найти расстояние между точкой и началом координат как s = Math.sqrt(x * x + y * y); 
		 * 3. Используя оператор if, сравнить два полученных расстояния. 
		 * 4. Выдать ответ
		 */

	}

	public static void task14() {

		/*
		 * 14. Даны два угла треугольника (в градусах). Определить, существует ли такой
		 * треугольник, и если да, то будет ли он прямоугольным.
		 */

		int a1 = (int) (Math.random() * 90);
		int a2 = (int) (Math.random() * 90);

		System.out.println("Заданные углы: a1 = " + a1 + ", a2 = " + a2);

		if (a1 + a2 < 180) {
			System.out.print("Треугольник существует");

			if (a1 + a2 == 90) {
				System.out.println(" и является прямоугольным");

			} else {
				System.out.println(" и НЕ является прямоугольным");
			}

		} else if (a1 == 0 || a2 == 0) {
			System.out.println("Треугольник не существует");

		} else {
			System.out.println("Треугольник не существует");
		}

	}

	public static void task15() {

		/*
		 * 15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих
		 * двух чисел заменить половиной их суммы, а большее — их удвоенным
		 * произведением.
		 */

		float a = (float) Math.random() * 10;
		float b = (float) Math.random() * 10;

		while (a == b) {
			a = (float) Math.random() * 10;
		}

		float a1 = 0;
		float b1 = 0;

		System.out.println("a = " + a + "; b = " + b);

		if (a < b) {
			a1 = (a + b) / 2;
			b1 = a * b * 2;
		} else if (a > b) {
			a1 = a * b * 2;
			b1 = (a + b) / 2;
		}

		System.out.println("a = " + a1 + "; b = " + b1);

	}

	public static void task16() {

		/*
		 * 16. На плоскости ХОY задана своими координатами точка А. Указать, где она
		 * расположена (на какой оси или в каком координатном угле).
		 */

		int x = (int) (Math.random() * 20 - 10);
		int y = (int) (Math.random() * 20 - 10);

		System.out.println("Точка А с координатами (" + x + "," + y + ")");

		if (x == 0 & y == 0) {
			System.out.print("Точка А с координатами (" + x + "," + y + ") находится в нуле");

		} else if (x > 0 & y > 0) {
			System.out.print("Точка А с координатами (" + x + "," + y + ") находится в I четверти");

		} else if (x < 0 & y > 0) {
			System.out.print("Точка А с координатами (" + x + "," + y + ") находится в II четверти");

		} else if (x < 0 & y < 0) {
			System.out.print("Точка А с координатами (" + x + "," + y + ") находится в III четверти");

		} else if (x > 0 & y < 0) {
			System.out.print("Точка А с координатами (" + x + "," + y + ") находится в IV четверти");

		} else if (x == 0) {
			System.out.println("Точка А с координатами (" + x + "," + y + ") и лежит на оси y");

		} else if (y == 0) {
			System.out.println("Точка А с координатами (" + x + "," + y + ") и лежит на оси x");

		}

	}

	public static void task17() {

		/*
		 * 17. Даны целые числа т, п. Если числа не равны, то заменить каждое из них
		 * одним и тем же числом, равным большему из исходных, а если равны, то заменить
		 * числа нулями.
		 */

		int m = (int) (Math.random() * 10 + 1);
		int n = (int) (Math.random() * 10 + 1);

		System.out.println(" m = " + m + "; n = " + n);

		if (m != n) {
			if (m > n) {
				n = m;

			} else if (n > m) {
				m = n;
			}

		} else {
			n = 0;
			m = n;
		}

		System.out.println(" m = " + m + "; n = " + n);

	}

	public static void task18() {

		/*
		 * 18. Подсчитать количество отрицательных среди чисел а, b, с.
		 */

		int a = (int) (Math.random() * 100 - 50);
		int b = (int) (Math.random() * 100 - 50);
		int c = (int) (Math.random() * 100 - 50);

		System.out.println("a = " + a + ", b = " + b + "; c = " + c);

		int i = 0;

		if (a < 0) {
			i++;
		}

		if (b < 0) {
			i++;
		}

		if (c < 0) {
			i++;
		}

		if (i == 0) {
			System.out.println("Отрицательных чисел нет");

		} else {
			System.out.println("Количество отрицательных чисел: " + i);
		}

	}

	public static void task19() {

		/*
		 * 19. Подсчитать количество положительных среди чисел а, b, с.
		 */

		int a = (int) (Math.random() * 100 - 50);
		int b = (int) (Math.random() * 100 - 50);
		int c = (int) (Math.random() * 100 - 50);

		System.out.println("a = " + a + ", b = " + b + "; c = " + c);

		int i = 0;

		if (a > 0) {
			i++;
		}

		if (b > 0) {
			i++;
		}

		if (c > 0) {
			i++;
		}

		if (i == 0) {
			System.out.println("Положительных чисел нет");

		} else {
			System.out.println("Количество положительных чисел: " + i);
		}

	}

	public static void task20() {

		/*
		 * 20. Определить, делителем каких чисел а, b, с является число k.
		 */

		int a = (int) (Math.random() * 100 + 1);
		int b = (int) (Math.random() * 100 + 1);
		int c = (int) (Math.random() * 100 + 1);
		int k = (int) (Math.random() * 10 + 1);

		System.out.println("a = " + a + ", b = " + b + "; c = " + c + "; k = " + k);

		if (a % k == 0 & b % k == 0 & c % k == 0) {
			System.out.println("Число k является делителем всех чисел.");

		} else if (a % k == 0 & b % k != 0 & c % k != 0) {
			System.out.println("Число k является делителем числа а.");

		} else if (a % k != 0 & b % k == 0 & c % k != 0) {
			System.out.println("Число k является делителем числа b.");

		} else if (a % k != 0 & b % k != 0 & c % k == 0) {
			System.out.println("Число k является делителем числа с.");

		} else if (a % k == 0 & b % k == 0 & c % k != 0) {
			System.out.println("Число k является делителем чисел a и b.");

		} else if (a % k == 0 & b % k != 0 & c % k == 0) {
			System.out.println("Число k является делителем чисел a и с.");

		} else if (a % k != 0 & b % k == 0 & c % k == 0) {
			System.out.println("Число k является делителем чисел b и c.");

		} else if (a % k != 0 & b % k != 0 & c % k != 0) {
			System.out.println("Число k НЕ является делителем заданных чисел.");
		}

	}

	public static void task21() {

		/*
		 * 21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или
		 * девочка? Введи Д или М». В зависимости от ответа на экране должен появиться
		 * текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Кто ты: мальчик или девочка? Введи Д или М");

		String s = sc.next();

		if (s.equals("Д")) {
			System.out.println("Мне нравятся девочки!");

		} else if (s.equals("М")) {
			System.out.println("Мне нравятся мальчики!");
		}

	}

	public static void task22() {

		/*
		 * 22. Перераспределить значения переменных х и у так, чтобы в х оказалось
		 * большее из этих значений, а в y - меньшее.
		 */

		int x = (int) (Math.random() * 100 + 1);
		int y = (int) (Math.random() * 100 + 1);

		while (x == y) {
			x = (int) (Math.random() * 100 + 1);
		}

		System.out.println("x = " + x + ", y = " + y);

		if (x < y) {
			int min = x;
			int max = y;
			y = x;
			x = max;
			y = min;
		}

		System.out.println("x = " + x + ", y = " + y);
	}

	public static void task23() {

		/*
		 * 23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31,
		 * месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите число: ");

		int d = sc.nextInt();

		System.out.print("Введите месяц:");

		int m = sc.nextInt();

		if (d < 1 || d > 31 || m < 1 || m > 12) {
			System.out.println("Введены некорректные данные");

		} else {
			System.out.println("Введено: " + d + "." + m);
		}

	}

	public static void task24() {

		/*
		 * 24. Составить программу, определяющую результат гадания на ромашке —
		 * «любит—не любит»,взяв за исходное данное количество лепестков п.
		 */

		int n = (int) (Math.random() * 100 + 1);

		System.out.println("Количество лепестков = " + n);

		if (n % 2 == 0) {
			System.out.println("Результат: не любит :(");

		} else {
			System.out.println("Результат: любит :)");
		}

	}

	public static void task25() {

		/*
		 * 25. Написать программу — модель анализа пожарного датчика в помещении,
		 * которая выводит сообщение «Пожароопасная ситуация », если температура в
		 * комнате превысила 60° С.
		 */

		int n = (int) (Math.random() * 100 + 1);

		System.out.println("Температура в комнате = " + n);

		if (n > 60) {
			System.out.println("Пожароопасная ситуация!!!");

		} else {
			System.out.println("Температура в норме");
		}

	}

	public static void task26() {

		/*
		 * 26. Написать программу нахождения суммы большего и меньшего из трех чисел.
		 */

		int a = (int) (Math.random() * 100 + 1);
		int b = (int) (Math.random() * 100 + 1);
		int c = (int) (Math.random() * 100 + 1);

		System.out.println("a = " + a + ", b = " + b + "; c = " + c);

		int min = 0;
		int max = 0;

		if (a >= b) {
			if (a >= c && c >= b) {
				max = a;
				min = b;

			} else if (a >= c && c <= b) {
				max = a;
				min = c;

			} else if (a <= c) {
				max = c;
				min = b;
			}

		} else if (a <= b) {
			if (a <= c && c >= b) {
				max = c;
				min = a;

			} else if (a <= c && c <= b) {
				max = b;
				min = a;

			} else if (a >= c) {
				max = b;
				min = c;
			}
		}

		System.out.println("max = " + max + ", min = " + min);
		System.out.println("Сумма большего и меньшего = " + (max + min));

	}

	public static void task27() {

		/*
		 * 27. Найти max{min(a, b), min(c, d)}.
		 */

		int a = (int) (Math.random() * 100 + 1);
		int b = (int) (Math.random() * 100 + 1);
		int c = (int) (Math.random() * 100 + 1);
		int d = (int) (Math.random() * 100 + 1);

		int min1 = 0;
		int min2 = 0;
		int max = 0;

		System.out.println("a = " + a + ", b = " + b + "; c = " + c + "; d = " + d);

		if (a <= b) {
			min1 = a;

		} else {
			min1 = b;
		}

		System.out.println("min1 = " + min1);

		if (c <= d) {
			min2 = c;

		} else {
			min2 = d;
		}

		System.out.println("min2 = " + min2);

		if (min1 >= min2) {
			max = min1;

		} else {
			max = min2;
		}

		System.out.println("max = " + max);

	}

	public static void task28() {

		/*
		 * 28. Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не
		 * равно d, то найти max(d — a, d — b, d —c).
		 */

		int a = (int) (Math.random() * 100 + 1);
		int b = (int) (Math.random() * 100 + 1);
		int c = (int) (Math.random() * 100 + 1);
		int d = (int) (Math.random() * 100 + 1);

		int max = 0;

		System.out.println("a = " + a + ", b = " + b + "; c = " + c + "; d = " + d);

		if (a == d & b == d & c == d) {
			System.out.println("Все числа = d");

		} else if (a == d & b == d & c != d) {
			System.out.println("a and b = d");

		} else if (a == d & b != d & c == d) {
			System.out.println("a and c = d");

		} else if (a != d & b == d & c == d) {
			System.out.println("b and c = d");

		} else if (a == d & b != d & c != d) {
			System.out.println("a = d");

		} else if (a != d & b == d & c != d) {
			System.out.println("b = d");

		} else if (a != d & b != d & c == d) {
			System.out.println("c = d");

		} else if (a != d & b != d & c != d) {
			if (d - a > d - b) {
				if (d - a > d - c) {
					max = d - a;

				} else {
					max = d - c;
				}

			} else if (d - a < d - b) {
				if (d - b > d - c) {
					max = d - b;

				} else {
					max = d - c;
				}
			}

			System.out.println("max = " + max);

		}

	}

	public static void task29() {

		/*
		 * 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
		 * расположены на одной прямой.
		 */

		int x1 = 2;// (int)(Math.random() * 20 - 10);
		int y1 = 2;// (int)(Math.random() * 20 - 10);
		int x2 = 0;// (int)(Math.random() * 20 - 10);
		int y2 = 4;// (int)(Math.random() * 20 - 10);
		int x3 = 6;// (int)(Math.random() * 20 - 10);
		int y3 = -2;// (int)(Math.random() * 20 - 10);

		System.out.println("A(" + x1 + "," + y1 + ");");
		System.out.println("B(" + x2 + "," + y2 + ");");
		System.out.println("C(" + x3 + "," + y3 + ")");

		if ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0) {
			System.out.println("Точки расположены на одной прямой");

		} else {
			System.out.println("Точки НЕ расположены на одной прямой");
		}

	}

	public static void task30() {

		/*
		 * 30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и
		 * заменить их абсолютными значениями, если это не так.
		 */

		double a = Math.random() * 20;
		double b = Math.random() * 20;
		double c = Math.random() * 20;

		System.out.println("a = " + a + ", b = " + b + "; c = " + c);

		if (a > b & b > c) {
			a = 2 * a;
			b = 2 * b;
			c = 2 * c;
			System.out.println("a = " + a + ", b = " + b + "; c = " + c);

		} else {
			int a1 = (int) a;
			int b1 = (int) b;
			int c1 = (int) c;
			System.out.println("a = " + a1 + ", b = " + b1 + "; c = " + c1);
		}

	}

	public static void task31() {

		/*
		 * 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
		 * Определить, пройдет ли кирпич через отверстие.
		 */

		int A = (int) (Math.random() * 20); // длина отверстия
		int B = (int) (Math.random() * 20); // ширина отверстия
		int x = (int) (Math.random() * 20); // длина кирпича
		int y = (int) (Math.random() * 20); // ширина кирпича
		int z = (int) (Math.random() * 20); // высота кирпича

		System.out.println("Размеры отверстия: длина " + A + ", ширина " + B);
		System.out.println("Размеры кирпича: длина " + x + ", ширина " + y + ", высота " + z);

		if ((x <= A & z <= B) || (y <= A & z <= B) || (y <= B & z <= A) || (x <= B & z <= A) || (x <= A & y <= B)
				|| (x <= B & y <= A)) {
			System.out.println("Кирпич пройдет в отверстие");

		} else {
			System.out.println("Кирпич не пройдет");
		}

	}

	public static void task32() {

		/*
		 * 32. Написать программу, которая по заданным трем числам определяет, является
		 * ли сумма каких-либо двух из них положительной.
		 */

		int a = (int) (Math.random() * 20 - 10);
		int b = (int) (Math.random() * 20 - 10);
		int c = (int) (Math.random() * 20 - 10);

		System.out.println("a = " + a + ", b = " + b + "; c = " + c);

		if (a + b >= 0) {
			System.out.println("Сумма чисел a и b положительная");
		}

		if (a + c >= 0) {
			System.out.println("Сумма чисел a и c положительная");
		}

		if (b + c >= 0) {
			System.out.println("Сумма чисел b и c положительная");
		}

	}

	public static void task33() {

		/*
		 * 33. Написать программу, которая по паролю будет определять уровень доступа
		 * сотрудника к секретной информации в базе данных.Доступ к базе имеют только
		 * шесть человек, разбитых на три группы по степени доступа. Они имеют следующие
		 * пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны
		 * модули баз В, С; 9455, 8997 — доступен модуль базы С.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите число: ");

		while (sc.hasNextInt() == false) {
			String s = sc.next();
			System.out.print("Введите число: ");
		}

		int x = sc.nextInt();

		if (x == 9583 || x == 1747) {
			System.out.println("Доступны модули баз А, B, C");

		} else if (x == 3331 || x == 7922) {
			System.out.println("Доступны модули баз B, C");

		} else if (x == 9455 || x == 8997) {
			System.out.println("Доступны модули баз C");

		} else {
			System.out.println("Введен неверный пароль.");
		}
	}

	public static void task34() {

		/*
		 * 34. Составить программу, реализующую эпизод применения компьютера в книжном
		 * магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную
		 * покупателем; если сдачи не требуется, печатает на экране «спасибо»; если
		 * денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и
		 * указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом
		 * и указывает размер недостающей суммы.
		 */

		int a = (int) (Math.random() * 100 + 1); // стоимость книги
		int b = (int) (Math.random() * 100 + 1); // внесено покупателем

		System.out.println("Стоимость книги: " + a + " руб.");
		System.out.println("Внесено покупателем: " + b + " руб.");

		if (a == b) {
			System.out.println("Спасибо за покупку");

		} else if (a < b) {
			System.out.println("Возьмите сдачу: " + (b - a) + " руб.");

		} else if (a > b) {
			System.out.println("Осталось внести " + (a - b) + " руб.");

		}
	}

	public static void task35() {

		/*
		 * 35. Вычислить число и месяц в невисокосном году по номеру дня.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите число: ");

		while (sc.hasNextInt() == false) {
			String s = sc.next();
			System.out.print("Введите число: ");
		}

		int n = sc.nextInt();
		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int sum = 0;
		int i = 0;

		for (; sum <= n; i++) {
			sum = sum + month[i];
		}

		int d = sum - n;
		int day = month[i - 1] - d;

		System.out.println("Число и месяц введенного дня " + day + "." + i);

	}

	public static void task36() {

		/*
		 * 36. Вычислить значение функции:
		 */

		int x = (int) (Math.random() * 10);
		double y;

		System.out.println("x = " + x);

		if (x <= 3) {
			y = Math.pow(x, 2) - 3 * x + 9;
			System.out.println("y = " + y);

		} else {
			y = 1 / (Math.pow(x, 3) + 6);
			System.out.println("y = " + y);

		}

	}

	public static void task37() {

		/*
		 * 37. Вычислить значение функции:
		 */

		int x = (int) (Math.random() * 10);
		double y;

		System.out.println("x = " + x);

		if (x >= 3) {
			y = (-Math.pow(x, 2)) + 3 * x + 9;
			System.out.println("y = " + y);

		} else {
			y = 1 / (Math.pow(x, 3) - 6);
			System.out.println("y = " + y);

		}

	}

	public static void task38() {

		/*
		 * 38. Вычислить значение функции:
		 */

		int x = (int) (Math.random() * 20 - 10);
		int y;

		System.out.println("x = " + x);

		if (x >= 0 & x <= 3) {
			y = (int) Math.pow(x, 2);
			System.out.println("y = " + y);

		} else if (x > 3 || x < 0) {
			y = 4;
			System.out.println("y = " + y);

		}

	}

	public static void task39() {

		/*
		 * 39. Вычислить значение функции:
		 */

		int x = (int) (Math.random() * 10);
		double y;

		System.out.println("x = " + x);

		if (x >= 8) {
			y = (-Math.pow(x, 2)) + x - 9;
			System.out.println("y = " + y);

		} else {
			y = 1 / (Math.pow(x, 4) - 6);
			System.out.println("y = " + y);

		}

	}

	public static void task40() {

		/*
		 * 40. Вычислить значение функции:
		 */

		int x = (int) (Math.random() * 20);
		double y;

		System.out.println("x = " + x);

		if (x <= 13) {
			y = (-Math.pow(x, 3)) + 9;
			System.out.println("y = " + y);

		} else {
			y = -3 / (x + 1);
			System.out.println("y = " + y);
		}

	}

}