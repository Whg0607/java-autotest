package Day2;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        //录入整数
        int score = sc.nextInt();
        if (score >=90) {
            System.out.println("成绩优秀，达到预取目标");
        }else if (score>=60){
            System.out.println("成绩合格，通过测试");
        }else {
            System.out.println("成绩不合格，发现严重缺陷");
        }
    }
}
