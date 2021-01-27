package Inheritance;

public class Carpenter extends Tradesperson{

    public void doWork(){
        System.out.println("Does skilled work. ");
        earnCarpentersUnionWage();
    }

    private void earnCarpentersUnionWage(){
        System.out.println("Earns carpenter's wage");
    }
}
