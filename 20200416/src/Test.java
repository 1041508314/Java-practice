import java.util.*;
/**
 * @program: 20200416
 * @description
 * @author: LiuXinYu
 * @create: 2020-04-16 09:17
 **/

public class Test {
    public static void swap(int[] array){
        int left = 0;
        int right = array.length-1;
        while(left<right){
            while(left < right && array[left] % 2 == 0){
                left ++;
            }
            while(left < right && array[right] % 2 != 0){
                right --;
            }
            if(left < right){
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9};
        swap(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 数组逆置
     * @param
     */
    public static void reverse(int[] array){
        int left = 0;
        int right = array.length-1;
        while(left < right){
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }
    public static void main12(String[] args) {
        int[] array = {1,2,3,4,5,6};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }


    /**
     *
     * 冒泡排序
     * @param array
     */
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean flg = false;//没有发生交换
            for (int j = 0; j < array.length-1-i; j++) {
                flg = false;
                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(flg = false){
                break;
            }
        }
    }
    public static void main11(String[] args) {
        int[] array = {1,2,3,4,8,5,9};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }


    /**
     *
     * 判断这个数组是不是升序的
     * @param
     */
    public static boolean isUp(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main10(String[] args) {
        int[] array = {1,2,3,10,5,6};
        int[] ret = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.equals(array, ret));
        System.out.println(isUp(array));
    }


    /**
     * 二分查找
     * array : 序列      key:代表要查找的数字
     */

    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] < key) {
                right = mid + 1;
            } else if (array[mid] == key) {
                return mid;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main8(String[] args) {
        int[] array = {1,2,5,6,8,9};
        int ret = binarySearch(array, 5);
        System.out.println("下标 ：" + ret);
        //System.out.println(Arrays.binarySearch(array, 9999));
    }





    /**
     *
     * 顺序查找
     * @param array
     * @param key
     * @return
     */
    public static int find(int[] array,int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                return i;
            }
        }
        return -1;//代表没有这个元素
    }
    public static void main7(String[] args) {
        int[] array = {12,2,18,24,76,13};
        int ret = find(array,18);
        System.out.println("下标： " + ret);
    }



    /**
     *
     * 求平均值
     */
    public static double avg(int[] arr){
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return (double)sum / (double)arr.length;
    }
    public static void main6(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(avg(arr));
    }

    /**
     *
     * 求最大值
     * @param array
     * @return
     */

    /**
     *
     * Arrays工具类中的常用方法介绍
     * toString() binarySearch() copyOf()
     * @param
     * @return
     */
    public static void main9(String[] args) {
//        int[] array1 = {1,2,3,4,5,6,7,8,9};
//        int[] array2 = {1,2,3,4,5,6,7,8,9};
//        //fromIndex toIndex 基本上都是左闭右开
//        //System.out.println(Arrays.binarySearch(array,2,5,4));
//
////        int[] ret = Arrays.copyOfRange(array1,2,5);
////        System.out.println(Arrays.toString(ret));
//
//        System.out.println(Arrays.equals(array1, array2));

//        int[] array3 = new int[10];
//        Arrays.fill(array3,2,5,8);
//        System.out.println(Arrays.toString(array3));

        int[] array = {1,21,52,4,13,54};
        Arrays.sort(array);//底层是什么排序
        System.out.println(Arrays.toString(array));
    }


    public static int maxArray(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
    public static void main5(String[] args) {
        int[] array = {12,2,18,24,765,13};
        System.out.println(maxArray(array));
    }


    /**
     *
     * Arrays中其他的用法
     * 数组的拷贝 有4种方式
     * 1.for
     * 2.Arrays.copyOf
     * 3.System.arraycopy
     * 4.clone():产生了这个对象的一个副本 这个方法是Object的克隆方法
     * Object：是所有类的父类
     *
     * System.arraycopy速度最快
     * 上面四种方法从本质上来说都是浅拷贝
     *
     *
     */
    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
//        int[] ret = Arrays.copyOf(array,array.length);
//        System.out.println(Arrays.toString(ret));

//        int[] ret = new int[array.length];
//        System.arraycopy(array,0,ret,0,array.length);
//        System.out.println(Arrays.toString(ret));
        int[] ret = array.clone();
        System.out.println(Arrays.toString(ret));
    }

    public static int[] copyArray(int[] array){
        int[] array1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        return array1;
    }
    public static void main3(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = copyArray(array);
        System.out.println(Arrays.toString(ret));
    }






    public static void main2(String[] args) {
        int[] arr = {1, 2, 3};
        transform1(arr);
        printArray1(arr);
    }
    public static void printArray1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void transform1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }



    public static void main1(String[] args) {
        int[] arr = {1, 2, 3};
        int[] output = transform(arr);
        printArray(output);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] transform(int[] arr) {
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = arr[i] * 2;
        }
        return ret;
    }
}