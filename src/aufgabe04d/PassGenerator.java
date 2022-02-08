package aufgabe04d;

import utils.InputHelper;

import java.util.Random;

public class PassGenerator {
    int passLength;
    String password;

    public PassGenerator setPassLength(int passLength) {
        this.passLength = passLength;
        return this;
    }

    public String generatePass() {
        StringBuffer passbuffer = new StringBuffer();

        do {

            new Random()
                    .ints(passLength, 33, 125)
                    .forEach(x -> passbuffer.append((char) x));
            password = passbuffer.toString();

        } while (!checkPassReq());

        return password;
    }

    public boolean checkPassReq() {
//        password.matches()
        return true;
    }
}
