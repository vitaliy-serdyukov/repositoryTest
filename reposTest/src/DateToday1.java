package Geo;

import java.time.format.DateTimeFormatter;
import java.util.Date;
public class DateToday1 {
  public static void main(String[] args) {
    Date date = new Date ();

    System.out.println("Today is: " + date.getDate() + " time: " + date.getTime());

  }
}
