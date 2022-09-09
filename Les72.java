// import java.util.Scanner;


// class Les72{
// 	public static void main(String[] args) {
// 		Scanner myObj = new Scanner(System.in);

// 		System.out.println("Enter name ,age and salary:");

// 		String z = myObj.nextline();

// 		int age = myObj.nextInt();
// 		double salary = myObj.nextDouble();

// 		System.out.println("Name:" + z);
// 		System.out.println("Age:" + age);
// 		System.out.println("Salry:" + salary);

// 	}
// }


// import java .io.File;
// import java.util.Scanner;


// class FirstApp{
// 	public static void main(String[] args) throws Exception {
// 		Scanner in = new Scanner(new File ("input.txt"));
// 		int n = in.nextInt();
// 		System.out.println(n);

		
// // 	}

// // }


// // import java.io.File;
// // import java.util.Scanner;
// // import java.io.PrintWriter

// //  class FirstApp{
// //  	public static void main(String[] args) throws Exception{
// //  		Scanner in = new Scanner(new File ("input.txt"));
// //  		PrintWriter out = new PrintWriter(new File ("output.txt"));

// //  		out.println("File output");
// //  		out.close();

 		
// //  	}
// //  }

// import java .io.file;
// import java.util.Scanner;

// class FirstApp{
// 	public static void main(String[] args) {
// 		Scanner in = new Scanner (new File ("input.txt"));
// 		int n = in.nextInt();
// 		System.out.println(n);

// 		int LineNumber=1;
// 		while(in.hasNextline()){
// 			String Line = in.nextLine();
// 			System.out.println("Line" + LineNumber ":" + Line);
// 			LineNumber++;

// 		}
// 	}
// }



// import java .io.File;
// import java.util.Scanner;
// import java.io.PrintWriter;


// class FirstApp{
// 	public static void main(String[] args) {
// 		Scanner in = new Scanner (System.in);
// 		PrintWriter out = new PrintWriter(new File ("output.txt"));

// 		System.out.print("Enter line number :");
// 		int n = in.nextInt();

// 		int LineNumber = 1;
// 		while (FileInput.hasNextline()){
// 			String line = FileInput.nextLine();
// 			out.println("line" + LineNumber +":" + line);

// 			if(LineNumber>=n){
// 				break;
// 			}

// 			LineNumber++;
// 		}
// 		out.close();
// 	}
// }

// . Имеется типизированный файл, элементами которого являются отдельные
// слова. Если слово в файле начинается на букву к, то заменить ее на К.
// сначала в файл написала рандомно буквы если тут встретить буква к то его с помошью ифа меняют на К


// class 14.28{
// 	public static void main(String[] args) throws Exception{
// 		Scanner file = new Scanner(new File("input.txt"));
// 		PrintWriter output = new PrintWriter(new File("output.txt"));

// 		while(file.hasNextLine()){
// 			String rl = file.next();
// 			char rl = word.charAt(0);
// 			if(k == 'K'){
// 				System.out.println(good);
// 			}else{
// 				System.out.println(k.replace(k, 'K'));
// 			}
// 		}
// 		output.close();
// 	}
// }


// . Имеется типизированный файл, элементами которого являются отдельные
// слова.
// а) Найти количество слов, начинающихся на букву м.
// б) Определить, есть ли в файле слова, начинающиеся на букву к. В случае
// положительного ответа напечатать порядковый номер первого из них.
// в) Получить предложение, составленное из слов, порядковый номер которых
// четный.
// г) Найти самое длинное слово.
// Во всех задачах принять, что размер файла неизвестен



// а) по логике с помошью ифа он также заменит стринг м 

// class 14.30 a){
// 	public static void main(String[] args) throws Exception{
// 		Scanner file = new Scanner(new File("input.txt"));
		

// 		while(file.hasNextLine()){
// 			String rl = file.next();
// 			char rl = rl.charAt(0);
// 			if(k == 'm'){
// 				System.out.println(good);
// 			}
// 		}
		
// 	}
// }


// b) сначала отсканирует если найдет к то он заменит на большую а если нет то ничего не будет
// class 14.30 {
// 	public static void main(String[] args) throws Exception{
// 		Scanner file = new Scanner(new File("input.txt"));
		
// 		int lineNum = 1;
// 		while(file.hasNextLine()){
// 			String rl = file.next();
// 			char k = rl.charAt(0);
// 			if(k == 'k'){
// 				System.out.println(good);
// 			}
// 			elif(lineNum >= k){
// 				break;
// 			}
// 			lineNum++;
// 		}
		
// 	}
// }

// c)также использовола иф 
// class 14.30{
// 	public static void main(String[] args) throws Exception{
// 		Scanner j = new Scanner(System.in);
// 		Scanner file = new Scanner(new File("input.txt"));
		
// 		int lineNumber = 1;
// 		while(file.hasNextLine()){
// 			String rl= file.next();
			
// 			if(lineNumber % 2 == 0){
// 				System.out.print(" "+".");	
// 			}
			
// 			lineNumber++;
// 		}
		
// 	}
// }

// d)я честно не поняла как это сделать думаю не правильно в инете тоже искала
// class  14.30{
// 	public static void main(String[] args) throws Exception{
// 		Scanner j = new Scanner(System.in);
// 		Scanner file = new Scanner(new File("input.txt"));
		
// 		int lineNumber = 1;
// 		while(file.hasNextLine()){
// 			String rl = file.next();
// 			if(lineNumber == 7){
// 				System.out.println(".");
// 			}
// 			lineNumber++;	
// 		}
		
		
// 	}
// }



// 14.31. Имеется типизированный файл, элементами которого являются отдельные
// символы.
// а) Выяснить, являются ли первые два символа цифрами. Если да, то установить, является ли число, образованное этими цифрами, четным.
// б) Найти число вхождений в файл каждой из букв а, о и у.
// в) Найти число вхождений в файл сочетания двух соседних букв н и е.
// г) Выяснить, образуют ли соседние символы файла буквосочетание ура.


// class 14.31{
// 	public static void main(String[] args) throws Exception {
// 		Scanner in = new Scanner(new File("input.txt"));
// 		PrintWriter outFile = new PrintWriter(new File("output.txt"));

// 		int countA = 0;
// 		while (in.hasNextLine()){
// 			String rl = in.nextLine();

// 			if(rl.equals("a")){
// 				countA++;
// 				outFile.println("number of letters a:" + countA);
// 			}
// 		}

// 		outFile.close();
// 	}
// }

// class 14.30{
// 	public static void main(String[] args) throws Exception {
// 		Scanner in = new Scanner(new File("input.txt"));
// 		PrintWriter outFile = new PrintWriter(new File("output.txt"));

// 		int lineNum = 1;
// 		while (in.hasNextLine()){
// 			String rl = in.nextLine();
			
// 			if(lineNum % 2 == 0){
// 				outFile.println(rl);
// 				break;
// 			}
// 			lineNum++;
// 		}
// 		outFile.close();
// 	}
// }


// class 14.31{
// 	public static void main(String[] args) throws Exception{
// 		Scanner j = new Scanner(System.in);
// 		Scanner file = new Scanner(new File("input.txt"));

// 		int lineNumber = 1;
// 		while(file.hasNextLine()){
// 			String rl = file.next();
// 			rl = rl.replaceAll("\\m+","");

// 			int n = Integer.parseInt(rl);

// 			if(n%2==0){
// 				System.out.println("true");
// 			}
// 			else{
//  				System.out.println("false");
// 			}
// 			lineNumber++;	
// 		}
		
		
// 	}
// }





// 14ю53
// Имеется типизированный файл, элементами которого являются отдельные
// символы. Удалить из него первую из букв о (принять, что буквы о в файле
// имеются). Результат записать в другой файл. Размер заданного файла неизвестен.

// логика такая же как  и впревидуйщих

// public class 14.50{
// 	public static void main(String[] args)throws Exception {

// 		Scanner fileInput = new Scanner(new File("input.txt"));
// 		PrintWriter out = new PrintWriter(new File("output.txt"));
		
// 		while(fileInput.hasNextLine()){
// 			String rl = fileInput.nextLine();
// 			rl = rl.replaceAll("o","");
// 			out.println( mmm);
// 		}

// 		out.close();
// 	}
// }

/*
14.53. 
Имеются два типизированных файла одинакового размера, элементами которых являются отдельные буквы. Получить третий файл, каждый элемент которого представляет собой сочетание соответствующих букв первого и второго файлов.
*/
// задача была в том чтобы соеденить два файла логика проста

// public class 14.53{
// 	public static void main(String[] args)throws Exception {

// 		Scanner file = new Scanner(new File("input.txt"));
// 		Scanner file2 = new Scanner(new File("mm.txt"));
// 		PrintWriter out = new PrintWriter(new File("output.txt"));

// 		while(file.hasNextLine()){
// 			String rl = file.nextLine();
// 			String rl2 = file2.nextLine();
// 			out.println(rl+rl2);
// 		}
// 		out.close();
// 	}
// }