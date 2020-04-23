import java.util.Arrays;

/**
 *
 * @program: 20200415-array
 * @description：
 * 数组：存放相同数据类型的集合。内存是连续的。
 * new：实例化一个对象  内存在堆上
 * 栈上的地址 是拿不到的
 * 堆上的地址 可以打印 但是不是真实的 ，但是可以当作真的，地址也是唯一的。
 * @author: LiuXinYu
 * @create: 2020-04-15 11:27
 **/
public class Test {
    public  static String myToString(int[] array){
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if(i != array.length-1) {
                ret += ",";
            }
        }
        ret +="]";
        return ret;
    }
    public static void main(String[] args) {
        int[] array = {12,34,1,6,2,9,21};
        System.out.println(myToString(array));
    }




    public  static int[] func1(int[] array){
        int [] tmp = new int [array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i]* 2;
        }
        return tmp;
    }
    public  static void func2(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i]* 2;
        }
    }
    public static void main8(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = func1(array);
        //Arrays把它叫做操作数组的工具类
        System.out.println(Arrays.toString(ret));
    }






    public static void main7(String[] args) {
        int a = 0;
        int[] array = null;//array引用的是个空对象-
    }




    /**
     * 两个引用同时指向一块内存
     * @param args
     */
    public static void main6(String[] args) {
        int[] arr = {1,2,3};
        func(arr);
        System.out.println("arr[0] = " + arr[0]);
    }
    public static void func(int[] a){
        a[0] = 10;
        System.out.println("a[0] = " + a[0]);
    }
    public static void main5(String[] args) {
        int num = 0;
        func(num);
        System.out.println("num = " + num);
    }
    public static void func(int x){
        x = 10;
        System.out.println("x = " + x);
    }


    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        Arrays.toString(array);//将数组以字符串的形式输出
        System.out.println(Arrays.toString(array));
    }


    /**
     *
     * 数组进行参数传递
     * @param
     */
    public static void printArray(int[] arr){
        for (int x:arr) {
            System.out.println(x+" ");
        }
    }

    public static void swap(int[] array){
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }
    /**
     * 数组进行传参
     * @param args
     */
    public static void main3(String[] args) {
        int[] array = {1,2,3,4};
        printArray(array);
        int[] array2 = {10,20};
        System.out.println(array2[0]+" "+ array2[1]);
        swap(array2);
        System.out.println(array2[0]+" "+ array2[1]);
    }




    public static void main2(String[] args) {
        int[] array = {1,2,3,4};
        int len = array.length;
        System.out.println(len);

        /**
         * for 循环打印数组
         */
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("=========");

        /**
         * for-each 打印数组
         */
        for(int val : array){
            System.out.print(val+" ");
        }
    }





    public static void main1(String[] args) {
        int[] array = {1,2,3,4};
        int[] array2 = new int[]{11,22,33,44};
        int[] array3 = new int[4];//array3放的是0
    }
}
