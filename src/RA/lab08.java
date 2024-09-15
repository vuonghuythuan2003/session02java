package RA;

import java.util.Scanner;

public class lab08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        do {
            System.out.println("Nhập vào cạnh thứ nhất: ");
            a = sc.nextDouble();
            System.out.println("Nhập vào cạnh thứ hai: ");
            b = sc.nextDouble();
            System.out.println("Nhập vào cạnh thứ ba: ");
            c = sc.nextDouble();

            if (kiemTraTamGiac(a, b, c)) {
                System.out.println("Đây là 1 tam giác hợp lệ.");
                double chuVi = a + b + c;
                System.out.printf("Chu vi của tam giác là: %.2f\n", chuVi);

                double dienTich = tinhDienTich(a, b, c);
                System.out.printf("Diện tích của tam giác là: %.2f\n", dienTich);
                break;  //
            } else {
                System.out.println("Không phải là 1 tam giác hợp lệ. Vui lòng nhập lại.");
            }

        } while (true);

        sc.close();
    }

    public static boolean kiemTraTamGiac(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static double tinhDienTich(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
