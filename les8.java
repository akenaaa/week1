// // import java.io.File;
// // import java.util.Scanner;
// // import java.io.PrintWriter;

// // class problem1{
// // 	public static void main(String[] args) {
// // 		int a[]={33,3,4,5};

// // 		for (int i=0;i<a.length;i++ ) {
// // 	     System.out.println(a[i]);

// // 	    }
// // 	}
// // }



// import java.io.File;
// import java.util.Scanner;
// import java.io.PrintWriter;

// class problem2{
// 	public static void main(String[] args) {
// 		int arr[]={33,3,4,5};
		
// 		for (int i:arr ) {
// 			System.out.println(i);
			
// 		}

// 	}
// }

// class les8{
// 	public static void main(String[] args) {
// 		int a[]= new int[5];
// 		a[0]=10;
// 		a[1]=20;
// 		a[2]=70;
// 		a[3]=40;
// 		a[4]=50;

// 		for (int i = 0;i<a.length ;i++ ) {
// 			System.out.println(a[i]);
			
// 		}
// 	}
// }


// class les8{
// 	public static void main(String[] args) {
// 		String students[]=new String[12];
// 		students[0]="Vasya";
// 		students[1]="Pupkin";
// 		students[2]="Arman";
// 		students[3]="Ospan";
// 		students[4]="Azat";

// 		System.out.println(students[0]);
// 		System.out.println(students[3]);

// 		System.out.println("First for");
// 		for (int i = 0;i<5;i++ ) {
// 		     System.out.println(students[i]);

// 		}



// 		System.out.println("Second for");
// 		for (int i = 0;i<students.length ;i++ ) {
// 			System.out.println(students[i]);
			
// 		}
// 	}
// }


// import java.util.Scanner;


// class les8{
// 	public static void main(String[] args) {
// 		Scanner in = new Scanner(System.in);
// 		System.out.println("Enter array size: ");
// 		int size = in.nextInt();


// 		String students[]=new String[size];
// 		for (int i = 0;i < size ;i++ ) {
// 			String name = in.next();
// 			students[i] = name;
			
// 		}

// 		System.out.println("students");
// 		for (int i = 0;i<size ;i++ ) {
// 			System.out.println(students[i]);
			
// 		}
// 	}
// }


// import java.util.Scanner;

// class les8{
// 	public static void main(String[] args) {
// 		Scanner in = new Scanner(System.in);
// 		System.out.println("Enter array size :");
// 		int size = in.nextInt();


// 		int marks[]=new int[size];
// 		for (int i =0; i < size  ;i++ ) {
// 			int m = in.nextInt();
// 			marks[i]=m;
			
// 		}

// 		int sum =0;
// 		for (int i = 0;i<size ;i++ ) {
// 			sum=sum+marks[i];
			
// 		}
// 		int ave = sum/size;
// 		System.out.println("Average:"+ave)
// 	}
// }


// 11.1. Заполнить массив из восьми элементов следующими значениями: первый
// элемент массива равен 37, второй — 0, третий — 50, четвертый — 46, пя-
// тый — 34, шестой — 46, седьмой — 0, восьмой —13.
// я просто использовала то что в проблеме ведь это пока изи а дальше будет хуже("тут плачущий смайл(((")


// 


// Заполнить массив из десяти элементов значениями, вводимыми с клавиатуры
// в ходе выполнения программы.

// тут тоже похожий в проблеме есть 

// import java.util.Scanner;


// class 11.2{
// 	public static void main(String[] args) {
// 		Scanner in = new Scanner(System.in);
// 		System.out.println("Enter array size: ");
// 		int size = in.nextInt();


// 		String st[]=new String[size];
// 		for (int i = 0;i < size ;i++ ) {
// 			String name = in.next();
// 			st[i] = name;
			
// 		}

// 		System.out.println("uwu");
// 		for (int i = 0;i<size ;i++ ) {
// 			System.out.println(st[i]);
			
// 		}
// 	}
// }


// Массив предназначен для хранения значений весов двадцати человек.
// С помощью датчика случайных чисел заполнить массив целыми значениями,
// лежащими в диапазоне от 50 до 100 включительно.
 // так агай вы сами помогли мне с этим не вините меня если будет не правильно

// class 11.5{
// 	public static void main(String[] args) {
// 		int[] array = new int[20];
//         array[i] = ((int)(Math.random() * 50) - 50);
      

//        for (int i = 0; i < array.length; i++) {
//        	 array[i] = ((int)(Math.random() * 50) - 50);
//           System.out.println(array[i]);
//         }
// 	}

// }

// 11.7. Заполнить массив из двадцати элементов так, как представлено на рис. 11.2.
// 20 19 ... 1
// Рис. 11.2

// изи тапсырма из  проблемов похож


// // class 11.7{
// // 	public static void main(String[] args) {
//        int[] array = new int[20];
// // 	  

//       
//           
// // // 		for (int i=0;i<20;i++ ) {
//                 a[i]= 20-i;
// // // 	     System.out.println(a[i]);
// //           
// //         }
// 	}

// }


// Вывести элементы массива на экран в обратном порядке.

// Создаётся массив целых чисел. Нужно вывести массив в обратном порядке.
// У меня получается при помощи .length. Есть ли способ сделать это без .length, используя циклы for-each


// class 11.14{
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
// 	   System.out.println("введите количество элементов");
//        int num = s.nextInt();
// 	   int a[] = new int[num];
//        System.out.println("введите элементы");
//            for (int i = 0; i < num; i++) {
//               a[i] = s.nextInt();
//    		    }
//    	     System.out.println("Элементы в обратном порядке");
//             for (int i = a.length - 1; i >= 0; i--) {
//              System.out.println(a[i]);
//             }   

//     }
// }



// Дан массив целых чисел. Выяснить:
// а) является ли s-й элемент массива положительным числом;
// б) является ли k-й элемент массива четным числом;
// в) какой элемент массива больше: k-й или s-й.


// class 11.17{
// 	public static void main(String[] args) {
// 		int a[]={33,3,4,5};
//         int s = a[0];
//         int k = a[2];   


//         if (s>0){
//          System.out.println("yes");
//         }
//         else{
//         	System.out.println("no");
//         }

//         if (k%2==0){
//          System.out.println("yes");
//         }
//         else{
//         	System.out.println("no");
//         }


//         if (s>k){
//          System.out.println("yes");
//         }
//         else{
//         	System.out.println("no");
//         }



	    
// 	}
// }



// Определить:
// а) сумму всех элементов массива;
// б) произведение всех элементов массива;
// в) сумму квадратов всех элементов массива;
// г) сумму шести первых элементов массива;
// д) сумму элементов массива с k1-го по k2-й (значения k1 и k2 вводятся
// с клавиатуры; k2 > k1);
// е) среднее арифметическое всех элементов массива;
// ж) среднее арифметическое элементов массива с s1-го по s2-й (значения s1
// и s2 вводятся с клавиатуры; s2 > s1).

// a)
// class 11.19a{
//    public static void main(String args[]){
//       int[] array = {10, 30, 20, 50, 40, 10};
//       int sum = 0;
//       // цикл для обхода каждого элемента массива
//       for( int num : array) {
//           // суммирование каждого элемента массива
//           sum = sum + num;
//       }
//       System.out.println("Сумма элементов массива равна: " + sum);
//    }
// }

// b)
// public static void main(String[] args) {
//     int[] array = {10, 30, 20, 50, 40, 10};
//     for (int i = 0; i < array.length; i++) {
//         array[i] = 1 + (int) (Math.random() * 11);
//     }
//     long p = array[0] * array[1] * array[2] * array[3] * array[4] * array[5] * array[6] * array[7] * array[8] * array[9];
//     System.out.println(p);

// }
// c)
// import java.util.Scanner;

// public class Main{

//    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);

//        System.out.print("a: ");

//        int a = in.nextInt();

//        System.out.print("b: ");

//        int b = in.nextInt();

//        int s = 0;

//        while (b < a) {

//            System.out.println("Error b>=a");

//            System.out.print("b: ");

//            b = in.nextInt();

//        }

//        b = b + 1;

//        for (int i = a;b > i; i++) {

//            s += i*i;

//        }

//        System.out.print(s);

//    }

// }

// g)
 // public static void main(String[] args) {
 //    int[] array = {10, 30, 20, 50, 40, 10,12};
 //    for (int i = 0; i < array.length; i++) {
 //        array[i] = 1 + (int) (Math.random() * 11);
 //    }
 //    long p = array[0] * array[1] * array[2] * array[3] * array[4] * array[5] * array[6] ;
 //    System.out.println(p);

// d)
// public class SumDemo{
//    public static void main(String args[]){
//       Scanner scanner = new Scanner(System.in);
//       int[] array = new int[2];
//       int sum = 0;
//       System.out.println("Введите число:");
//       for (int i=0; i < 2; i++)
//       {
//           // считываем введенный пользователем элемент в массив
//        array[i] = scanner.nextInt();
//       }
//       // проходим по всем элементов массива и суммируем каждое число
//       for( int num : array) {
//           sum = sum+num;
//       }
//       System.out.println("Сумма элементов массива равна: " + sum);
//    }
// }

 // e)
// среднее арифметическое - сумма всех чисел деленная на их количество
// int[] numbers = {5, 8, 12, -18, -54, 84, -35, 17, 37};
// double average = 0;
// if (numbers.length > 0)
// {
//     double sum = 0;
//     for (int j = 0; j < numbers.length; j++) {
//          sum += numbers[j];
//     }
//     average = sum / numbers.length;
// }


// class 11.22{
// // public static void main(String[] args) {
// //     int[] array = {10, 30, 20, 50, 40, 10,20, 50, 40, 10,20, 50, 40};
// //     for (int i = 0; i < array.length; i++) {
// //         array[i] = 1 + (int) (Math.random() * 11);
// //     }
// //     long p = array[0] +array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9]+ array[11] + array[12] ;
// //     System.out.println(p);
// }


// Дан массив. Напечатать:
// а) все неотрицательные элементы;
// б) все элементы, не превышающие число 100




// import java.util.Scanner;
// public class 11.37{
//     public static void main(String[] args) {
//     int n;
//     Scanner s = new Scanner(System.in);
//     System.out.print("Enter no. of elements you want in array:");
//     n = s.nextInt();
//     int a[] = new int[n];
//     System.out.println("Enter all the elements:");
//     for (int i = 0; i < n; i++) {
//     a[i] = s.nextInt(); }
//     System.out.println("");
//     System.out.print("Even numbers:");
//     for(int i = 0 ; i < n ; i++)
//     {
//     if(a[i] % 2 == 0)
//     {
//     System.out.print(a[i]+" ");

//     }
/*
class 11.40{
	public static void main(String[] args) {
		int array[] = {6, 88, 24, 91, -9, 0 ,102, -3, 200};

	   for (int i = 0; i < array.length; i++) {
	      if (array[i] < 0) {
	      	System.out.println("- number");
	       	System.out.println(array[i]);
	      }
	   }
	}
}
*/

//a)
/*
class 11.54{
	public static void main(String[] args) {
		int array[] = {6, 88, 24, 91, -9, 0 ,102, -3, 200};
		int sum = 0;
	   for (int i = 0; i < array.length; i++) {
	      if (array[i] < 20) {
	      	sum = sum + array[i];
	      }
	   }
	   System.out.println(sum);
	}
}
*/

//б)
/*
class 11.54{
	public static void main(String[] args) {
		int array[] = {6, 88, 24, 91, -9, 0 ,102, -3, 200};
		int sum = 0;
		int a = 10;
	   for (int i = 0; i < array.length; i++) {
	      if (array[i] > 10) {
	      	sum = sum + array[i];
	      }
	   }
	   System.out.println(sum);
	}
}