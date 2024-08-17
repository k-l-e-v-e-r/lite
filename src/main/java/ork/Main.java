package ork;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ork.proc.Processor;
import ork.utils.Descriptor;

public final class Main {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Descriptor.initAppDescription();
        Processor.work();
        LOG.info("Application [{}] v{} started successfully.",
                Descriptor.appName, Descriptor.appVersion);
    }
}
