package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class InputHelper {
   private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

   public static String readString(String message){
       System.out.println(message);
       try {
           return reader.readLine();
       } catch (IOException e) {
           e.printStackTrace();
       }
       return "sorry. we sorry";
   }
   
  public static int readInt(String message) {
   int int2Read = 0;
   
   try {
     System.out.println(message);
     int2Read = Integer.parseInt(reader.readLine());
   
   } catch (NumberFormatException | IOException e) {
     System.out.print("not valid number. ");
     int2Read = readInt(message);
   }
   return int2Read;
  }
  
  public static double doubleReader(String message){
   double double2Read = 0;
   
   try {
     System.out.println(message);
     double2Read = Double.parseDouble(reader.readLine());
   
   } catch (NumberFormatException e) {
     System.out.print("not valid number. ");
       try {
           double2Read = Double.parseDouble(reader.readLine());
       } catch (IOException ioException) {
           ioException.printStackTrace();
       }
   } catch (IOException e) {
       e.printStackTrace();
   }

      return double2Read;
  }

    public static LocalDate readDate(String message) {
        DateTimeFormatter dTFormatter = DateTimeFormatter.ofPattern("yyyy MM dd");
       return LocalDate.parse(readString(message), dTFormatter);
    }
}
