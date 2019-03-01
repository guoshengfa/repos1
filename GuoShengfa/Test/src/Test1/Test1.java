package Test1;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(11) + 50;
        Scanner scanner = new Scanner(System.in);
        System.out.println("系统产生一个50-60之间的随机数，请猜出这个数字:");
        while (true) {
            int a = scanner.nextInt();
            if (a > n) {
                System.out.println("比生成的随机数大，请继续猜");
            } else if (a < n) {
                System.out.println("比生成的随机数小，请继续猜");
            } else {
                System.out.println("恭喜你，猜中了");
                break;
            }
        }
    }
}
