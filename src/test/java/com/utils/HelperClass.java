package com.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HelperClass {
    public static String readFile(String input) {
        String userDir = System.getProperty("user.dir");
        String content = "";
        try {
            content = new String ( Files.readAllBytes( Paths.get(userDir, "src","test","java","com","resources",input) ) );
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
