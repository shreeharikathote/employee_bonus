import java.util.ArrayList;

public class StudentCourses {
    private ArrayList<String> courseInfo; // ArrayList to store course info

    public StudentCourses() {
        courseInfo = new ArrayList<>();
    }

    public void addCourse(String courseName, int marksObtained) {
        courseInfo.add(courseName + ": " + marksObtained);
    }

    public void displayCourseInfo() {
        for (String info : courseInfo) {
            System.out.println(info);
        }
    }

    public static void main(String[] args) {
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.addCourse("Mathematics", 85);
        studentCourses.addCourse("Physics", 90);
        studentCourses.addCourse("Computer Science", 88);
        studentCourses.addCourse("English", 75);

        studentCourses.displayCourseInfo();
    }
}
