package AbstractInterfaces;

public interface SubjectsI {

    public abstract void courseContent();

    public abstract void codeCompiler();

    public abstract void courseDuration(int hours); //metodele de la interfete nu pot avea body, dar pot avea parametrii

    public default void courseDuration2(int hours){//pot avea body daca folosim keyword-ul default
        System.out.println(hours);
    }
}
