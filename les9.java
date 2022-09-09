// public class problem1{
// 	public static void main(String[] args) {
// 		myMethod();
// 	}

// 	static void myMethod(){
// 		System.out.println("I just got executed !");
// 	}
// }

// public class problem2{
// 	public static void main(String[] args) {
// 		myMethod();
// 		myMethod();
// 		myMethod();
// 	}

// 	static void myMethod(){
// 		System.out.println("I just got executed !");
// 	}
// }


// public class problem3{
// 	public static void main(String[] args) {
// 		myMethod("Hello world");
// 		myMethod("Hi 2e");
// 		myMethod("i love java");

// 	}

// 	static void myMethod(String text){
// 		System.out.println(text);
// 	}
// }

// public class problem4{
// 	public static void main(String[] args) {
// 		addFive(10);
// 		addFive(5);
// 		addFive(3);
// 	}

// 	static void addFive(int n){
// 		int res = n+5;
// 		System.out.println("Res:"+res);
// 	}
// }

// так и знала что тут ошибка эхх зря писала addFive

// public class problem6{
// 	public static void main(String[] args) {
// 		getSum(10,15);
// 		getSum(5,7);

// 	}

// 	static void getSum(int n , int m){
// 		int sum = n+m;
// 		System.out.println("Sum is :"+ sum);
// // 	}
// // }

// public class problem6{
// 	public static void main(String[] args) {
// 		checkAge(10);
// 		checkAge(19);
// 	}

// 	static void checkAge(int age){
// 		if (age<18) {
// 			System.out.println("nelzya tebye uxadi");
			
// 		}
// 		else{
// 			System.out.println("tebye mozhno)");
// 		}
		
// 	}
// }
// public class problem7{
// 	public static void main(String[] args) {
// 		calcFormula(10);

// 		int res = calcFormula(20);
// 		System.out.println("Res is :"+res);
// 	}

// 	static int calcFormula(int n){
// // 		int formula=n*n;
// // 		return formula;
// // 	}
// // }

// public class problem8{
// 	public static void main(String[] args) {
// 		String name="vasya";
// 		String surname="pupkin";
// 		System.out.println(getFullName(name,surname));

// 		String name2="kairat";
// 		String surname2="nurtas";
// 		String anshi = getFullName(name2,surname2);
// 		System.out.println(anshi);
// 	}

// 	static String getFullName(String name,String surname){
// 		String fullName= "Mr. "+surname+" "+name;
// 		return fullName;
// 	}
// }

// public class problem9{
// 	public static void main(String[] args) {
// 		printTimes("i love java",10);
// 		printTimes("i love 2e",20);
// 		printTimes("i love JIHC",100);
// 	}

// 	static void printTimes(String text, int n){
// 		for (int i= 0;i<n ;i++ ) {
// 			sout(text);
			
// 		}
// 	}
// 	static void sout( String text){
// 		System.out.println(text);
// 	}
// }

// public class problem10{
// 	public static void main(String[] args) {
// 		int res1 = calcFormula(20);
// 		double res2 =calcFormula(3.14);
// 		System.out.println("Res is :"+res1);
// 		System.out.println("Res is :"+res2);
// 	}

// 	static int calcFormula(int n){
// 		int formula=n*n;
// 		return formula;
// 	}
// 	static double calcFormula(double n){
// 		double formula= n*n;
// 		return formula;
// 	}
// }

// public class problem11{
// 	public static void main(String[] args) {
// 		int myNum1=plusMethod(8,5);
// 		double myNum2=plusMethod(4.3,6.26);
// 		System.out.println("int:"+myNum1);
// 		System.out.println("double :"+myNum2);
// 	}

// 	static int plusMethod(int x,int y){
// 	  return x+y;
// 	}
// 	static double plusMethod(double x, double y);{
// 	  return x+y;
// 	}
// // }



// 10.1
// Рассчитать значение x, определив и использовав необходимую функцию:
// а)
// 6 6 13 13 21 21
// 2 2 2
// x ;
// б)
// 5 5 12 12 31 31
// 7 7 8 8 2 2
// x ;
// в)
// 15 8 6 12 7 21
// 8 15 12 6 21 7
// x ;
// г)
// 13 7 15 12 21 32
// 7 13 15 12 32 21
// x .


// по идее изи тоже сначала нужно понять логику а а я просто взяла и посмотрела корень в джава и дальше все уже понятно
// a)
// public class 10.1a{
// 	public static void main(String[] args) {
// 		double res1 = cal(6);
// 		double res2 = cal(13);
// 		double res3 = cal(21);
// 		System.out.println(res1+res2+res3);
// 	}
// 	static double cal(double n){
// 		double sqrt= Math.sqrt(n);
// 		double es= (n + sqrt)/2;
// 		return es;
// 	}
// }



// b)
// public class 10.1b{
// 	public static void main(String[] args) {
// 		double res1 = cal(5,7);
// 		double res2 = cal(12,8);
// 		double res3 = cal(31,2);
// 		System.out.println(res1+res2+res3);

		
// 	}
// 	static double cal(double n,double a){
// 		double sqrt= Math.sqrt(n);
// 		double sqrt2= Math.sqrt(a);
// 		double es= n + sqrt;
// 		double es2=sqrt2+a;
// 		double as=es/es2;

// 		return as;
//     }

// }

// v)
// public class les9{
// 	public static void main(String[] args) {
// 		double res1 = cal(15,8);
// 		double res2 = cal(6,12);
// 		double res3 = cal(7,21);
// 		System.out.println(res1+res2+res3);

		
// 	}
// 	static double cal(double n,double a){
// 		double sqrt= Math.sqrt(n);
// 		double sqrt2= Math.sqrt(a);
// 		double es= n + sqrt;
// 		double es2=a+sqrt2;
// 		double as=es/es2;

// 		return as;
//     }

// }

// g)
// public class les9{
// 	public static void main(String[] args) {
// 		double res1 = cal(13,7);
// 		double res2 = cal(15,12);
// 		double res3 = cal(21,32);
// 		System.out.println(res1+res2+res3);

		
// 	}
// 	static double cal(double n,double a){
// 		double sqrt= Math.sqrt(n);
// 		double sqrt2= Math.sqrt(a);
// 		double es= n + sqrt;
// 		double es2=sqrt2+a;
// 		double as=es/es2;

// 		return as;
//     }

// }



// 10.22
// Даны шесть различных чисел. Определить максимальное из них. (Опреде-
// лить функцию, находящую максимум из двух различных чисел.)

// я не знаю просто поискала в интернете вроде поняла по идее вы тоже показали но мен оны потом только заметила
// public class 10.22 {
    
//     public static void main(String[] args) {
//         int max = getMaxFromSixNumbers(-42, 42, 273, 0, 666, 7);
//         System.out.println("максимальное: " + max);
//     }
 
//     private static int getMaxFromSixNumbers(int a, int b, int c, int d, int e, int f) {
//         int m1 = getMax(a ,b);
//         int m2 = getMax(c ,d);
//         int m3 = getMax(e ,f);
//         int m4 = getMax(m1, m2);
//         return getMax(m3 , m4);
//     }
 
//     private static int getMax(int a, int b) {
//         return a > b ? a : b;
//     }
// }


// 10.33
// Составить процедуру, "рисующую" на экране горизонтальную линию из 80
// символов "*".


// ну похож на тот есеп который вы показали и просто формен сделала изи

// public class 10.35{
// 	public static void main(String[] args) {
// 		draw(80);
// 	}

// 	static void draw(int n){
// 		for (int i = 0;i<n ;i++ ) {
// 			System.out.print("*");
// 		}
// 	}
// }


// 10.35
// Составить процедуру, "рисующую" на экране горизонтальную линию из лю-
// бого числа символов "*".

// сверху такой же но тут не написано что сан вводной поэтому сама написаала
// public class 10.35{
// 	public static void main(String[] args) {
// 		draw(12);
// 	}

// 	static void draw(int n){
// 		for (int i = 0;i<n ;i++ ) {
// 			System.out.print("*");
// 		}
// 	}
// }

// 10.39
// Даны стороны двух треугольников. Найти сумму их периметров и сумму их
// площадей. (Определить процедуру для расчета периметра и площади тре-
// угольника по его сторонам.)
// вы это сами показали образец а я метод дала взяла просто формулу герона и периметра


// class 10.39{
// 	public static void main(String[] args) {
// 		int m1 = 1;
// 		int m2 = 2;
// 		int m3 = 3;
// 		int m1 = 4;
// 		int m2 = 5;
// 		int m3 = 6;
// 		int p1 = findPerimetr(m1,m2,m3);
// 		int p2 = findPerimetr(b1,b2,b3);
// 		int a1 = findArea(p1,c1,c2,c3);
// 		int a2 = findArea(p2,b1,b2,b3);
// 		System.out.println(  (p1 + p2));
// 		System.out.println((a1 + a2));


// 	}

// 	static int findPerimetr(int a, int b, int c) {
// 		int p = a + b + c;
// 		return p;
// 	}

// 	static int findArea(int p, int a, int b, int c){
// 		int ger = p*(p - a)(p - b)(p - c);
// 		return ger;
// 	}
// }
