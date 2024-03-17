import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class student1 {
    private String name;
    private LocalDate dob;

    public student1(String name, String dob) {
        this.name = name;
        this.dob = parseDateOfBirth(dob);
    }

    private LocalDate parseDateOfBirth(String dob) {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
                .appendOptional(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
                .toFormatter();
        return LocalDate.parse(dob, formatter);
    }

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    public void displayAge() {
        int age = Period.between(dob, LocalDate.now()).getYears();
        System.out.println("Age of Student: " + age);
    }

    public static void main(String[] args) {
        // Example usage
        student1 student = new student1("John Doe", "2000-01-15");
        student.displayName();
        student.displayAge();
    }
}