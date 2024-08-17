package ork.utils;

public final class Descriptor {

    private static final String DEFAULT_APP_NAME = "=L-I-T-E=";
    private static final String DEFAULT_APP_VERSION = "UNKNOWN";

    public static String appName;
    public static String appVersion;

    public static void initAppDescription() {
        Package pkg = Descriptor.class.getPackage();
        appName = Utils.getValueOrDefault(pkg.getImplementationTitle(), DEFAULT_APP_NAME);
        appVersion = Utils.getValueOrDefault(pkg.getImplementationVersion(), DEFAULT_APP_VERSION);
    }

    private Descriptor() {
    }
}
