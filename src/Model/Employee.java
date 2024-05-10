package Model;

public class Employee {

    private String eName;
    private String position;

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Employee(String eName, String position) {
        this.eName = eName;
        this.position = position;
    }

    public Employee(String eName) {
        this.eName = eName;
    }

    public Employee() {
    }


//    public static void display(String eName, String position){
//        System.out.println(eName+" "+position);
//    }
    public void display(String eName, String position){
        System.out.println(eName+" "+position);
    }
    public Boolean display(String eName){
        System.out.println(eName+" "+position);
        return true;
    }
}
