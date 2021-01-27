package Inheritance;

public class Worksite1 {

    public static void main(String[] args) {

    Worker Alex = new Worker();
    Tradesperson Julia = new Tradesperson();
    Carpenter David = new Carpenter();

    Alex.doWork();
    Julia.doWork();
    David.doWork();

    }

}
