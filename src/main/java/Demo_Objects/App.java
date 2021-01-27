package Demo_Objects;

public class App {

    public static void main(String[] args) {

        Student myStudent = new Student();

        myStudent.firstName = "John ";
        myStudent.lastName = " Queen ";
        myStudent.gpa = 3.3;
        myStudent.major = " Application Devloper ";
        myStudent.age = 27;
        myStudent.onProbation = false;

        Student myStudent2 = new Student();

        myStudent2.firstName = "Olivia ";
        myStudent2.lastName = " Smith ";
        myStudent2.gpa = 4.3;
        myStudent2.major = " Application Devloper ";
        myStudent2.age = 26;
        myStudent2.onProbation = true;

        System.out.println(myStudent.firstName+myStudent.gpa + myStudent.major +myStudent.onProbation);
        System.out.println(myStudent2.firstName+myStudent2.gpa + myStudent2.major + myStudent2.onProbation );

    }
}
