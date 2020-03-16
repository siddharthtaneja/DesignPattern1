package BuilderPattern;

public class BuilderMain {
    public static void main(String args[]){
        ChocolateBuilder chocBuilder=new ChocolateBuilder();
        chocolateType chocType1=chocBuilder.buildCadburyChocolate();
        chocType1.showItems();

        chocolateType chocType2=chocBuilder.buildNestleChocolate();
        chocType2.showItems();
    }
}
