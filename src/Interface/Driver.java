package Interface;

import java.util.Scanner;

public class Driver{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student student=new Student(sc.nextInt(),sc.nextLine());
        System.out.print(student.showRollNo()+"");
        student.display();
                //student.showRollNo();
    }



}
