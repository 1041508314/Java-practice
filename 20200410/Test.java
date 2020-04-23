
import java.util.Scanner;
public class Test {

public static void main(String[] args) {
	for(int i=1;i<=9;i++){
		for(int j=1;j<=i;j++)
		{
			System.out.println(j+"*"+i+"="+(j*i)+"\t");
		}
	    System.out.println();
	   	}
    }
}


// public static void main15(String[] args) {
	
//         int a = 0;
//         for (a = 1000; a <= 2000; a++) {
//             if ((a % 4 == 0 && a % 100 != 0) ||(a % 400 == 0)){
              
//                     System.out.print(a + " ");
//                 }
            
//             }
//         }
    





// 	public static void main14(String[] args) {
// 	Scanner scan = new Scanner(System.in);
// 	while(scan.hasNextInt()){
// 		int year = scan.nextInt();
// 		if(year<=18){
// 			System.out.println("少年");
// 		}
// 		if(year>18 && year <= 28){
// 			System.out.println("青年");
// 		}
// 		if(year>=29 && year<=55){
// 			System.out.println("中年");
// 		}
// 		if(year>=56){
// 			System.out.println("老年");
// 		}
// }
// 	}


// public static void main13(String[] args) {
	
// 	int sum = 0;
// 	int a = 1;
// 	for (int i = 1; i<=5; i++){
// 		a = a * i;
// 	    sum = sum + a;
//     }
//     System.out.println(sum);
// }



// /**
//  * 
//  *不能做switch参数的类型有哪些？
//  *  long  float double boolean
//  * 
//  * @param args [description]
//  */
// public static void main12(String[] args) {
// 	int a = 1;
// 	switch(a){
// 		case 1:
// 		System.out.println("1");
// 		break;
// 		case 2:
// 		System.out.println("2");
// 		break;
// 		default:
// 		System.out.println("请输入正确的数字!");
// 		break;
// 	}
// }

// public static void main11(String[] args) {
// 	Scanner scan = new Scanner(System.in);
// 	while(scan.hasNextInt()){
// 		int year = scan.nextInt();
// 	 if((year%4==0 && year%100 != 0)||year%400==0){
// 	 	System.out.println("是闰年");
// 	 } else {
// 	 	System.out.println("不是闰年");
// 	 }
//    }
// }


// public static void main10(String[] args) {
// 	Scanner scan = new Scanner(System.in);
// 	//int a = scan.nextInt();
// 	//System.out.println(a);
// //nextInt 和 nextLine 一般不放在一起使用
// 	String str = scan.nextLine();
// 	System.out.println(str);
// }

// public static void main9(String[] args) {
// 	int a = 100;
// 	int b = 5;
// 	int c = 7;
// 	int max =a;
// 	if (b > max){
// 		max = b;
// 	}
// 	if (c > max){
// 		max = c;
// 	}
//     System.out.println(max);
   
//     int min = a;
//     if(b<min){
//     	min = b;
//     }
//     if(c<min){
//     	min = c;
//     }
//     System.out.println(min);
// }

// public static void main8(String[] args) {
// 	int a = 10;
// 	int b = 20;
// 	int max = a > b ? a : b ;
// 	System.out.println(max);
// }

// /**
//  * 
//  *移位符
//  *  >>  右移符  补符号位 （右移相当于是除法）
//  *  <<  左移符  补0就行了（左移相当于是乘法）
//  *  >>>  无符号右移   只补0
//  *  注意 ： 没有无符号左移
//  * @param args [description]
//  */
// public static void main7(String[] args) {
// 	System.out.println(11>>1);
// }

// /**
//  * 
//  * 短路求值
//  * 表达式1  &&  表达式2
//  * 一旦表达式1 为假     那么表达式2 就不执行了
//  *
//  * 表达式1  ||  表达式2 
//  * 一旦表达式1 为真     那么就没有必要执行表达式2
//  *
//  *
//  * & 按位与
//  * | 按位或
//  * ^ 按位异或（不一样的进行或 ； 一样的就是0）
//  * ~ 按位取反
//  * @param args [description]
//  */
// public static void main6(String[] args) {
// 	System.out.println(10<20 || 10/0==0);
// 	System.out.println(10>20 && 10/0==0);
// }

// public static void main5(String[] args) {
//     int a = 10;	
//     int b = 20;
//     //int c = 30;
//     System.out.println(!(a < b));
//     boolean flg = true;
//     System.out.println(!flg);// !号只能作用于boolean（布尔）类型的数据
// }


// public static void main4(String[] args) {
// 	int a= 10;
// 	int b= 20;
// 	System.out.println( a == b);
// 	System.out.println( a != b);
// 	System.out.println( a < b);
// 	System.out.println( a > b);
// 	System.out.println( a <= b);
// 	System.out.println( a >= b);
// }

// 	public static void main3(String[] args) {
// 		int i = 10;
// 		i = i++;
// 		System.out.println(i);//输出的i为10

// 	}
//     public static void main2(String[] args) {
//  		//System.out.println(10%3);
// 		//System.out.println(-10%3);
// 		//System.out.println(10%-3);
// 		//System.out.println(-10%-3);
// 		//System.out.println(11.5%2.5);

// 		int a =10;
// 		//int b = ++a;
// 		//System.out.println(b);
// 		int c = a++;
// 		System.out.println(c);
// 	}





// 	public static void main1(String[] args) {
// 		System.out.println(5 / 2);
// 		System.out.println(5.0 / 2);
// 		System.out.println((float)5 / 2);
// 		System.out.println((float)(5 / 2));
// 	}
// }

