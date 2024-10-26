package main.java.utils.interfaces;

import main.java.utils.impl.ConfigFileReader;

public interface IServiceUtils {
    public static String getPath(){
        return ConfigFileReader.getProperty("targetPath");
    }
}
