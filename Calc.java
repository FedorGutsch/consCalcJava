public class Calc {
    Menu menu;
    int system;
    double number1;
    double number2;
    char sign;

    public Calc() {
        menu = new  Menu();
    }

    public void  showMenu(){
        System.out.println("Выберите систему счисления ");
        system = menu.showMenu();

    }

    public void setSystem(int system){
        this.system = system;
    }

    public void getNumber(){

    }



}
