package Interface;

import java.util.Scanner;

public class Driver{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Student student=new Student(sc.nextInt(),sc.nextLine());
        Student student1=new Student(12,"gfhgf");
//        System.out.print(student.showRollNo()+"");
//        student.display();
        System.out.println(student.compareTo(student1));
                //student.showRollNo();
    System.out.println(student.compareTo(student1));
    }



}
