package Demo_Objects;

public class App {

    public static void main(String[] args) {

        Book book1 = new Book();

        book1.titile = "See Throw the Wall ";
        book1.author ="Jk Rowling";
        book1.pages = 458;
        book1.language = "English";
        System.out.println(book1.titile + book1.author);

        Book book2 = new Book();

        book2.titile = "172 Hours ";
        book2.author ="Stone Stewards";
        book2.pages = 700;
        book2.language = "English";
        System.out.println(book2.titile + book2.author);


        Student myStudent = new Student();

        myStudent.firstName = "John ";
        myStudent.lastName = " Queen ";
        myStudent.gpa = 3.3;
        myStudent.major = " Application Devloper ";
        myStudent.age = 27;
        myStudent.onProbation = false;
        System.out.println(myStudent.firstName+myStudent.gpa + myStudent.major +myStudent.onProbation);

        Student myStudent2 = new Student();

        myStudent2.firstName = "Olivia ";
        myStudent2.lastName = " Smith ";
        myStudent2.gpa = 4.3;
        myStudent2.major = " Application Devloper ";
        myStudent2.age = 26;
        myStudent2.onProbation = true;
        System.out.println(myStudent2.firstName+myStudent2.gpa + myStudent2.major + myStudent2.onProbation );

    }
}
