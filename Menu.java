import java.util.Scanner;

public class Menu {


    private String menu = "1 - Двоичная\n2 - Восьмиричная\n3 - Десятичная\n4 - Шестнадцатиричная\n-1 - Выход";


    public int showMenu() throws Exception {
        System.out.println(menu);

        System.out.println("Введите цифру от 1 до 4:");

        int input = this.getNumber(10);

        int radix = -1;

        while (true) {
            switch (input) {
                case 1: {
                    radix = 2;
                    break;
                }
                case 2: {
                    radix = 8;
                    break;
                }
                case 3: {
                    radix = 10;
                    break;
                }
                case 4: {
                    radix = 16;
                    break;
                }
                case -1: {
                    throw new Exception("exit");
                }
                default: {
                    System.out.println("Введите цифру от 1 до 4");
                    input = this.getNumber(10);
                    break;
                }

            }

            if (radix != -1) {
                break;
            }
        }
        return radix;

    }

    public int getNumber(int radix) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            if (scanner.hasNextInt(radix)) {
                int input = scanner.nextInt(radix);
                return input;
            } else {
                System.out.println("Ошибка: введено неверное число для системы счисления с основанием " + radix);
                scanner.next();
            }
        }
    }

    public char getSign() {
        Scanner scanner = new Scanner(System.in);
        char sign;
        System.out.print("Введите знак операции (+, -, *, /): ");


        while (true) {
            char operator = scanner.next().charAt(0);

            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                System.out.println("Введите знак");

            } else {
                sign = operator;
                break;
            }
        }


        return sign;
    }

}