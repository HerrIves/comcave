package mytestarea.OA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHelper {

  public static int intScanner(String message){
    Scanner sc = new Scanner(System.in);
    int parametr2Read = 0;
    
    System.out.println(message);
    try{
      parametr2Read = sc.nextInt();
    }catch (InputMismatchException e){
      parametr2Read = intScanner("Das ist nicht richtige Number. " + message);
    }
    
    return parametr2Read;
  }

}
