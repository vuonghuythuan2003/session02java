package RA;

import java.util.Scanner;

public class lab07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("*****************MENU CHỌN CHỨC NĂNG*******************");
            System.out.println("1. Kiểm tra tính chẵn lẻ của một số");
            System.out.println("2. Kiểm tra một số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 hay không");
            System.out.println("4. Thoát khỏi chương trình");

            System.out.print("Vui lòng nhập một chức năng bất kỳ: ");
            int choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("Vui lòng nhập một số bất kỳ để kiểm tra tính chẵn lẻ:");
                    int number = Integer.parseInt(sc.nextLine());
                    if (number % 2 == 0) {
                        System.out.printf("%d là một số chẵn\n", number);
                    } else {
                        System.out.printf("%d là một số lẻ\n", number);
                    }
                    break;

                case 2:
                    System.out.println("Vui lòng nhập một số bất kỳ để kiểm tra xem có phải số nguyên tố không:");
                    int numToCheck = Integer.parseInt(sc.nextLine());
                    if (laSoNguyenTo(numToCheck)) {
                        System.out.printf("%d là một số nguyên tố\n", numToCheck);
                    } else {
                        System.out.printf("%d không phải là một số nguyên tố\n", numToCheck);
                    }
                    break;

                case 3:
                    System.out.println("Vui lòng nhập một số bất kỳ để xem có chia hết cho 3 không:");
                    int numberSecond = Integer.parseInt(sc.nextLine());
                    if (numberSecond % 3 == 0) {
                        System.out.println("Số này chia hết cho 3");
                    } else {
                        System.out.println("Số này không chia hết cho 3");
                    }
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.err.println("Vui lòng nhập các chức năng từ 1 đến 4");
            }
        } while (true);
    }

    public static boolean laSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
