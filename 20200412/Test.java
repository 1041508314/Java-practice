//import java.util.Scanner;
//import java.util.Random;
import java.util.*;//代表导入java.util下所有的包


public class Test{


public static void main5(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(scan.hasNextInt()){
		int num = scan.nextInt();
		System.out.println(num);
	}
}


public static void main4(String[] args) {
	Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int sum = 0;
    for(int j =1;j<=num;j++){
    	int ret =1;
        for(int i=1;i<=j;i++){
    	    ret *=i;
    }
        sum += ret;
    }
     System.out.println(sum);
}


public static void main3(String[] args) {
	for(byte i = 0;i<=120;i++){
		for(int o =0;o<=10;o++)
			if(o<=5){
				System.out.print(i + " ");
		        System.out.print("xy");
			}
		
	}
}


public static void main2(String[] args) {
    int i = 1;
	for (; i <=10; i++ ){
		System.out.println(i);
	}
}


	public static void main1(String[] args) {
		Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while (num <= 100){
        	if(num % 15 == 0){
        		System.out.println(num);
        		break;//结束所有循环 或者提前结束循环
        	    //continue;//结束本趟循环
        	}
            System.out.println("hhhh");
            num++; 
        } 
	    System.out.println("hello");
	}
}