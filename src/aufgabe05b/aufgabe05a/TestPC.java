package aufgabe05b.aufgabe05a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class TestPC {
    static Logger logger = LoggerFactory.getLogger(TestPC.class);

    public static void main(String[] args) {
        List<PC> pcList = new ArrayList<>();
        pcList.add(new PC("1", Processor.getInstance(), RAM.getInstance(), Festplatte.getInstance()));
        pcList.add(new PC("2", Processor.getInstance(), RAM.getInstance(), Festplatte.getInstance()));
        pcList.add(new PC("3", Processor.getInstance(), RAM.getInstance(), Festplatte.getInstance()));

        pcList.stream()
                .peek(pc -> logger.info("{} - {}", pc.bezeichung, pc.zustand))
                .peek(PC::starten)
                .peek(pc -> logger.info("{}", pc.zustand))
                .peek(PC::runterfahren)
                .forEach(pc -> logger.info("{}", pc.zustand));

        logger.info("end");

    }


}
