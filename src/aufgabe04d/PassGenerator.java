package aufgabe04d;

import java.util.Random;

public class PassGenerator {
    int passLength;
    String password;

    public PassGenerator setPassLength(int passLength) {
        this.passLength = passLength;
        return this;
    }

    public String generateAndCheckPass() {

        do {
            StringBuffer passbuffer = new StringBuffer();

            new Random()
                    .ints(passLength, 33, 125)
                    .forEach(x -> passbuffer.append((char) x));
            password = passbuffer.toString();

        } while (!checkPassReq(password));

        return password;
    }

    /*private*/public static boolean checkPassReq(String password) {
        return password.matches(".*[A-Z]+.*[\\d]+.*\\W+.*");
    }
}
