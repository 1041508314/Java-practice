/**
 * @program: 20200415-lesson
 * @description
 * @author: LiuXinYu
 * @create: 2020-04-15 18:34
 **/
public class Test {
    public static void main(String[] args) {
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
