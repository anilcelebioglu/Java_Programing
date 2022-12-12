package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {

        Student student = new Student("Ece",'f',LocalDate.of(1982,3,2),'a',"2121");

        President president = new President("Anil",'M',LocalDate.of(1984,9,2),LocalDate.of(1984,2,1));

        Teacher teacher = new Teacher("zeynel",'f',LocalDate.of(1982,2,1),"Math","212",95000);

        System.out.println(student);
        System.out.println(president);
        System.out.println(teacher);

        student.study();
        teacher.teach();
        president.lie();

        System.out.println("-------------------------------------------");

        student.eat("borek");
        teacher.eat("sucuklu yumurta");
        president.eat("helva");



    }
}
