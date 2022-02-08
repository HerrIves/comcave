package aufgabe04d;

import utils.InputHelper;

import static aufgabe04d.PassGenerator.checkPassReq;

public class Main {
    public static void main(String[] args) {

        String password =
                new PassGenerator()
                        .setPassLength(InputHelper.readInt("Enter Lenght of password"))
                        .generateAndCheckPass();

        System.out.println(password);

    }
}
