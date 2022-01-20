package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputHelper {
   static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   
  public static int intReader(String message) throws IOException{
   int int2Read = 0;
   
   try {
     System.out.println(message);
     int2Read = Integer.parseInt(reader.readLine());
   
   } catch (NumberFormatException e) {
     System.out.print("not valid number. ");
     int2Read = intReader(message);
   }
   
   return int2Read;
  }
  
  public static double doubleReader(String message) throws IOException{
   double double2Read = 0;
   
   try {
     System.out.println(message);
     double2Read = Double.parseDouble(reader.readLine());
   
   } catch (NumberFormatException e) {
     System.out.print("not valid number. ");
     double2Read = Double.parseDouble(reader.readLine());
   }
   
   return double2Read;
  }

}
