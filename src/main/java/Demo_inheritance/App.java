package Demo_inheritance;

public class App {

    public static void main(String[] args) {

        Chef normalChef = new Chef();
        normalChef.makeSpecialDish();

        ItalianChef ItalianChef = new ItalianChef();
        ItalianChef.makeSalad();

        ChinessChef chinessChef = new ChinessChef();
        chinessChef.makeSpecialDish();
    }

}
