import org.apache.log4j.Logger;
import org.apache.log4j.Level;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        logger.setLevel(Level.DEBUG);
    }
}
