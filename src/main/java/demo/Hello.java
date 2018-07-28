package demo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Hello {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        try (InputStream input = readPropertiesFile()) {
            properties.load(input);
        }
        String name = properties.getProperty("name");
        System.out.println("Hello, " + name + "!");
    }

    private static InputStream readPropertiesFile() {
        return Hello.class.getClassLoader().getResourceAsStream("config.properties");
    }

}
