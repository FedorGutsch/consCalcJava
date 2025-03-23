public class Main {

    public static void main(String[] args) {

        Calc calc = new Calc();
        while (true) {
            try {
                calc.showMenu();
            }
            catch (Exception e){
                if (e.getMessage() == "exit"){
                    break;
                }
            }
            try {
                calc.getResult();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
