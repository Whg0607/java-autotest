package Day2;

import java.util.Scanner;

public class testResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//创建键盘录入对象
        int passCount = 0;//初始化通过数
        int totalGrades = 5;//规定录入的成绩数量
        System.out.println("请输入5个成绩：");
        //遍历录入的成绩书，并输出成绩合格的成绩数量
        for (int i = 0; i < totalGrades; i++) {
            int grade = sc.nextInt();
            if (grade >60) {
                passCount++;
            }
        }
        double passRate = (double) passCount/totalGrades*100;//计算成绩通过率
        System.out.printf("成绩的通过率为：%.2f%%\n",passRate);
        sc.close();//关闭录入对象，释放资源
    }
}
