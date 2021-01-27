package Inheritance;

public class Worksite2 {
    public static void main(String[] args) {

        Worker Alex = new Worker();
        Tradesperson Julia = new Tradesperson();
        Carpenter David = new Carpenter();

        //Alex.doWoodwork(); // Worker class is a supper calss and it can not Inhiert doWoodwork from subclass
        //Julia.doWoodwork(); // Same here Trade person can not inhiert form Carpenter.
        //David.doWoodwork();

    }
}
