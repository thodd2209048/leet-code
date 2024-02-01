package org.example;

public class Utils {
    public static String formatPackageName(String name) {
        return "_" + name.replace(" ", "").replace(".", "");
    }
}
