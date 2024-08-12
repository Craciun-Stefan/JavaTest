package Objects;

class Courses2 {
    String subject;
    String level;
    int durationHR;
    double grade;
}
//BEST PRACTICE denumirea fisierului sa fie clasa care contine metoda main
public class MainCourses {

    public static void main(String[] args) {
    Course Java1 =  new Course();
    Java1.subject = "Java Fundamentals"; //alocarea atributelor obiectului
    Java1.level = "Basics";
    Java1.durationHR = 24;
    Courses2 Python1 = new Courses2();
    Python1.subject = "Python Fundamentals";
    Python1.level = "Basic";
    Python1.durationHR = 100;
    Python1.grade = 8.3;
        System.out.println("We are learning " + Java1.subject + " before " + Python1.subject);
        System.out.println("Python duration is:" + Python1.durationHR);
    }
}
