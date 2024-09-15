package RA;

import java.util.Scanner;

public class lab02 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên từ bàn phím");
        int number = Integer.parseInt(src.nextLine());
        switch (number) {
            case 0: {
                System.out.println("Số Không");
                break;
            }
            case 1: {
                System.out.println("Số Một");
                break;
            }
            case 2: {
                System.out.println("Số Hai");
                break;
            }
            case 3: {
                System.out.println("Số Ba");
                break;
            }
            case 4: {
                System.out.println("Số Bốn");
                break;
            }
            case 5: {
                System.out.println("Số Năm");
                break;
            }
            case 6: {
                System.out.println("Số Sáu");
                break;
            }
            case 7: {
                System.out.println("Số Bảy");

                break;
            }
            case 8: {
                System.out.println("Số Tám");
                break;
            }
            default: {
                System.out.println("Số Chín");
                break;
            }
        }
    }
}
