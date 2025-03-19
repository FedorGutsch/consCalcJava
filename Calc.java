public class Calc {
    Menu menu;
    int system;


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

}
