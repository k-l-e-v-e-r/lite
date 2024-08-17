package ork.utils;

public final class Utils {

    public static String getValueOrDefault(String val, String def) {
        return val != null ? val : def;
    }

    private Utils() {
    }
}
