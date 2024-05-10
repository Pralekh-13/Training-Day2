import Model.Employee;
import Model.Shapes;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        //System.out.println("hello");

//Employee employee=new Employee();
//        employee.display("kavish","Sr Sd");//for NonStatic method
//        Employee.display("kavish","Sr Sd");// For Static method
//employee.display("hello");
//        System.out.println(employee.display("hello"));

        Shapes shapes=new Shapes();
        shapes.area(10,12);
        shapes.area(10);
        shapes.area(4.5);
        shapes.area(100);


    }
}