package Encapsulation;

public class Trainee {

    private String fullName;
    private String ID;
//getter si setter generati cu click dreapta pe fullName si generate

    public Trainee(String fullName, String ID){ // Acesta este un constructor care elimina nevoia de a folosi setter si getter
        this.fullName = fullName;
        this.ID = ID;
    }
    public String getFullName() {
        return fullName;
    }

   /* public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    */

    public String getID() {
        return ID;
    }

  /*  public void setID(String ID) {
        this.ID = ID;
    }

   */




    /* //getteri si setteri generati manual
    public void setFullName(String newFullName){
        fullName = newFullName;

    }
    public String getFullName(){
        return fullName;

    }
    public void setID(String newID) {
        ID = newID;
    }
    public String getID(){
        return ID;
    }

     */

}
//esti un purcel