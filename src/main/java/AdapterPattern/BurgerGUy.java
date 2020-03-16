package AdapterPattern;

import java.util.Scanner;

public class BurgerGUy extends Burger implements List {
    public void getBurger(){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the burger name :");
        String pizzaname=s.next();
        System.out.print("Enter the burger size:");
        String pizzasize=s.next();
        System.out.print("Enter the burger price:");
        int pizzaprice=Integer.parseInt(s.next());

        setBurgername(pizzaname);
        setPrice(pizzaprice);
        setBurgersize(pizzasize);
    }

    @Override
    public String getBurgertopping() {
        String pizzaname=getBurgername();
        String pizzasize=getBurgersize();
        int pizzaprice=getPrice();
        return ("The pizza : "+pizzaname+" of size: "+pizzasize+" is of Rs "+pizzaprice);
    }
}
