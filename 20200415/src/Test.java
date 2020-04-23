/**
 * @program: 20200415
 * @description
 * @author: LiuXinYu
 * @create: 2020-04-15 10:33
 **/
import java.util.*;
public class Test {

    public static int JumpFloor(int target){
        if(target==1){
            return 1;
        }else if(target==2){
            return 2;
        }else{
            return JumpFloor(target-1)+JumpFloor(target-2);
        }
    }
    public static void main2(String[] args) {
//        System.out.println("请输入台阶数：");
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
        System.out.println(JumpFloor(5));
    }



    /**
     *
     * 从pos1位置挪到pos2 位置
     * @param pos1
     * @param pos2
     */
    public static void move(char pos1, char pos2){
        System.out.print(pos1+"->"+pos2+" ");
    }

    /**
     *
     * @param n  盘子个数
     * @param pos1 起始位置
     * @param pos2 中途位置
     * @param pos3 目的地位置
     * @return
     */
    public static void hanoi(int n,char pos1,char pos2,char pos3){
        if(n==1){
            move(pos1,pos3);
        }else{
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }
    }
    public static void main1(String[] args) {
        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');
    }
}
