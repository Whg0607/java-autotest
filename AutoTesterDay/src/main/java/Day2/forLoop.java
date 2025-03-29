package Day2;

public class forLoop {
    public static void main(String[] args) {
        //模拟测试最大重试次数
        int maxRetry = 3; // 最大重试次数
        boolean isTestPass = false; // 测试结果标识

        for (int i=1; i<=maxRetry; i++) {
            System.out.println("第" + i + "次执行测试...");
            // 模拟第3次成功
            if (i == 3) {
                isTestPass = true;
                System.out.println("测试通过！");
                break; // 退出循环
            }
        }

        if (!isTestPass) {
            System.out.println("测试失败：已达最大重试次数");
        }    }
}
