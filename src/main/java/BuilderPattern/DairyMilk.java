package BuilderPattern;

public class DairyMilk extends Company {
    @Override
    public int price(){
        return 50;
    }
    @Override
    public String pack(){
        return "Dairy Milk";
    }
}
