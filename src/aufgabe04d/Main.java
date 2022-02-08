package aufgabe04d;

import utils.InputHelper;

public class Main {
    public static void main(String[] args) {

        String password = new PassGenerator()
                .setPassLength(InputHelper.readInt("Enter Lenght of password"))
                .generatePass();

        System.out.println(password);

    }
}
