package RA;

public class lab06 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        while (count < 20) {
            if(kiemtrasoNguyento(number)){
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
    public static boolean kiemtrasoNguyento(int number){
        if(number < 2) {
            return false;
        }
        int squareNumber = (int) Math.sqrt(number);
        for(int i = 2; i <= squareNumber; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
