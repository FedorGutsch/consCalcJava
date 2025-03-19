import java.util.Scanner;

public class Menu {


    private String menu = "1-Двоичная\n2-Троичная\n3-Восьмиричная\n4-Десятичная\n5-Шестнадцатиричная";

    public int showMenu() {
        System.out.println(menu);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цифру от 1 до 5:");

        while (true) {
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();


                switch (input) {
                    case 1:
                        return 2;

                    case 2:
                        return 3;

                    case 3:
                        return 8;

                    case 4:
                        return 10;

                    case 5:
                        return 16;
                    default:
                        System.out.println("Введено неверное значение ");
                        break;
                }

            } else {
                System.out.println("Это не цифра! Введите цифру от 1 до 5.");
                scanner.next();
            }
        }

    }

}