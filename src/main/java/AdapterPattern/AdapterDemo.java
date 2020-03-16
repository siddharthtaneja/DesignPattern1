package AdapterPattern;

public class AdapterDemo {
    public static void main(String args[]){
        List targetInterface=new BurgerGUy();
        targetInterface.getBurger();
        System.out.print(targetInterface.getBurgertopping());
    }
}
