package mytestarea.OA;

public class Start {

  public static void main(String[] args) {
    
    BMI myBMI = new BMI(
            InputHelper.intScanner("Geben Sie, bitte, Gewicht in kg ein"),
            InputHelper.intScanner("Geben Sie, bitte, Ihr Größe in cm ein")
            
    );
    
    myBMI.recomendations();
    
  }

}
