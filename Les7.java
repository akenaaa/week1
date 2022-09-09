// Problem2
// с помошью вариэблов


public class Problem2{
	public static void main(String[] args) {
		int m= 2;
		int c= 4;
		int x= 6;
		int p= 7;
		int a= 1;
		int b= 9;
		int q= 3;
		// 1
		// System.out.println(Math.pow(m,2)+16);System.out.println("=");
		// System.out.println(Math.pow(m,2)+8*m+16);

		// 2
		// System.out.println(Math.pow(c,2)+Math.pow(b,2));System.out.println("=");
		// System.out.println(Math.pow(c,2)-2*b*c+Math.pow(b,2));

		// 3
		// System.out.println(Math.pow(x,2)+Math.pow(q,2));System.out.println("=");
		// System.out.println(Math.pow(c,2)+2*x*y+Math.pow(y,2));


		// 4
		// System.out.println(Math.pow(p,2)+Math.pow(q,2));System.out.println("=");
		// System.out.println(Math.pow(p,2)+Math.pow(q,2)-2*p*q);


		// 5
		// System.out.println(Math.pow(a,2)+3*3);System.out.println("=");
		// System.out.println(Math.pow(a,2)-6*a+9);



		// 6
		// System.out.println(Math.pow(b,2)+4*4);System.out.println("=");
		// System.out.println(Math.pow(b,2)+8*b+16);


	}
}

// [Problem 4.32] 
// Дано четырехзначное число. Определить:
// а) равна ли сумма двух первых его цифр сумме двух его последних цифр; 
// б) кратна ли трем сумма его цифр;
// в) кратно ли четырем произведение его цифр;
// г) кратно ли произведение его цифр числу а


// тут также использовала вариэбл.
// и усолвие if

import.java.util.Scanner;
public class Problem 4.32{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 4;
		int f =1/1000%10;
		int s =1/100%10;
		int t =1/10%10;
		int fth =1%10;
		int k=f+s+t+fth;
		if(f+s==t+fth){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}

		if(k%3==0){
			System.out.println("kratna");
		}
		else{
			System.out.println("no kratna");
		}

		if(k%4==0){
			System.out.println("kratna");
		}
		else{
			System.out.println("no kratna");
		}


		if(k%a==0){
			System.out.println("kratna");
		}
		else{
			System.out.println("no kratna");
		}



		
	}
}


// [Problem 4.37] 
// Проверить, принадлежит ли число, введенное с клавиатуры, интервалу (–5, 3). 
// агай буду честна я не поняла совсем как это решать и подсмотрела в интернете (согрешила) 



import java.util.Scanner;
import java.time.temporal.ValueRange;
public class Problem 4.37{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		ValueRange range = ValueRange.of(-5,3);
		if(range.isValidValue(a)){
			System.out.println(prinadlezhit);
		}
		else{
			System.out.println(ne prinadlezhit);
		}
	}
}



// [Problem 4.76] 
// Составить программу, которая уменьшает первое введенное число в два раза, если оно больше второго введенного числа по абсолютной величине. 
// тут также инпут чтобы найти который из чисел больше или меньше нужно было число уменшить вдойне также тут if

import java.util.Scanner;
public class Problem 4.76{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int l = in.nextInt();
		if(a>b){
			System.out.println(a/2);

		}
		else{
			System.out.println("osibka");
		}
	}
}


// [Problem 5.23]
// Вывести "столбиком" следующие числа: 2,1, 2,2, 2,3, ..., 2,8. 


public class Problem 5.23{
	public static void main(String[] args) {
		for (double l= 2.0;i<2.8 ;l=+0.1 ) {
			System.out.println(l);
		}
	}
}


// [Problem 5.27
// Найти:
// а) сумму всех целых чисел от 100 до 500; 
// б) сумму всех целых чисел от a до 500 (значение a вводится с клавиатуры; a 500); 
// в) сумму всех целых чисел от –10 до b (значение b вводится с клавиатуры; b –10); 
// г) сумму всех целых чисел от a до b (значения a и b вводятся с клавиатуры; b a). 

// Solve :  
// public class Problem 5.27 { 
//  public static void main ( String args [] ) { 
 // import java.util.Scanner;
//   Scanner in = new Scanner(System.in) ; 
//   int a = 100 ;  
//   int b = 500 ; 
//     int sum = 0 ; 
//      for (int i = a ; i <= b ; i++ ) { 
//         sum=sum + i ; 
//     } 
//     System.out.println(sum) ;   
 // import java.util.Scanner;
//     int a = in.nextInt() ; 
//     int sum  = 0 ; 
//      for (int i = a ; i <= b ; i++ ) { 
//          sum=sum +  i ; 
//     } 
//     System.out.println(sum) ; 
 //         import java.util.Scanner;   
//         int a = - 10 ; 
//         int b = in.nextInt();
//         int sum = 0; 
//         for (int i = a ; i <= b ; i++ ) { 
//         sum=sum+ i; 
//         } 
//         System.out.println(sum); 
 //         import java.util.Scanner;
//         int a = in.nextInt() ; 
//         int b = in.nextInt() ; 
//         int sum = 0 ; 
//         for (int i = a ; i <= b ; i++ ) { 
//             sum=sum + i ; 
//         }
//         System.out.println(sum) ; 
//  } 
// }


// [Problem 5.28
// Найти:
// а) произведение всех целых чисел от 8 до 15; 
// б) произведение всех целых чисел от a до 20 (значение a вводится с клавиату- ры; 1  a  20); 
// в) произведение всех целых чисел от 1 до b (значение b вводится с клавиату- ры; 1  b  20); 
// г)произведение всех целых чисел от a до b (значения a и b вводятся с клавиатуры; b  a). 

public class Problem 5.28{
	public static void main(String[] args) {
		int a = 1;
		for (int b = 8; b <= 15; b++)
   		a=a*b;
   		System.out.println(a);

   		int a = 1;
		for (int b = 1; b <= 20; b++)
   		a=a*b;
   		System.out.println(a);
	

	int b = 3;
		for (int a = 1; a <= 20; a++)
   		b=b*a;
   		System.out.println(a);

   	}	
}

// [Problem 6.8]
// Дано число n. Из чисел 1, 4, 9, 16, 25, ... напечатать те, которые не превыша- ют n. 

// public class Problem 6.8{
//     public static void main(String[] args) {
//      int n = 67;
//      for(int i = 1; i <= 100; i++){
//       int t = i * i;
//       if(t >= n){
//        break;
//       }
//       System.out.println(t);
//      }
//     } 
//    }