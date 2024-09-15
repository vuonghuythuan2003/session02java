package RA;

import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Vui long nhap mot so nguyen bat ky: ");
        int number = Integer.parseInt(src.nextLine());
        if (number >= 2) {
            System.out.println(2);
        }
        for (int i = 3; i < number; i += 2) {
            if (kiemtrasoNguyento(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean kiemtrasoNguyento(int n) {
        if(n < 2) {
            return false;
        }
        int squareNumber = (int) Math.sqrt(n);
        for(int i = 2; i <= squareNumber; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
