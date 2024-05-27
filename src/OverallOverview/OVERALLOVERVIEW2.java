package OverallOverview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OVERALLOVERVIEW2 {
    public static void main(String[] args) {
        Map<String,String > map1=new HashMap<>();
        map1.put("hello","hello");
        map1.put("h","hello");
        System.out.println(map1);
        Set<Map.Entry<String, String>> set=map1.entrySet();
        System.out.println(set);

    }



}
