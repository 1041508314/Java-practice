//import java.util.Scanner;
//import java.util.Random;
import java.util.*;//代表导入java.util下所有的包
public class demo{

public static void main(String[] args) {
	int a = 89757;
	for(int count = 0;count<5;count++){
	int n = a%10;
	a=a/10;
	System.out.print(n+" ");
    }
  }




public static void main12(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int count = 0;
	for(int i = 0;i<32;i++){
		if(((n >> i) & 1)== 1){
			count ++;
		}
	}
	System.out.println(count);
}




public static void main11(String[] args) {
	Scanner scan = new Scanner(System.in);
	int count = 3;
	while(count != 0){
		System.out.println("请输入你的密码");
		String password = scan.nextLine();
		if(password.equals("123456")){
			System.out.println("密码正确，登陆成功");
			break;
		}else{
			count--;
			System.out.println("你还有"+count+"次机会！");

		}
	}
}



/**
 * 
 * 水仙花数
 * @param args [description]
 */
public static void main10(String[] args) {
	for(int n = 1; n <= 999999; n++){
		int count = 0;
		int tmp = n;
		while (tmp != 0){
			count++;
			tmp = tmp/10;
		}
		tmp = n;
		int sum = 0;
		while(tmp != 0){
			sum += Math.pow(tmp%10,count);
			tmp = tmp/10;
		}
		if(sum == n){
			System.out.println(sum);
		}
	}
}


/**
 * 
 * 1到100之间出现多少个数字9
 * @param args [description]
 */
public static void main9(String[] args) {
	int count= 0;
	for(int i = 1;i <= 100; i++){
		if(i / 10 == 9){
			count++;
		}
		if(i % 10 == 9){
			count++;
		}
	}
    System.out.println(count);
}


/**
 * 
 *
 * 计算1/1 - 1/2 + 1/3 - 1/4 +...... + 1/99 - 1/100的值
 * @param args [description]
 */
public static void main8(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	double sum = 0;
	int flg = 1;
	for(int i = 1;i <= n; i++){
		sum = sum + 1.0/i * flg;
		flg = - flg;
	}
	System.out.println(sum);
}



/**
 * 
 * 求最大公约数
 * @param args [description]
 */
public static void main7(String[] args) {
	Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = b;
		while (a % b != 0){
		    c = a % b;
			a = b;
			b = c;

		}
		System.out.println(c);
}


public static void main15(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	for(int i =1;i <= n; i++){
		for(int j =1;j<= i ;j++){
			System.out.print(i+"*"+j+"="+i*j+" ");
		}
		System.out.println();
	}
}



/**
 * 
 * 1000到2000之间的闰年
 * @param args [description]
 */

public static void main5(String[] args) {
	int a = 0;
	for (a = 1000; a <= 2000; a++){
		if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)){
			System.out.print(a + " ");
		}
	}
}



/**
 * 
 * 打印1到100之间的素数
 * @param args [description]
 */
public static void main4(String[] args) {
	Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 1; i <= n ; i ++){
			int j = 2 ;
          for (; j <= (int)Math.sqrt(i) ; j++){
        	if(i % j == 0){
        		break;
		}
	}
		if(j > (int)Math.sqrt(i)){
			System.out.println(i+"是素数！");
		}
    }
}




/**
 * 
 * 判断是不是素数
 * @param args [description]
 */
public static void main3(String[] args) {
	Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	// for (int i= 2; i< n;i++){
	// 	if(n % i ==0){
	// 		System.out.println(n+"不是素数！");
	// 	    break;
	// 	}
	// }
//         for (int i =2 ; i <= n/2 ; i++)
//         	if(n % i == 0){
//         		System.out.println(n + "不是素数！");
//         		break;
//         	}
// }
           for (int i =2 ; i <= (int)Math.sqrt(n) ; i++)
        	if(n % i == 0){
        		System.out.println(n + "不是素数！");
        		break;
        	}
}




	/**
	 * 
	 * 根据年龄输出什么段
	 * @param args [description]
	 */
	public static void main2(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(scan.hasNextInt()){
		int year = scan.nextInt();
		if(year <= 18){
			System.out.println("少年");
		}
        else if(year > 18 && year <= 28){
        	System.out.println("青年");
        }	
	    else if(year >= 29 && year <=55){
	    	System.out.println("中年");
	    }
	    else if(year >=56){
	    	System.out.println("老年");
	    }
	}
	}






/**
 * 
 * 猜数字游戏
 * @param args [description]
 */
public static void main1(String[] args) {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();//如果给定一个时间戳，生成的数是一样的
	// int randNum = random.nextInt(100); // 表示0到100
	int randNum = random.nextInt(100)+100;//表示100到200
	//System.out.println(randNum);
	while (true){
		System.out.println("请输入你要猜的数字");
	    int num = scan.nextInt();
        if(num<randNum){
        	System.out.println("猜小了");
        }else if(num == randNum){
            System.out.println("猜对了");
            break;

        }else{
        	System.out.println("猜大了");
        }
	    
	    }
	}
}
