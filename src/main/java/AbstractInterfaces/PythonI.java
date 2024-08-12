package AbstractInterfaces;

public class PythonI implements SubjectsI {

    @Override
    public void courseContent() {
        System.out.println("Python Fundamentals");
    }

    @Override
    public void codeCompiler() {
        System.out.println("With Intellij");
    }

    @Override
    public void courseDuration(int hours) {
        System.out.println("Course duration: " + hours);
    }
}
