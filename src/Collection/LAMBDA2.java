package Collection;

public class LAMBDA2 {
    public static void main(String[] args) {
        AREACALCILATOR area = (length,breadth) -> {
            System.out.println(length * breadth);
//            System.out.println();
        };
        area.calculateArea(5,7);
    }


}
