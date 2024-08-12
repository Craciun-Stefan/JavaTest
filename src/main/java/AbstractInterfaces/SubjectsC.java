package AbstractInterfaces;

public abstract class SubjectsC {
    public abstract void courseContent();
    public abstract void codeCompiler();

  //non-abstract method
    public void courseDuration(int hours){
        System.out.println("Course duration: " + hours);
    }
}
