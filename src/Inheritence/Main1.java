package Inheritence;

import java.util.Scanner;

public class Main1 extends Employee1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        Employee1 employee1=new Main1();
//        employee1.display();
        Main1 main1=new Main1();
        Employee1 employee1=(Employee1)main1;
        employee1.display();
//        main1.display();
//        main1.showAddress();

    }
    @Override
    public void display(){
        System.out.println("bye");
    }
}
