package Day2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        //键盘录入随机数，
        int env = new Scanner(System.in).nextInt();//1 开发环境 2测试环境 3生产环境
        String envName ;
        switch (env){
            case 1:
            envName = "开发环境";
            break;
            case 2:
                envName="测试环境";
                break;
            case 3:
                envName = "生产环境";
                break;
            default:
                envName = "未知环境";
        }
        System.out.println("当前运行环境："+envName);
    }
}
