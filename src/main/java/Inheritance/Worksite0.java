package Inheritance;

public class Worksite0 {

    public static void main(String[] args) {

        Worker alex = new Worker();
        //alex.earnMinimumWage(); // We can't call this because it is private
        alex.doWork(); // earnMinimumwage can be called from methods whith in the class

    }
}
