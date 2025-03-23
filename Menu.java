import java.util.Scanner;

public class Menu {


    private String menu = "1-Двоичная\n2-Троичная\n3-Восьмиричная\n4-Десятичная\n5-Шестнадцатиричная";



    public int showMenu() {
        System.out.println(menu);

        System.out.println("Введите цифру от 1 до 5:");

        int input = this.getNumber(10);

        int radix = -1;

        while (true){
            switch (input){
                case  1: {
                    radix = 2;
                    break;
                }
                case 2:{
                    radix = 3;
                    break;
                }
                case 3:{
                    radix = 8;
                    break;
                }
                case 4:{
                    radix = 10;
                    break;
                }
                case 5:{
                    radix = 16;
                    break;

                }
                default:{
                    System.out.println("Введите цифру от 1 до 5");
                    input = this.getNumber(10);
                    break;
                }

            }

            if (radix != -1){
                break;
            }
        }
        return radix;

    }



    public int getNumber(int radix){

        //System.out.println("Введите число");

        int input = 0;
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt(radix)) {
            input = scanner.nextInt(radix);
        }
        else{
            System.out.println("Это не число");
            getNumber(radix);
        }

        return input;
    }

}