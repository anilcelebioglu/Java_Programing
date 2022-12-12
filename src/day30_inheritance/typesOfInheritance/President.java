package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class President extends Person {

    private LocalDate electedDate;

    public President(String name, char gender, LocalDate dateOfBird, LocalDate electedDate) {
        super(name, gender, dateOfBird);
        setElectedDate(electedDate);
    }

    public LocalDate getElectedDate() {
        return electedDate;
    }

    public void setElectedDate(LocalDate electedDate) {
        this.electedDate = electedDate;
    }

    public void lie(){
        System.out.println(getName() + " is lying");
    }
}
