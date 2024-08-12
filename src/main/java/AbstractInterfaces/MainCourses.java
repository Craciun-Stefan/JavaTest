package AbstractInterfaces;

public class MainCourses {
    public static void main(String[] args) {

        //SubjectsC sub1 = new JavaC();
        //SubjectsC sub2 = new PythonC();
        //JavaC sub3 = new JavaC(); //obiect special creat pentru a putea prelua test

        JavaI sub1 = new JavaI();
        PythonI sub2 = new PythonI();

        sub1.courseContent();
        sub1.codeCompiler();
        sub1.courseDuration(35);
        sub1.test();

        System.out.println();

        sub2.courseContent();
        sub2.codeCompiler();
        sub1.courseDuration(35);
        sub2.courseDuration2( 49);
    }
}
