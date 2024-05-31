package OverallOverview;

import java.util.*;
import java.util.stream.Collectors;

public class LAMBDA {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int l= scanner.nextInt();
//        int w=scanner.nextInt();
//        LAMBDAINTERFACE lambdainterface=((length, width) -> {
//            System.out.println(length*width);
//        });
//
//        lambdainterface.calculate(l,w);

        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );

            people.forEach(System.out::println);

            List<Integer> list= people.stream()
                    .map(person ->  person.getAge()+2)
                    .collect(Collectors.toList());
        list.forEach(System.out::println);

        List<Person> list1=people.stream()
                .filter(person -> person.getAge()>25)
                .collect(Collectors.toList());
        list1.forEach(System.out::println);

        int a=people.stream()
                .map(person -> person.getAge())
                .reduce(0,(age1, age2) -> age1 + age2);
        System.out.println(a);

           }

}
