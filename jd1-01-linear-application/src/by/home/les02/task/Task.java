package by.home.les02.task;

public class Task {

	public static void main(String[] args) {
		//task01();
		//task02();
		//task03();
		//task04();
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
		//task30();
		//task31();
		//task32();
		//task33();
		//task34();
		//task35();
		//task36();
		//task37();
		//task38();
		//task39();
		task40();
	}
	
	public static void task01() {
		/*
		 * 1. Р”Р°РЅС‹ РґРІР° РґРµР№СЃС‚РІРёС‚РµР»СЊРЅС‹С… С‡РёСЃР»Р° С… Рё Сѓ. 
		 * Р’С‹С‡РёСЃР»РёС‚СЊ РёС… СЃСѓРјРјСѓ, СЂР°Р·РЅРѕСЃС‚СЊ, РїСЂРѕРёР·РІРµРґРµРЅРёРµ Рё С‡Р°СЃС‚РЅРѕРµ.
		 */
		double x = Math.random();
		double y = Math.random();
		System.out.println("x =" + x + "; y = " + y);
		System.out.println("x + y = "+ (x + y));
		System.out.println("x - y = "+ (x - y));
		System.out.println("x * y = "+ (x * y));
		System.out.println("x / y = "+ (x / y));
	}
	
	public static void task02() {
		
		//2. РќР°Р№РґРёС‚Рµ Р·РЅР°С‡РµРЅРёРµ С„СѓРЅРєС†РёРё: СЃ = 3 + Р°.
		
		double a = Math.random();
		double c = (3 + a);
		System.out.println("a = " + a);
		System.out.println("c = " + c);  
	}
	
	public static void task03() {
		
		//3. РќР°Р№РґРёС‚Рµ Р·РЅР°С‡РµРЅРёРµ С„СѓРЅРєС†РёРё: z = 2 * x + ( y вЂ“ 2 ) * 5.
		
		double z;
		int x = (int)(Math.random()*10);
		int y = (int)(Math.random()*10);
		z = (2 * x + (y - 2) * 5);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}
	
	public static void task04() {
		
		//4. РќР°Р№РґРёС‚Рµ Р·РЅР°С‡РµРЅРёРµ С„СѓРЅРєС†РёРё: z = ( (a вЂ“ 3 ) * b / 2) + c.
		
		double z;
		double a = (Math.random()*10);
		double b = (Math.random()*10);
		double c = (Math.random()*10);
		z = (((a - 3) * b / 2) + c);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("z = " + z);
	}
	
	public static void task05() {
		 /*5. РЎРѕСЃС‚Р°РІРёС‚СЊ Р°Р»РіРѕСЂРёС‚Рј РЅР°С…РѕР¶РґРµРЅРёСЏ СЃСЂРµРґРЅРµРіРѕ Р°СЂРёС„РјРµС‚РёС‡РµСЃРєРѕРіРѕ РґРІСѓС… С‡РёСЃРµР»
		  * 1) РћР±СЉСЏРІР»РµРЅРёРµ РґРІСѓС… РїРµСЂРµРјРµРЅРЅС‹С… С†РµР»РѕС‡РёСЃР»РµРЅРЅРѕРіРѕ С‚РёРїР° Рё РїСЂРёСЃРІР°РёРІР°РЅРёРµ РёРј Р·РЅР°С‡РµРЅРёСЏ.
		  * 2) РќР°С…РѕР¶РґРµРЅРёРµ СЃСѓРјРјС‹ РґРІСѓС… С‡РёСЃРµР».
		  * 3) Р”РµР»РµРЅРёРµ СЃСѓРјРјС‹ С‡РёСЃРµР» РЅР° РёС… РєРѕР»РёС‡РµСЃС‚РІРѕ (РЅР° 2).
		  * 4) Р’С‹РІРѕРґ Р·РЅР°С‡РµРЅРёСЏ.
		  */
	}
	
	public static void task06() {
		/*6. РќР°РїРёСЃР°С‚СЊ РєРѕРґ РґР»СЏ СЂРµС€РµРЅРёСЏ Р·Р°РґР°С‡Рё. Р’ n РјР°Р»С‹С… Р±РёРґРѕРЅР°С… 80 Р» РјРѕР»РѕРєР°. РЎРєРѕР»СЊРєРѕ Р»РёС‚СЂРѕРІ 
		 * РјРѕР»РѕРєР° РІ m Р±РѕР»СЊС€РёС… Р±РёРґРѕРЅР°С…, РµСЃР»Рё РІ РєР°Р¶РґРѕРј Р±РѕР»СЊС€РѕРј Р±РёРґРѕРЅРµ РЅР° 12 Р». Р±РѕР»СЊС€Рµ, С‡РµРј РІ 
		 * РјР°Р»РѕРј?
		 */
		
		int n = (int)(Math.random()*10);
		int x;
		int m = (int)(Math.random()*10);
		int m1;
		int k = (80 / n);
		System.out.println("Р›РёС‚СЂРѕРІ РІ 1 РјР°Р»РѕРј Р±РёРґРѕРЅРµ: " + k);
		m1 = (k + 12);
		System.out.println("Р›РёС‚СЂРѕРІ РІ 1 Р±РѕР»СЊС€РѕРј Р±РёРґРѕРЅРµ: " + m1);
		x = m1 * m;
		System.out.println("Р’СЃРµРіРѕ Р»РёС‚СЂРѕРІ РІ Р±РѕР»СЊС€РёС… Р±РёРґРѕРЅР°С…: " + x);
	}
	
	public static void task07() {
		//7. Р”Р°РЅ РїСЂСЏРјРѕСѓРіРѕР»СЊРЅРёРє, С€РёСЂРёРЅР° РєРѕС‚РѕСЂРѕРіРѕ РІ РґРІР° СЂР°Р·Р° РјРµРЅСЊС€Рµ РґР»РёРЅС‹. РќР°Р№С‚Рё РїР»РѕС‰Р°РґСЊ 
		//	РїСЂСЏРјРѕСѓРіРѕР»СЊРЅРёРєР°
		
		int a = (int)(Math.random()*100);
		int b = a / 2;
		int s = a * b;
		System.out.println("РЎС‚РѕСЂРѕРЅР° РїСЂСЏРјРѕСѓРіРѕР»СЊРЅРёРєР° a = " + a);
		System.out.println("РЎС‚РѕСЂРѕРЅР° РїСЂСЏРјРѕСѓРіРѕР»СЊРЅРёРєР° b = " + b);
		System.out.println("РџР»РѕС‰Р°РґСЊ РїСЂСЏРјРѕСѓРіРѕР»СЊРЅРёРєР° = " + s);
	}
	
	public static void task08() {
		
		//8. Р’С‹С‡РёСЃР»РёС‚СЊ Р·РЅР°С‡РµРЅРёРµ РІС‹СЂР°Р¶РµРЅРёСЏ РїРѕ С„РѕСЂРјСѓР»Рµ 
		//(РІСЃРµ РїРµСЂРµРјРµРЅРЅС‹Рµ РїСЂРёРЅРёРјР°СЋС‚ РґРµР№СЃС‚РІРёС‚РµР»СЊРЅС‹Рµ Р·РЅР°С‡РµРЅРёСЏ): рќ‘Џ+в€љрќ‘Џ2+4рќ‘Ћрќ‘ђ2рќ‘Ћв€’рќ‘Ћ3рќ‘ђ+рќ‘Џв€’2
		 
		double a = (Math.random()*100 + 1);
		double b = (Math.random()*100 + 1);
		double c = (Math.random()*100 + 1);
		double z;
		
		z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - (Math.pow(a,3) * c + Math.pow(b, -2));
		System.out.println("z = " + z);
	}
	
	public static void task09() {
		
		//9. Р’С‹С‡РёСЃР»РёС‚СЊ Р·РЅР°С‡РµРЅРёРµ РІС‹СЂР°Р¶РµРЅРёСЏ РїРѕ С„РѕСЂРјСѓР»Рµ (РІСЃРµ РїРµСЂРµРјРµРЅРЅС‹Рµ РїСЂРёРЅРёРјР°СЋС‚ РґРµР№СЃС‚РІРёС‚РµР»СЊРЅС‹Рµ Р·РЅР°С‡РµРЅРёСЏ):
		//  рќ‘Ћрќ‘ђв€—рќ‘Џрќ‘‘в€’рќ‘Ћрќ‘Џв€’рќ‘ђ
		 
		double a = (Math.random()*100 + 1);
		double b = (Math.random()*100 + 1);
		double c = (Math.random()*100 + 1);
		double d = (Math.random()*100 + 1);
		double z;
		
		z = ((a / c) * (b / d)) - ((a * b - c) / (c * d));
		System.out.println("z = " + z);
	}
	
	public static void task10() {
		
		//10. Р’С‹С‡РёСЃР»РёС‚СЊ Р·РЅР°С‡РµРЅРёРµ РІС‹СЂР°Р¶РµРЅРёСЏ РїРѕ С„РѕСЂРјСѓР»Рµ (РІСЃРµ РїРµСЂРµРјРµРЅРЅС‹Рµ РїСЂРёРЅРёРјР°СЋС‚ РґРµР№СЃС‚РІРёС‚РµР»СЊРЅС‹Рµ Р·РЅР°С‡РµРЅРёСЏ): 
		// рќ‘ рќ‘–рќ‘›рќ‘Ґ+рќ‘ђрќ‘њрќ‘ рќ‘¦рќ‘ђрќ‘њрќ‘ рќ‘Ґв€’рќ‘ рќ‘–рќ‘›рќ‘¦в€—рќ‘Ўрќ‘” рќ‘Ґрќ‘¦
		 
		double x = (Math.random()*100 + 1);
		double y = (Math.random()*100 + 1);
		double z;
		
		z = ((Math.sin(x)+Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * (Math.tan(x * y));
		System.out.println("z = " + z);
	}
	
	public static void task11() {
		//11. Р’С‹С‡РёСЃР»РёС‚СЊ РїРµСЂРёРјРµС‚СЂ Рё РїР»РѕС‰Р°РґСЊ РїСЂСЏРјРѕСѓРіРѕР»СЊРЅРѕРіРѕ С‚СЂРµСѓРіРѕР»СЊРЅРёРєР° РїРѕ РґР»РёРЅР°Рј Р° Рё b РґРІСѓС… РєР°С‚РµС‚РѕРІ.
		double a = (Math.random()*100);
		double b = (Math.random()*100);
		double c = Math.sqrt(a * a + b * b);
		double p = a + b + c;
		double s = a * b / 2;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("p = a + b + c = " + p);
		System.out.println("s = a * b / 2 = " + s);
	}
	
	public static void task12() {
		//12. Р’С‹С‡РёСЃР»РёС‚СЊ СЂР°СЃСЃС‚РѕСЏРЅРёРµ РјРµР¶РґСѓ РґРІСѓРјСЏ С‚РѕС‡РєР°РјРё СЃ РґР°РЅРЅС‹РјРё РєРѕРѕСЂРґРёРЅР°С‚Р°РјРё (С…1, Сѓ1)Рё (x2, Сѓ2).
		int x1 = (int)(Math.random()*20-10);
		int y1 = (int)(Math.random()*20-10);
		int x2 = (int)(Math.random()*20-10);
		int y2 = (int)(Math.random()*20-10);
		System.out.println("(x1, y1) = (" + x1 + ", " + y1 + ")");
		System.out.println("(x2, y2) = (" + x2 + ", " + y2 + ")");
		int x = 0;
		int y = 0;
		if (x1 > 0 && x2 > 0) {
			x = Math.abs(x1 - x2);
		}
		else if (x1 <= 0 && x2 <= 0) {
			x = Math.abs(x1 - x2);
		}
		else if ((x1 >= 0 && x2 <= 0) || (x1 <= 0 && x2 >= 0)) {
			x = Math.abs(x1) + Math.abs(x2);
		}
		if (y1 >= 0 && y2 >= 0) {
			y = Math.abs(y1 - y2);
		}
		else if (y1 <= 0 && y2 <= 0) {
			y = Math.abs(y1 - y2);
		}
		else if ((y1 >= 0 && y2 <= 0) || (y1 <= 0 && y2 >= 0)) {
			y = Math.abs(y1) + Math.abs(y2);
		}
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		double s = Math.sqrt(x * x + y * y);
		System.out.println("s = " + s);
	}
	
	public static void task13() {
		//13. Р—Р°РґР°РЅС‹ РєРѕРѕСЂРґРёРЅР°С‚С‹ С‚СЂРµС… РІРµСЂС€РёРЅ С‚СЂРµСѓРіРѕР»СЊРЅРёРєР° (С…1 Сѓ2),(С…2, Сѓ2),(С…3, Сѓ3). РќР°Р№С‚Рё РµРіРѕ РїРµСЂРёРјРµС‚СЂ Рё РїР»РѕС‰Р°РґСЊ.
		
		int x1 = (int)(Math.random()*20-10);
		int y1 = (int)(Math.random()*20-10);
		int x2 = (int)(Math.random()*20-10);
		int y2 = (int)(Math.random()*20-10);
		int x3 = (int)(Math.random()*20-10);
		int y3 = (int)(Math.random()*20-10);
		
		System.out.println("(x1, y1) = (" + x1 + ", " + y1 + ")");
		System.out.println("(x2, y2) = (" + x2 + ", " + y2 + ")");
		System.out.println("(x3, y3) = (" + x3 + ", " + y3 + ")");
		
		int xa = 0;
		int ya = 0;
		int xb = 0;
		int yb = 0;
		int xc = 0;
		int yc = 0;
		
		//Р’С‹С‡РёСЃР»РµРЅРёРё РєРѕРѕСЂРґРёРЅР°С‚ СЃС‚РѕСЂРѕРЅС‹ Р°.
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
		
		//Р’С‹С‡РёСЃР»РµРЅРёРё РєРѕРѕСЂРґРёРЅР°С‚ СЃС‚РѕСЂРѕРЅС‹ b.
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
		//Р’С‹С‡РёСЃР»РµРЅРёРё РєРѕРѕСЂРґРёРЅР°С‚ СЃС‚РѕСЂРѕРЅС‹ c.
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
		
		//Р’С‹С‡РёСЃР»РµРЅРёРµ СЃС‚РѕСЂРѕРЅ С‚СЂРµСѓРіРѕР»СЊРЅРёРєР°.
		double a = Math.sqrt(xa * xa + ya * ya);
		double b = Math.sqrt(xb * xb + yb * yb);
		double c = Math.sqrt(xc * xc + yc * yc);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		//Р’С‹С‡РёСЃР»РµРЅРёРµ РїРµСЂРёРјРµС‚СЂР° Рё РїР»РѕС‰Р°РґРё С‚СЂРµСѓРіРѕР»СЊРЅРёРєР°.
		double P = a + b + c;
		double p = P / 2;
		double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		System.out.println("РџРµСЂРёРјРµС‚СЂ P = " + P);
		System.out.println("РџР»РѕС‰Р°РґСЊ S = " + S);
	}
	
	public static void task14() {
		//14. Р’С‹С‡РёСЃР»РёС‚СЊ РґР»РёРЅСѓ РѕРєСЂСѓР¶РЅРѕСЃС‚Рё Рё РїР»РѕС‰Р°РґСЊ РєСЂСѓРіР° РѕРґРЅРѕРіРѕ Рё С‚РѕРіРѕ Р¶Рµ Р·Р°РґР°РЅРЅРѕРіРѕ СЂР°РґРёСѓСЃР° R.
		int R = 15;
		double C = 2 * Math.PI * R; //РґР»РёРЅР° РѕРєСЂСѓР¶РЅРѕСЃС‚Рё
		System.out.println("Р”Р»РёРЅР° РѕРєСЂСѓР¶РЅРѕСЃС‚Рё РЎ = " + C);
		double A = Math.PI * Math.pow(R, 2); // РџР»РѕС‰Р°РґСЊ РєСЂСѓРіР°
		System.out.println("РџР»РѕС‰Р°РґСЊ РєСЂСѓРіР° Рђ = " + A);
	}
	
	public static void task15() {
		//15. РќР°РїРёСЃР°С‚СЊ РїСЂРѕРіСЂР°РјРјСѓ, РєРѕС‚РѕСЂР°СЏ РІС‹РІРѕРґРёС‚ РЅР° СЌРєСЂР°РЅ РїРµСЂРІС‹Рµ С‡РµС‚С‹СЂРµ СЃС‚РµРїРµРЅРё С‡РёСЃР»Р° ПЂ.
		int i = 1;
		while (i <= 4) {
			double pi = Math.pow(Math.PI, i);
			System.out.println("Р§РёСЃР»Рѕ РџРё РІ СЃС‚РµРїРµРЅРё " + i + " = " + pi);
			i++;
		}
	}
	
	public static void task16() {
		//16. РќР°Р№С‚Рё РїСЂРѕРёР·РІРµРґРµРЅРёРµ С†РёС„СЂ Р·Р°РґР°РЅРЅРѕРіРѕ С‡РµС‚С‹СЂРµС…Р·РЅР°С‡РЅРѕРіРѕ С‡РёСЃР»Р°.
		int n = (int)(Math.random()*9000+1000);
		System.out.println("n = " + n);
		int p = 1;
		for (;n > 0; n = n / 10) {
			int a = n % 10;
			System.out.println("a = " + a);
			p = p * a;
		}
		System.out.println("p = " + p);
	}
	
	public static void task17() {
		//17. Р”Р°РЅС‹ РґРІР° С‡РёСЃР»Р°. РќР°Р№С‚Рё СЃСЂРµРґРЅРµРµ Р°СЂРёС„РјРµС‚РёС‡РµСЃРєРѕРµ РєСѓР±РѕРІ СЌС‚РёС… С‡РёСЃРµР» Рё СЃСЂРµРґРЅРµРµ РіРµРѕРјРµС‚СЂРёС‡РµСЃРєРѕРµ РјРѕРґСѓР»РµР№ СЌС‚РёС… С‡РёСЃРµР».
		int a = (int)(Math.random() * 20 - 10);
		int b = (int)(Math.random() * 20 - 10);
		double a3 = Math.pow(a, 3);
		double b3 = Math.pow(b, 3);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		double ar = a3 * b3 / 2;
		double ge = Math.sqrt(Math.abs(a) * Math.abs(b));
		System.out.println("РЎСЂРµРґРЅРµРµ Р°СЂРёС„РјРµС‚РёС‡РµСЃРєРѕРµ РєСѓР±РѕРІ С‡РёСЃРµР» Р° Рё b: " + ar);
		System.out.println("РЎСЂРµРґРЅРµРµ РіРµРѕРјРµС‚СЂРёС‡РµСЃРєРѕРµ РјРѕРґСѓР»РµР№ С‡РёСЃРµР» Р° Рё b: " + ge);
	}
	
	public static void task18() {
		//18. Р”Р°РЅР° РґР»РёРЅР° СЂРµР±СЂР° РєСѓР±Р°. РќР°Р№С‚Рё РїР»РѕС‰Р°РґСЊ РіСЂР°РЅРё, РїР»РѕС‰Р°РґСЊ РїРѕР»РЅРѕР№ РїРѕРІРµСЂС…РЅРѕСЃС‚Рё Рё РѕР±СЉРµРј СЌС‚РѕРіРѕ РєСѓР±Р°.
		int a = 8;
		int Sg = a * a;
		int S = Sg * 6;
		double V = Math.pow(a, 3);
		System.out.println("РџР»РѕС‰Р°РґСЊ РіСЂР°РЅРё: " + Sg);
		System.out.println("РџР»РѕС‰Р°РґСЊ РїРѕР»РЅРѕР№ РїРѕРІРµСЂС…РЅРѕСЃС‚Рё: " + S);
		System.out.println("РћР±СЉРµРј РєСѓР±Р°: " + V);
	}
	
	public static void task19() {
		//19. Р”Р°РЅР° СЃС‚РѕСЂРѕРЅР° СЂР°РІРЅРѕСЃС‚РѕСЂРѕРЅРЅРµРіРѕ С‚СЂРµСѓРіРѕР»СЊРЅРёРєР°. РќР°Р№С‚Рё РїР»РѕС‰Р°РґСЊ СЌС‚РѕРіРѕ С‚СЂРµСѓРіРѕР»СЊРЅРёРєР°, РµРіРѕ РІС‹СЃРѕС‚Сѓ, СЂР°РґРёСѓСЃС‹ РІРїРёСЃР°РЅРЅРѕР№ Рё РѕРїРёСЃР°РЅРЅРѕР№ РѕРєСЂСѓР¶РЅРѕСЃС‚РµР№.
		int a = (int)(Math.random() * 20 + 1);
		System.out.println("РЎС‚РѕСЂРѕРЅР° С‚СЂРµСѓРіРѕР»СЊРЅРёРєР°: " + a);
		double h = Math.sqrt(3) * a / 2;
		System.out.println("Р’С‹СЃРѕС‚Р° С‚СЂРµСѓРіРѕР»СЊРЅРёРєР°: " + h);
		double S = a * h / 2;
		System.out.println("РџР»РѕС‰Р°РґСЊ С‚СЂРµСѓРіРѕР»СЊРЅРёРєР°: " + S);
		double r = a / (2 * Math.sqrt(3));
		System.out.println("Р Р°РґРёСѓСЃ РІРїРёСЃР°РЅРЅРѕР№ РѕРєСЂСѓР¶РЅРѕСЃС‚Рё: " + r);
		double R = a / Math.sqrt(3);
		System.out.println("Р Р°РґРёСѓСЃ РѕРїРёСЃР°РЅРЅРѕР№ РѕРєСЂСѓР¶РЅРѕСЃС‚Рё: " + R);
	}
	
	public static void task20() {
		//20. Р�Р·РІРµСЃС‚РЅР° РґР»РёРЅР° РѕРєСЂСѓР¶РЅРѕСЃС‚Рё. РќР°Р№С‚Рё РїР»РѕС‰Р°РґСЊ РєСЂСѓРіР°, РѕРіСЂР°РЅРёС‡РµРЅРЅРѕРіРѕ СЌС‚РѕР№ РѕРєСЂСѓР¶РЅРѕСЃС‚СЊСЋ.
		double C = (Math.random() * 100 + 1);
		System.out.println("Р”Р»РёРЅР° РѕРєСЂСѓР¶РЅРѕСЃС‚Рё: " + C);
		double R = C / 2 / Math.PI;
		System.out.println("Р Р°РґРёСѓСЃ РѕРєСЂСѓР¶РЅРѕСЃС‚Рё: " + R);
		double A = Math.PI * Math.pow(R, 2);
		System.out.println("РџР»РѕС‰Р°РґСЊ РєСЂСѓРіР°: " + A);
		}
	
	public static void task21() {
		//21. Р”Р°РЅРѕ РґРµР№СЃС‚РІРёС‚РµР»СЊРЅРѕРµ С‡РёСЃР»Рѕ R РІРёРґР° nnn.ddd (С‚СЂРё С†РёС„СЂРѕРІС‹С… СЂР°Р·СЂСЏРґР° РІ РґСЂРѕР±РЅРѕР№ Рё С†РµР»РѕР№ С‡Р°СЃС‚СЏС…). 
		//РџРѕРјРµРЅСЏС‚СЊ РјРµСЃС‚Р°РјРё РґСЂРѕР±РЅСѓСЋ Рё С†РµР»СѓСЋ С‡Р°СЃС‚Рё С‡РёСЃР»Р° Рё РІС‹РІРµСЃС‚Рё РїРѕР»СѓС‡РµРЅРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ С‡РёСЃР»Р°.
		double R = 123.456;
		int i = (int)R;					//Р’С‹С‡Р»РµРЅРµРЅРёРµ С†РµР»РѕР№ С‡Р°СЃС‚Рё
		System.out.println(i);
		int j = (int)((R - i) * 1000);	//Р’С‹С‡Р»РµРЅРµРЅРёРµ РґСЂРѕР±РЅРѕР№ С‡Р°СЃС‚Рё
		System.out.println(j);
		double k = (double)i / 1000;	//РџСЂРµРѕР±СЂР°Р·РѕРІР°РЅРёРµ С†РµР»РѕР№ С‡Р°СЃС‚Рё РІ РґСЂРѕР±РЅСѓСЋ
		System.out.println(k);
		double r = j + k;				//РЎРјРµРЅР° РјРµСЃС‚ С†РµР»РѕР№ Рё РґСЂРѕР±РЅРѕР№ С‡Р°СЃС‚РµР№
		System.out.println(r);
	}
	
	public static void task22() {
		//22. Р”Р°РЅРѕ РЅР°С‚СѓСЂР°Р»СЊРЅРѕРµ С‡РёСЃР»Рѕ Рў, РєРѕС‚РѕСЂРѕРµ РїСЂРµРґСЃС‚Р°РІР»СЏРµС‚ РґР»РёС‚РµР»СЊРЅРѕСЃС‚СЊ РїСЂРѕС€РµРґС€РµРіРѕ РІСЂРµРјРµРЅРё РІ СЃРµРєСѓРЅРґР°С…. 
		//Р’С‹РІРµСЃС‚Рё РґР°РЅРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ РґР»РёС‚РµР»СЊРЅРѕСЃС‚Рё РІ С‡Р°СЃР°С…, РјРёРЅСѓС‚Р°С… Рё СЃРµРєСѓРЅРґР°С… РІ СЃР»РµРґСѓСЋС‰РµР№ С„РѕСЂРјРµ:
		//РќРќС‡ РњРњРјРёРЅ SSc.
		int T = 1234567890;
		int sec = T % 60;
		T = T / 60;
		int min = T % 60;
		T = T / 60;
		int hour = T % 24;
		System.out.println(hour + "С‡ " + min + "РјРёРЅ " + sec + "c");
	}
	
	public static void task23() {
		//23. РќР°Р№С‚Рё РїР»РѕС‰Р°РґСЊ РєРѕР»СЊС†Р°, РІРЅСѓС‚СЂРµРЅРЅРёР№ СЂР°РґРёСѓСЃ РєРѕС‚РѕСЂРѕРіРѕ СЂР°РІРµРЅ r, Р° РІРЅРµС€РЅРёР№ вЂ” R (R> r).
		int r = 15;
		int R = 20;
		double s = Math.PI * r * r;
		double S = Math.PI * R * R;
		double Sk = S - s;
		System.out.println("РџР»РѕС‰Р°РґСЊ РєРѕР»СЊС†Р° СЂР°РІРЅР°: " + Sk);
	}
	
	public static void task24() {
		//24. РќР°Р№С‚Рё РїР»РѕС‰Р°РґСЊ СЂР°РІРЅРѕР±РµРґСЂРµРЅРЅРѕР№ С‚СЂР°РїРµС†РёРё СЃ РѕСЃРЅРѕРІР°РЅРёСЏРјРё Р° Рё b Рё СѓРіР»РѕРј О± РїСЂРё Р±РѕР»СЊС€РµРј РѕСЃРЅРѕРІР°РЅРёРё Р°.
		int a = 24;
		int b = 12;
		int alfa = 60;
		int c = (a - b) / 2;
		double h = c * Math.tan(alfa * Math.PI / 180);
		double S = (a + b) * h / 2;
		System.out.println(S);
	}
	
	public static void task25() {
		//25. Р’С‹С‡РёСЃР»РёС‚СЊ РєРѕСЂРЅРё РєРІР°РґСЂР°С‚РЅРѕРіРѕ СѓСЂР°РІРЅРµРЅРёСЏ Р°С…2+ bС… + СЃ = 0 СЃ Р·Р°РґР°РЅРЅС‹РјРё РєРѕСЌС„С„РёС†РёРµРЅС‚Р°РјРё a, b Рё СЃ 
		//(РїСЂРµРґРїРѕР»Р°РіР°РµС‚СЃСЏ, С‡С‚Рѕ Р°в‰ 0 Рё С‡С‚Рѕ РґРёСЃРєСЂРёРјРёРЅР°РЅС‚ СѓСЂР°РІРЅРµРЅРёСЏ РЅРµРѕС‚СЂРёС†Р°С‚РµР»РµРЅ).
		int a = (int)(Math.random() * 20 - 10);
		while (a == 0) {
			a = (int)(Math.random() * 20 - 10);
		}
		int b = (int)(Math.random() * 20 - 10);
		int c = (int)(Math.random() * 20 - 10);
		double D = Math.pow(b, 2) - 4 * a * c;
		double x, x1, x2;
		System.out.println("a, b, c = " + a + ", " + b + ", " + c);
		System.out.println("D = " + D);
		if (D == 0) {
			x = (-b) / (2 * a);
			System.out.println("РљРѕСЂРµРЅСЊ СѓСЂР°РІРЅРµРЅРёСЏ: x = " + x);
		}
		else if (D > 0) {
			x1 = ((-b) + Math.sqrt(D)) / (2 * a);
			x2 = ((-b) - Math.sqrt(D)) / (2 * a);
			System.out.println("РљРѕСЂРЅРё СѓСЂР°РІРЅРµРЅРёСЏ: x1 = " + x1 + ", x2 = " + x2);
		}
	}
	
	public static void task26() {
		//26. РќР°Р№С‚Рё РїР»РѕС‰Р°РґСЊ С‚СЂРµСѓРіРѕР»СЊРЅРёРєР°, РґРІРµ СЃС‚РѕСЂРѕРЅС‹ РєРѕС‚РѕСЂРѕРіРѕ СЂР°РІРЅС‹ Р° Рё b, Р° СѓРіРѕР» РјРµР¶РґСѓ СЌС‚РёРјРё СЃС‚РѕСЂРѕРЅР°РјРё Сѓ.
		int a = (int)(Math.random() * 20 + 1);
		int b = (int)(Math.random() * 20 + 1);
		int y = 30;
		double S = a * b * Math.sin(y * Math.PI / 180) / 2 ;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println(Math.sin(y * Math.PI / 180));
		System.out.println("РџР»РѕС‰Р°РґСЊ С‚СЂРµСѓРіРѕР»СЊРЅРёРєР° СЂР°РІРЅР°: " + S);
	}
	
	public static void task27() {
		//27. Р”Р°РЅРѕ Р·РЅР°С‡РµРЅРёРµ a. РќРµ РёСЃРїРѕР»СЊР·СѓСЏ РЅРёРєР°РєРёС… С„СѓРЅРєС†РёР№ Рё РЅРёРєР°РєРёС… РѕРїРµСЂР°С†РёР№, РєСЂРѕРјРµ СѓРјРЅРѕР¶РµРЅРёСЏ, 
		//РїРѕР»СѓС‡РёС‚СЊ Р·РЅР°С‡РµРЅРёРµ Р°8 Р·Р° С‚СЂРё РѕРїРµСЂР°С†РёРё Рё Р°10 Р·Р° С‡РµС‚С‹СЂРµ РѕРїРµСЂР°С†РёРё.
		int a = (int)(Math.random() * 10 +1);
		// Р’РѕР·РІРµРґРµРЅРёРµ РІ РІРѕСЃСЊРјСѓСЋ СЃС‚РµРїРµРЅСЊ.
		int a2 = a * a;
		int a4 = a2 * a2;
		int a8 = a4 * a4;
		//Р’РѕР·РІРµРґРµРЅРёРµ РІ 10-СѓСЋ СЃС‚РµРїРµРЅСЊ РІРєР»СЋС‡Р°СЏ РїСЂРµРґС‹РґСѓС‰РёРµ РїСѓРЅРєС‚С‹.
		int a10 = a8 * a2;
		System.out.println("a = " + a);
		System.out.println("Р°8 = " + a8);
		System.out.println("a10 = " + a10);
	}
	
	public static void task28() {
		//28. РЎРѕСЃС‚Р°РІРёС‚СЊ РїСЂРѕРіСЂР°РјРјСѓ РїРµСЂРµРІРѕРґР° СЂР°РґРёР°РЅРЅРѕР№ РјРµСЂС‹ СѓРіР»Р° РІ РіСЂР°РґСѓСЃС‹, РјРёРЅСѓС‚С‹ Рё СЃРµРєСѓРЅРґС‹.
		double y = Math.PI / 2; //Р·РЅР°С‡РµРЅРёРµ СѓРіР»Р° РІ СЂР°РґРёР°РЅР°С…
		double deg = y * 180 / Math.PI; //РїРµСЂРµРІРѕРґ РёР· СЂР°РґРёР°РЅ РІ РіСЂР°РґСѓСЃС‹
		System.out.println(y + " СЂР°РґРёР°РЅ = " + deg + " РіСЂР°РґСѓСЃРѕРІ.");
		double sec = deg * 60;
		System.out.println(y + " СЂР°РґРёР°РЅ = " + sec + " СЃРµРєСѓРЅРґ.");
		double min = sec * 60;
		System.out.println(y + " СЂР°РґРёР°РЅ = " + min + " РјРёРЅСѓС‚.");
	}
	
	public static void task29() {
		//29. РќР°Р№С‚Рё (РІ СЂР°РґРёР°РЅР°С… РІ РіСЂР°РґСѓСЃР°С…) РІСЃРµ СѓРіР»С‹ С‚СЂРµСѓРіРѕР»СЊРЅРёРєР° СЃРѕ СЃС‚РѕСЂРѕРЅР°РјРё Р°, b, СЃ.
		int a = 14;
		int b = 9;
		int c = 15;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		double p = (a + b + c) / 2;
		double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		//S = 1/2 * a*b*sin(alfa)
		//РЅР°С…РѕРґРёРј x = sin(alfa)
		double x =  (2 * S) / (a * b);
		System.out.println(x);
		double ang1_rad = Math.asin(x);
		double ang1_deg = ang1_rad * 180 / Math.PI;
		System.out.println("РЈРіРѕР» РјРµР¶РґСѓ СЃС‚РѕСЂРѕРЅР°РјРё a Рё b: " + ang1_rad + " СЂР°РґРёР°РЅ, " + ang1_deg + " РіСЂР°РґСѓСЃРѕРІ.");
		double y =  (2 * S) / (b * c);
		double ang2_rad = Math.asin(y);
		double ang2_deg = ang2_rad * 180 / Math.PI;
		System.out.println("РЈРіРѕР» РјРµР¶РґСѓ СЃС‚РѕСЂРѕРЅР°РјРё b Рё c: " + ang2_rad + " СЂР°РґРёР°РЅ, " + ang2_deg + " РіСЂР°РґСѓСЃРѕРІ.");
		double z =  (2 * S) / (c * a);
		double ang3_rad = Math.asin(z);
		double ang3_deg = ang3_rad * 180 / Math.PI;
		System.out.println("РЈРіРѕР» РјРµР¶РґСѓ СЃС‚РѕСЂРѕРЅР°РјРё c Рё a: " + ang3_rad + " СЂР°РґРёР°РЅ, " + ang3_deg + " РіСЂР°РґСѓСЃРѕРІ.");
		double sum = ang1_deg + ang2_deg + ang3_deg;
		System.out.println(sum);
	}
	
	public static void task30() {
		//30. РўСЂРё СЃРѕРїСЂРѕС‚РёРІР»РµРЅРёСЏ R1 R2, Рё R3 СЃРѕРµРґРёРЅРµРЅС‹ РїР°СЂР°Р»Р»РµР»СЊРЅРѕ. РќР°Р№РґРёС‚Рµ СЃРѕРїСЂРѕС‚РёРІР»РµРЅРёРµ СЃРѕРµРґРёРЅРµРЅРёСЏ.
		double R1 = 110;
		double R2 = 120;
		double R3 = 115;
		double R = ((R1 * R2 * R3) / (R2 * R3 + R1 * R3 + R1 * R2));
		System.out.println("РџРѕР»РЅРѕРµ СЃРѕРїСЂРѕС‚РёРІР»РµРЅРёРµ СЃС…РµРјС‹: R = " + R);
	}
	
	public static void task31() {
		/*31. РЎРѕСЃС‚Р°РІРёС‚СЊ РїСЂРѕРіСЂР°РјРјСѓ РґР»СЏ РІС‹С‡РёСЃР»РµРЅРёСЏ РїСѓС‚Рё, РїСЂРѕР№РґРµРЅРЅРѕРіРѕ Р»РѕРґРєРѕР№, РµСЃР»Рё РµРµ СЃРєРѕСЂРѕСЃС‚СЊ РІ СЃС‚РѕСЏС‡РµР№ РІРѕРґРµ v РєРј/С‡, 
		 *СЃРєРѕСЂРѕСЃС‚СЊ С‚РµС‡РµРЅРёСЏ СЂРµРєРё v1 РєРј/С‡, РІСЂРµРјСЏ РґРІРёР¶РµРЅРёСЏ РїРѕ РѕР·РµСЂСѓ t1 С‡, Р° РїСЂРѕС‚РёРІ С‚РµС‡РµРЅРёСЏ СЂРµРєРё вЂ” t2 С‡.
		 * 
		 * Р РµС€РµРЅРёРµ:
		 * 1. Р�РЅРёС†РёР°Р»РёР·Р°С†РёСЏ РІСЃРµС… РїРµСЂРµРјРµРЅРЅС‹С… (s, v, v1, t1, t2)
		 * 2. Р’РІРѕРґРёРј РїРµСЂРµРјРµРЅРЅСѓСЋ v2 РґР»СЏ РІС‹С‡РёСЃР»РµРЅРёСЏ СЃРєРѕСЂРѕСЃС‚Рё Р»РѕРґРєРё РїСЂРѕС‚РёРІ С‚РµС‡РµРЅРёСЏ Рё РїСЂРёСЃРІР°РёРІР°РµРј РµР№ Р·РЅР°С‡РµРЅРёРµ v - v1;
		 * 3. Р’РІРѕРґРёРј РїРµСЂРµРјРµРЅРЅСѓСЋ S1 РґР»СЏ РІС‹С‡РёСЃР»РµРЅРёСЏ РїСЂРѕР№РґРµРЅРЅРѕРіРѕ РїСѓС‚Рё Р»РѕРґРєРѕР№ РїРѕ РѕР·РµСЂСѓ Рё РїСЂРёСЃРІР°РёРІР°РµРј РµР№ Р·РЅР°С‡РµРЅРёРµ v * t1;
		 * 4. Р’РІРѕРґРёРј РїРµСЂРµРјРµРЅРЅСѓСЋ S2 РґР»СЏ РІС‹С‡РёСЃР»РµРЅРёСЏ РїСЂРѕР№РґРµРЅРЅРѕРіРѕ РїСѓС‚Рё Р»РѕРґРєРѕР№ РїСЂРѕС‚РёРІ С‚РµС‡РµРЅРёСЏ СЂРµРєРё Рё РїСЂРёСЃРІР°РёРІР°РµРј РµР№ Р·РЅР°С‡РµРЅРёРµ v2 * t2; 
		 * 5. Р’РІРѕРґРёРј РїРµСЂРµРјРµРЅРЅСѓСЋ S РґР»СЏ РІС‹С‡РёСЃР»РµРЅРёСЏ РїРѕР»РЅРѕРіРѕ РїСѓС‚Рё Рё РїСЂРёСЃРІР°РёРІР°РµРј РµР№ Р·РЅР°С‡РµРЅРёРµ S1 + S2;
		 * 6. Р’С‹РІРѕРґРёРј РїРѕР»СѓС‡РµРЅРЅС‹Р№ СЂРµР·СѓР»СЊС‚Р°С‚ РЅР° СЌРєСЂР°РЅ.
		 */
		int v = 15;
		int v1 = 5;
		int t1 = 2;
		int t2 = 3;
		int v2 = v - v1;
		int s1 = v * t1;
		int s2 = v2 * t2;
		int S = s1 + s2;
		System.out.println("РџРѕР»РЅС‹Р№ РїСѓС‚СЊ Р»РѕРґРєРё: " + S);
	}
	
	public static void task32() {
		//32. РўРµРєСѓС‰РµРµ РїРѕРєР°Р·Р°РЅРёРµ СЌР»РµРєС‚СЂРѕРЅРЅС‹С… С‡Р°СЃРѕРІ: С‚ С‡ (0 в‰¤ С‚ в‰¤23) Рї РјРёРЅ (0 в‰¤ Рї в‰¤59) Рє СЃ (0 в‰¤Рє в‰¤59). 
		//    РљР°РєРѕРµ РІСЂРµРјСЏ Р±СѓРґСѓС‚ РїРѕРєР°Р·С‹РІР°С‚СЊ С‡Р°СЃС‹ С‡РµСЂРµР· СЂ С‡ q РјРёРЅ r СЃ?
		int m = (int)(Math.random() * 23);
		int n = (int)(Math.random() * 59);
		int k = (int)(Math.random() * 59);
		System.out.println("РќР°С‡Р°Р»СЊРЅРѕРµ РІСЂРµРјСЏ: " + m + "С‡ " + n + "РјРёРЅ " + k + "c");
		int p = (int)(Math.random() * 23);
		int q = (int)(Math.random() * 59);
		int r = (int)(Math.random() * 59);
		System.out.println("Р”РѕР±Р°РІР»СЏРµРјС‹Р№ РёРЅС‚РµСЂРІР°Р» РІСЂРµРјРµРЅРё : " + p + "С‡ " + q + "РјРёРЅ " + r + "c");
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
		System.out.println("РљРѕРЅРµС‡РЅРѕРµ РІСЂРµРјСЏ: " + m + "С‡ " + n + "РјРёРЅ " + k + "c");
	}
	
	public static void task33() {
		//33. Р’РІРµСЃС‚Рё Р»СЋР±РѕР№ СЃРёРјРІРѕР» Рё РѕРїСЂРµРґРµР»РёС‚СЊ РµРіРѕ РїРѕСЂСЏРґРєРѕРІС‹Р№ РЅРѕРјРµСЂ, Р° С‚Р°РєР¶Рµ СѓРєР°Р·Р°С‚СЊ РїСЂРµРґС‹РґСѓС‰РёР№ Рё РїРѕСЃР»РµРґСѓСЋС‰РёР№ СЃРёРјРІРѕР»С‹.
		char j = (char)(Math.random() * 65535);
		int code = j;
		char c1 = (char)(code - 1);
		char c2 = (char)(code + 1);
		System.out.println("РќР°С‡Р°Р»СЊРЅС‹Р№ СЃРёРјРІРѕР»: " + j + " Рё РµРіРѕ РїРѕСЂСЏРґРєРѕРІС‹Р№ РЅРѕРјРµСЂ: " + code);
		System.out.println("РџСЂРµРґС‹РґСѓС‰РёР№ СЃРёРјРІРѕР»: " + c1 + " СЃ РЅРѕРјРµСЂРѕРј " + (code - 1));
		System.out.println("РџРѕСЃР»РµРґСѓСЋС‰РёР№ СЃРёРјРІРѕР»: " + c2 + " СЃ РЅРѕРјРµСЂРѕРј " + (code + 1));
	}
	
	public static void task34() {
		//34. Р”Р°РЅР° РІРµР»РёС‡РёРЅР° Рђ, РІС‹СЂР°Р¶Р°СЋС‰Р°СЏ РѕР±СЉРµРј РёРЅС„РѕСЂРјР°С†РёРё РІ Р±Р°Р№С‚Р°С…. РџРµСЂРµРІРµСЃС‚Рё Рђ РІ Р±РѕР»РµРµ РєСЂСѓРїРЅС‹Рµ РµРґРёРЅРёС†С‹ РёР·РјРµСЂРµРЅРёСЏ РёРЅС„РѕСЂРјР°С†РёРё.
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
		//35. Р”Р°РЅС‹ РЅР°С‚СѓСЂР°Р»СЊРЅС‹Рµ С‡РёСЃР»Р° Рњ Рё N. Р’С‹РІРµСЃС‚Рё СЃС‚Р°СЂС€СѓСЋ С†РёС„СЂСѓ РґСЂРѕР±РЅРѕР№ С‡Р°СЃС‚Рё Рё РјР»Р°РґС€СѓСЋ С†РёС„СЂСѓ С†РµР»РѕР№ С‡Р°СЃС‚Рё С‡РёСЃР»Р° M/N.
		double M = Math.random()*100000 + 1000000;
		double N = Math.random()*100 + 100;
		System.out.println("РќР°С‡Р°Р»СЊРЅС‹Рµ Р·РЅР°С‡РµРЅРёРµ: M = " + M + " N = " + N);
		double K = Math.round((M / N) * 1000.0) / 1000.0;
		System.out.println("Р Р°СЃСЃРјР°С‚СЂРёРІР°РµРјРѕРµ С‡РёСЃР»Рѕ: M/N = " + K);
		int C = (int)K;
		double D = (Math.round((K - C) * 1000.0) / 1000.0) * 1000;
		int T = (int)D;
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
		System.out.println("РЎС‚Р°СЂС€Р°СЏ С†РёС„СЂР° С†РµР»РѕР№ С‡Р°СЃС‚Рё: " + k);
		while (T > 0) {
			t = T % 10;
			if (t > d) {
				d = t;
			}
			T /= 10;
		}
		System.out.println("РЎС‚Р°СЂС€Р°СЏ С†РёС„СЂР° РґСЂРѕР±РЅРѕР№ С‡Р°СЃС‚Рё: " + d);
		}
	
	public static void task36() {
		//36. РќР°Р№С‚Рё С‡Р°СЃС‚РЅРѕРµ РїСЂРѕРёР·РІРµРґРµРЅРёР№ С‡РµС‚РЅС‹С… Рё РЅРµС‡РµС‚РЅС‹С… С†РёС„СЂ С‡РµС‚С‹СЂРµС…Р·РЅР°С‡РЅРѕРіРѕ С‡РёСЃР»Р°.
		int n = (int)(Math.random() * 9000 + 1000);
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
			}else if (m % 2 != 0) {
				mo = mo * m;
				n2++;
			}
		}
		//РџСЂРѕРІРµСЂСЏРµРј РєРѕР»РёС‡РµСЃС‚РІРѕ С‡РµС‚РЅС‹С… Рё РЅРµС‡РµС‚РЅС‹С… С‡РёСЃРµР». Р•СЃР»Рё С‡РµС‚РЅС‹С… РёР»Рё РЅРµС‡РµС‚РЅС‹С… С‡РёСЃРµР» РЅРµС‚, С‚Рѕ РёС… РїСЂРѕРёР·РІРµРґРµРЅРёРµ Р±СѓРґРµС‚ = 0
		if (n1 == 0) {
			me = 0;
		}
		if (n2 ==0) {
			mo = 0;
		}
		System.out.println(me + "  " + mo);
		System.out.println("Р§Р°СЃС‚РЅРѕРµ РїСЂРѕРёР·РІРµРґРµРЅРёР№ С‡РµС‚РЅС‹С… Рё РЅРµС‡РµС‚РЅС‹С… С†РёС„СЂ: " + (me - mo));	
		}
	
	public static void task37() {
		/*37. РЎРѕСЃС‚Р°РІРёС‚СЊ Р»РёРЅРµР№РЅСѓСЋ РїСЂРѕРіСЂР°РјРјСѓ, РїРµС‡Р°С‚Р°СЋС‰СѓСЋ Р·РЅР°С‡РµРЅРёРµ true, РµСЃР»Рё СѓРєР°Р·Р°РЅРЅРѕРµ РІС‹СЃРєР°Р·С‹РІР°РЅРёРµ СЏРІР»СЏРµС‚СЃСЏ РёСЃС‚РёРЅРЅС‹Рј, 
		 	Рё false вЂ” РІ РїСЂРѕС‚РёРІРЅРѕРј СЃР»СѓС‡Р°Рµ:
			вЂў Р¦РµР»РѕРµ С‡РёСЃР»Рѕ N СЏРІР»СЏРµС‚СЃСЏ С‡РµС‚РЅС‹Рј РґРІСѓР·РЅР°С‡РЅС‹Рј С‡РёСЃР»РѕРј.
			вЂў РЎСѓРјРјР° РґРІСѓС… РїРµСЂРІС‹С… С†РёС„СЂ Р·Р°РґР°РЅРЅРѕРіРѕ С‡РµС‚С‹СЂРµС…Р·РЅР°С‡РЅРѕРіРѕ С‡РёСЃР»Р° СЂР°РІРЅР° СЃСѓРјРјРµ РґРІСѓС… РµРіРѕ РїРѕСЃР»РµРґРЅРёС… С†РёС„СЂ.
			вЂў РЎСѓРјРјР° С†РёС„СЂ РґР°РЅРЅРѕРіРѕ С‚СЂРµС…Р·РЅР°С‡РЅРѕРіРѕ С‡РёСЃР»Р° N СЏРІР»СЏРµС‚СЃСЏ С‡РµС‚РЅС‹Рј С‡РёСЃР»РѕРј.
			вЂў РўРѕС‡РєР° СЃ РєРѕРѕСЂРґРёРЅР°С‚Р°РјРё (С…, Сѓ) РїСЂРёРЅР°РґР»РµР¶РёС‚ С‡Р°СЃС‚Рё РїР»РѕСЃРєРѕСЃС‚Рё, Р»РµР¶Р°С‰РµР№ РјРµР¶РґСѓ РїСЂСЏРјС‹РјРё С…= С‚, С…= Рї (С‚<Рї).
			вЂў РљРІР°РґСЂР°С‚ Р·Р°РґР°РЅРЅРѕРіРѕ С‚СЂРµС…Р·РЅР°С‡РЅРѕРіРѕ С‡РёСЃР»Р° СЂР°РІРµРЅ РєСѓР±Сѓ СЃСѓРјРјС‹ С†РёС„СЂ СЌС‚РѕРіРѕ С‡РёСЃР»Р°.
			вЂў РўСЂРµСѓРіРѕР»СЊРЅРёРє СЃРѕ СЃС‚РѕСЂРѕРЅР°РјРё Р°,b,СЃ СЏРІР»СЏРµС‚СЃСЏ СЂР°РІРЅРѕР±РµРґСЂРµРЅРЅС‹Рј.
			вЂў РЎСѓРјРјР° РєР°РєРёС…-Р»РёР±Рѕ РґРІСѓС… С†РёС„СЂ Р·Р°РґР°РЅРЅРѕРіРѕ С‚СЂРµС…Р·РЅР°С‡РЅРѕРіРѕ РЅР°С‚СѓСЂР°Р»СЊРЅРѕРіРѕ С‡РёСЃР»Р° N СЂР°РІРЅР° С‚СЂРµС‚СЊРµР№ С†РёС„СЂРµ.
			вЂў Р—Р°РґР°РЅРЅРѕРµ С‡РёСЃР»Рѕ N СЏРІР»СЏРµС‚СЃСЏ СЃС‚РµРїРµРЅСЊСЋ С‡РёСЃР»Р° Р° (РїРѕРєР°Р·Р°С‚РµР»СЊ СЃС‚РµРїРµРЅРё РјРѕР¶РµС‚ РЅР°С…РѕРґРёС‚СЊСЃСЏ РІ РґРёР°РїР°Р·РѕРЅРµ РѕС‚ 0 РґРѕ 4).
			вЂў Р“СЂР°С„РёРє С„СѓРЅРєС†РёРё Сѓ = Р°С…2 + bС…+ СЃ РїСЂРѕС…РѕРґРёС‚ С‡РµСЂРµР· Р·Р°РґР°РЅРЅСѓСЋ С‚РѕС‡РєСѓ СЃ РєРѕРѕСЂРґРёРЅР°С‚Р°РјРё (m, Рї).
		*/
		boolean b = true;
		//Р—Р°РґР°С‡Р° 1: Р¦РµР»РѕРµ С‡РёСЃР»Рѕ N СЏРІР»СЏРµС‚СЃСЏ С‡РµС‚РЅС‹Рј РґРІСѓР·РЅР°С‡РЅС‹Рј С‡РёСЃР»РѕРј.
		int N = (int)(Math.random() * 100 + 1);
		int n1 = 0;
		int n2 = N;
		for (;n2 > 0; n2 = n2 / 10) {
			n1++;
		}
		System.out.print("1.	N = " + N + ": ");
		if (N % 2 == 0 && n1 == 2) {
			System.out.println(b);
		} else {
			System.out.println(!b);
		}
		//Р—Р°РґР°С‡Р° 2: РЎСѓРјРјР° РґРІСѓС… РїРµСЂРІС‹С… С†РёС„СЂ Р·Р°РґР°РЅРЅРѕРіРѕ С‡РµС‚С‹СЂРµС…Р·РЅР°С‡РЅРѕРіРѕ С‡РёСЃР»Р° СЂР°РІРЅР° СЃСѓРјРјРµ РґРІСѓС… РµРіРѕ РїРѕСЃР»РµРґРЅРёС… С†РёС„СЂ.
		int M = (int)(Math.random() * 9000 + 1000);
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
		//Р—Р°РґР°С‡Р° 3: РЎСѓРјРјР° С†РёС„СЂ РґР°РЅРЅРѕРіРѕ С‚СЂРµС…Р·РЅР°С‡РЅРѕРіРѕ С‡РёСЃР»Р° N СЏРІР»СЏРµС‚СЃСЏ С‡РµС‚РЅС‹Рј С‡РёСЃР»РѕРј.
		int Z = (int)(Math.random() * 900 + 100);
		int z1 = Z;
		int z2 = 0;
		int z3 = 0;
		for(; Z > 0; Z = Z / 10) {
			z2 = Z % 10;
			z3 = z3 + z2;
		}
		System.out.print("3.	Z = " + z1 + " : ");
		if (z3 % 2 == 0) {
			System.out.println(b);
		}else {
			System.out.println(!b);
		}
		//Р—Р°РґР°С‡Р° 4: РўРѕС‡РєР° СЃ РєРѕРѕСЂРґРёРЅР°С‚Р°РјРё (С…, Сѓ) РїСЂРёРЅР°РґР»РµР¶РёС‚ С‡Р°СЃС‚Рё РїР»РѕСЃРєРѕСЃС‚Рё, Р»РµР¶Р°С‰РµР№ РјРµР¶РґСѓ РїСЂСЏРјС‹РјРё С…= С‚, С…= Рї (С‚<Рї).
		int x = (int)(Math.random() * 40 - 20);
		int y = (int)(Math.random() * 40 - 20);
		int m = (int)(Math.random() * 40 - 20);
		int n = (int)(Math.random() * 40 - 20);
		while (m > n) {
			m = (int)(Math.random() * 40 - 20);
		}
		System.out.print("4.	(x,y) = (" + x + "," + y + ") ; m = " + m + " ; n = " + n + " : ");
		if (x >= m & x <= n) {
			System.out.println(b);
		}else {
			System.out.println(!b);
		}
		//Р—Р°РґР°С‡Р° 5: РљРІР°РґСЂР°С‚ Р·Р°РґР°РЅРЅРѕРіРѕ С‚СЂРµС…Р·РЅР°С‡РЅРѕРіРѕ С‡РёСЃР»Р° СЂР°РІРµРЅ РєСѓР±Сѓ СЃСѓРјРјС‹ С†РёС„СЂ СЌС‚РѕРіРѕ С‡РёСЃР»Р°.
		int X = (int)(Math.random() * 900 +100);
		int x1 = (int)Math.pow(X, 2);
		int x2 = X;
		int x3 = 0;
		int x4 = 0;
		for(; X > 0; X = X / 10) {
			x3 = X % 10;
			x4 = x4 + x3;
		}
		x4 = (int)Math.pow(x4, 3);
		System.out.print("5.	X = " + x2 + " : ");
		if (x1 == x4) {
			System.out.println(b);
		}else {
			System.out.println(!b);
		}
		
		//Р—Р°РґР°С‡Р° 6: РўСЂРµСѓРіРѕР»СЊРЅРёРє СЃРѕ СЃС‚РѕСЂРѕРЅР°РјРё Р°,b,СЃ СЏРІР»СЏРµС‚СЃСЏ СЂР°РІРЅРѕР±РµРґСЂРµРЅРЅС‹Рј.
		int A = (int)(Math.random() * 19 + 1);
		int B = (int)(Math.random() * 19 + 1);
		int C = (int)(Math.random() * 19 + 1);
		System.out.print("6.	a,b,c = " + A + "," + B + "," + C + " : ");
		if(A == B && B == C && C ==A) {
			System.out.println(!b);
		}
		else if(A == B || B == C || C == A) {
			System.out.println(b);
		}else {
			System.out.println(!b);
		}
		
		//Р—Р°РґР°С‡Р° 7: РЎСѓРјРјР° РєР°РєРёС…-Р»РёР±Рѕ РґРІСѓС… С†РёС„СЂ Р·Р°РґР°РЅРЅРѕРіРѕ С‚СЂРµС…Р·РЅР°С‡РЅРѕРіРѕ РЅР°С‚СѓСЂР°Р»СЊРЅРѕРіРѕ С‡РёСЃР»Р° N СЂР°РІРЅР° С‚СЂРµС‚СЊРµР№ С†РёС„СЂРµ.
		N = (int)(Math.random() * 900 + 100);
		n1 = N;
		n2 = N % 10;
		N= N / 10;
		int n3 = N % 10;
		N = N / 10;
		int n4 = N % 10;
		System.out.print("7.	N = " + n1 + " : ");
		if ((n4 + n3) == n2 || (n4 + n2) == n3 || (n3 + n2) == n4) {
			System.out.println(b);
		}else {
			System.out.println(!b);
		}
		
		//Р—Р°РґР°С‡Р° 8: Р—Р°РґР°РЅРЅРѕРµ С‡РёСЃР»Рѕ N СЏРІР»СЏРµС‚СЃСЏ СЃС‚РµРїРµРЅСЊСЋ С‡РёСЃР»Р° Р° (РїРѕРєР°Р·Р°С‚РµР»СЊ СЃС‚РµРїРµРЅРё РјРѕР¶РµС‚ РЅР°С…РѕРґРёС‚СЊСЃСЏ РІ РґРёР°РїР°Р·РѕРЅРµ РѕС‚ 0 РґРѕ 4).
		int a = (int)(Math.random() * 20 + 1);
		N = (int)(Math.random() * 100 + 1);
		System.out.print("8.	a = " + a + "; N = " + N + " : ");
		if (N == Math.pow(a, 0) || N == Math.pow(a, 1) || N == Math.pow(a, 2) || N == Math.pow(a, 3) || N == Math.pow(a, 4)){
			System.out.println(b);
		}else{
			System.out.println(!b);
		}
		//Р—Р°РґР°С‡Р° 9: Р“СЂР°С„РёРє С„СѓРЅРєС†РёРё Сѓ = Р°С…2 + bС…+ СЃ РїСЂРѕС…РѕРґРёС‚ С‡РµСЂРµР· Р·Р°РґР°РЅРЅСѓСЋ С‚РѕС‡РєСѓ СЃ РєРѕРѕСЂРґРёРЅР°С‚Р°РјРё (m, Рї).
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
		//38. Р”Р»СЏ РґР°РЅРЅС‹С… РѕР±Р»Р°СЃС‚РµР№ СЃРѕСЃС‚Р°РІРёС‚СЊ Р»РёРЅРµР№РЅСѓСЋ РїСЂРѕРіСЂР°РјРјСѓ, РєРѕС‚РѕСЂР°СЏ РїРµС‡Р°С‚Р°РµС‚ true, РµСЃР»Рё С‚РѕС‡РєР° СЃ РєРѕРѕСЂРґРёРЅР°С‚Р°РјРё (С…, Сѓ) 
		//РїСЂРёРЅР°РґР»РµР¶РёС‚ Р·Р°РєСЂР°С€РµРЅРЅРѕР№ РѕР±Р»Р°СЃС‚Рё, Рё false вЂ” РІ РїСЂРѕС‚РёРІРЅРѕРј СЃР»СѓС‡Р°Рµ:
		
		int x = (int)(Math.random() * 10 - 5);
		int y = (int)(Math.random() * 10 - 5);
		System.out.println("(x,y) = " + "(" + x + "," + y + ") : ");
		
		//РџРµСЂРІР°СЏ РѕР±Р»Р°СЃС‚СЊ
		if (x >= 0 & x <= 4 & y >= 0 & y <= 4 - x) {
			System.out.println("a) " + true);
		}else if (x <= 0 & x >= -4 & y >= 0 &y <= 4 + x) {
			System.out.println("a) " + true);
		}else {
			System.out.println("a) " + false);
		}
		
		//Р’С‚РѕСЂР°СЏ РѕР±Р»Р°СЃС‚СЊ:
		if (x >= -2 & x <= 2 & y <= 4 & y >= 0) {
			System.out.println("b) " + true);
		}else if (x >= -4 & x <= 4 & y <= 0 & y >= -3) {
			System.out.println("b) " + true);
		}else {
			System.out.println("b) " + false);
		}
		
		//РўСЂРµС‚СЊСЏ РѕР±Р»Р°СЃС‚СЊ
		if (x >= 0 & y >= 0 & x * x + y * y <= 16) {
			System.out.println("c) " + true);
		}else if (x >= 0 & y <= 0 & x * x + y * y <= 25) {
			System.out.println("c) " + true);
		}else {
			System.out.println("c) " + false);
		}			
	}
	
	public static void task39() {
		//39. Р”Р°РЅРѕ РґРµР№СЃС‚РІРёС‚РµР»СЊРЅРѕРµ С‡РёСЃР»Рѕ С…. РќРµ РїРѕР»СЊР·СѓСЏСЃСЊ РЅРёРєР°РєРёРјРё РґСЂСѓРіРёРјРё Р°СЂРёС„РјРµС‚РёС‡РµСЃРєРёРјРё РѕРїРµСЂР°С†РёСЏРјРё, РєСЂРѕРјРµ СѓРјРЅРѕР¶РµРЅРёСЏ, СЃР»РѕР¶РµРЅРёСЏ Рё РІС‹С‡РёС‚Р°РЅРёСЏ,
		//РІС‹С‡РёСЃР»РёС‚Рµ Р·Р° РјРёРЅРёРјР°Р»СЊРЅРѕРµ С‡РёСЃР»Рѕ РѕРїРµСЂР°С†РёР№:
		//2x4 - 3С…3 + 4С…2 - 5С… + 6.
		double x = (Math.random() * 10 + 1);
		System.out.println(x);
		double y = 2 * Math.pow(x, 4) - 3 * Math.pow(x, 3) + 4 * Math.pow(x, 2) - 5 * x + 6;
		System.out.println("y = 2x4 - 3С…3 + 4С…2 - 5С… + 6 = " + y);
	}
	
	public static void task40() {
		//40. Р”Р°РЅРѕ Р·РЅР°С‡РµРЅРёРµ С…. РџРѕР»СѓС‡РёС‚СЊ Р·РЅР°С‡РµРЅРёСЏ -2С… + 3С…2 - 4С…3 Рё 1 + 2С… + 3С…2 + 4С…3 . РџРѕР·Р°Р±РѕС‚СЊС‚РµСЃСЊ РѕР± СЌРєРѕРЅРѕРјРёРё РѕРїРµСЂР°С†РёР№.
		int x = 5;
		double y1;
		double y2;
		y1 = (-2) * x + 3 * Math.pow(x, 2) - 4 * Math.pow(x, 3);
		y2 = 1 + 2 * x + 3 * Math.pow(x, 2) + 4 * Math.pow(x, 3);
		System.out.println("y1 = " + y1);
		System.out.println("y2 = " + y2);
	}
}