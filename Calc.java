public class Calc {
    Menu menu;
    int system;
    int number1;
    int number2;
    char sign;
    int result;


    public Calc() {
        menu = new Menu();
    }

    public void  showMenu() throws Exception{
        System.out.println("Выберите систему счисления ");
        this.setSystem(menu.showMenu());
    }

    private void setSystem(int system){
        this.system = system;
    }

    private void getStatement() throws Exception{

        System.out.println("Введите 2 числа");

        while (true){
            try {
                this.number1 = menu.getNumber(system);
                break;
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }


        this.sign = menu.getSign();


        this.number2 = menu.getNumber(system);

        }


    private int Solve() throws Exception{
        this.getStatement();

        switch (this.sign){
            case '+':{
                return (number1 + number2);
            }
            case '-':{
                return number1 - number2;
            }
            case '*':{
                return number1 * number2;
            }
            case '/':{
                if(number2!=0){
                    return number1 / number2;
                }
                else{
                    throw new Exception("Деление на 0");
                }
            }
        }
        return 0;
    }

    public void getResult () throws Exception{
        NumSystemTransformer nt = new NumSystemTransformer();

        result = this.Solve();
        String resultB = nt.transformTo(result, 2);
        String resultO = nt.transformTo(result, 8);
        String resultH = nt.transformTo(result, 16);

        System.out.println("Bin: " + resultB + "  Oct: "+resultO + "  Dec: " + result + "  Hex: " + resultH);
    }

}
