package Inheritance;

public class Worker {

    public void doWork(){
        System.out.println("Does unskilled work. ");
        earnMinimumWage();
    }

    private void earnMinimumWage(){
        System.out.println(" Earns mininum wage. ");
    }
}
