public class Calc {
    Menu menu;
    int system;
    int number1;
    int number2;
    char sign;

    public Calc() {
        menu = new Menu();
    }

    public void  showMenu(){
        System.out.println("Выберите систему счисления ");
        this.setSystem(menu.showMenu());
    }

    private void setSystem(int system){
        this.system = system;
    }

    private void getStatement(){
        System.out.println("Введите 2 числа");
        this.number1 = menu.getNumber(system);
        this.sign = menu.getSign();
        this.number2 = menu.getNumber(system);
    }

    public int Solve(){
        this.getStatement();

        switch (this.sign){
            case '+':{
                return (number1+number2);
            }
            case '-':{
                return number1-number2;
            }
            case '*':{
                return number1*number2;
            }
            case '/':{
                return number1/number2;
            }
        }
        return 0;

    }





}
