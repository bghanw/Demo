package Inheritance;

public class Tradesperson extends Worker  {

    public void doWork(){

        System.out.println(" Does skilled work");
        earnUnionWage();
    }

    private void earnUnionWage(){
        System.out.println(" Earns union wage");
    }

}
