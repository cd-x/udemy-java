package main.java.utils.impl;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigFileReader {
    private static Properties properties;
    private static final String PATH = "src/main/resources/config.properties";
    static {
        try(FileInputStream fileInputStream = new FileInputStream(PATH)){
            properties = new Properties();
            properties.load(fileInputStream);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
