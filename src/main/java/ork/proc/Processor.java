package ork.proc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Processor {

    private static final Logger LOG = LoggerFactory.getLogger(Processor.class);

    public static void work() {
        LOG.info("-----start-----");
        LOG.info("some heavy processing...");
        LOG.info("-----finish-----\n");
    }

    private Processor() {
    }
}
