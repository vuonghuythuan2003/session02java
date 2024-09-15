package RA;

import java.util.Scanner;

public class lab01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập một số bất kỳ : ");
        int numberFirst = scanner.nextInt();
        if (numberFirst % 15 == 0) {
            System.out.println("Số hiện tại chia hết cho cả 3 và 5");
        } else {
            System.out.println("Số hiện tại không cho hết cho cả 3 và 5");
        }
    }
}
