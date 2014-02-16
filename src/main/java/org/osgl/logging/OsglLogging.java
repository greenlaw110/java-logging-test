package org.osgl.logging;

/**
 * Created by luog on 16/02/14.
 */
public class OsglLogging implements LogTest {

    protected static Logger logger = L.get(Test.class);

    @Override
    public void test() {
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.fatal("fatal");
    }
}
