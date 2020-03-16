package BuilderPattern;

public class ChocolateBuilder {
    public chocolateType buildCadburyChocolate(){
        chocolateType chocolates=new chocolateType();
        chocolates.addItem(new DairyMilk());
        return chocolates;
    }
    public chocolateType buildNestleChocolate(){
        chocolateType chocolates=new chocolateType();
        chocolates.addItem(new Mychocolate());
        return chocolates;
    }
}
