package functions;

import hooks.Hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Requests extends Hooks {

    protected String getProps(String prop) throws IOException {
            FileInputStream in = new FileInputStream("src/main/resources/config.properties");
            Properties props = new Properties();
            props.load(in);
            return props.getProperty(prop);

        }

}
