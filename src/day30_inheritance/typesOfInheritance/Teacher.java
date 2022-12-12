package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Teacher extends Employee {

    public Teacher(String name, char gender, LocalDate dateOfBird, String jobTitle, String employeeId, double salary) {
        super(name, gender, dateOfBird, jobTitle, employeeId, salary);
    }

    public void teach(){
        System.out.println(getName()+" is teaching");

    }

}
