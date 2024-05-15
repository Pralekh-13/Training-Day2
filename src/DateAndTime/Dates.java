package DateAndTime;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);//yyyy-mm-dd
        LocalDate localDate1=LocalDate.from(ZonedDateTime.now());
        System.out.println(localDate1);
        LocalDate localDate2=LocalDate.of(1999,04,13);
        System.out.println(localDate2);
        String s="2000-12-12";
//        Date date=new SimpleDateFormat("yyyy-mm-dd").parse(s);
//        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern(s);
//        System.out.println(formatObj);
        LocalDate localDate3=LocalDate.parse(s);
        System.out.println(localDate3);
        LocalDate yesterday = localDate.minusDays(1);
        LocalDate tommorow=localDate.plusDays(1);
        System.out.println(yesterday+" "+tommorow);

//2004/4    2100/40
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%100==0){
            if(n%400==0) {
                System.out.println(n + " Year is a Leap year");
            }
            System.out.println("Not a leap year");
        }
        else if(n%4==0){
            System.out.println(n+" Year is a Leap year");
        }
        else
        {
            System.out.println(n+" year is not a Leap year");
        }

    }


}
