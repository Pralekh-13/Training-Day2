package OverviewMOnday;

import Collection.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collectors {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
//        list= Arrays.asList(40, 50, 60);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        System.out.println(list);
        list.remove(1);
//        list.removeAll(10);

        System.out.println(list);
        for(Integer i:list){
            System.out.println(i);
        }

        List<Person> list1=Arrays.asList(
                new Person("Shri1",28),
                new Person("shri2",32),
                new Person("shri2",12),
                new Person("shri2",40)

        );
        Collections.sort(list1,new PersonAgeComparator());
        System.out.println(list1);


    }
//    List,set,map,stack,vector,queue,deque

//    ArrayList<Integer> arrayList=new ArrayList<>();

}
