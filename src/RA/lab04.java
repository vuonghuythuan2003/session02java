package RA;

import java.util.Scanner;

public class lab04 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập một số bắt đầu: ");
        int numberStart = sc.nextInt();
        System.out.println("Vui lòng nhập một số kết thúc: ");
        int numberEnd = sc.nextInt();
        for (int i = numberStart; i <= numberEnd; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Tổng các số chia hết cho 2 là : " + sum);
    }
}
