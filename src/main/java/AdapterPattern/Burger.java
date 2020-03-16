package AdapterPattern;

public class Burger {
    private String Burgername;
    private String burgersize;
    int price;

    public String getBurgername() {
        return Burgername;
    }

    public void setBurgername(String burgername) {
        Burgername = burgername;
    }

    public String getBurgersize() {
        return burgersize;
    }

    public void setBurgersize(String burgersize) {
        this.burgersize = burgersize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
