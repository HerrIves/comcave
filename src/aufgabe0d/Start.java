package aufgabe0d;

import java.io.IOException;
import utils.InputHelper;

public class Start {

  public static void main(String[] args) throws IOException{

  int note = InputHelper.readInt("input Ihre Note in Prozen");
  
  System.out.println("Ihre Note ist: " + Notenumrechnung.notenHashMap.get(note) + " Herzliche Glückwunsch");
    
    
  }

}
