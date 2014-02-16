package org.osgl.logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by luog on 16/02/14.
 */
public class CommonsLogging implements LogTest {
    protected static Log logger = LogFactory.getLog(CommonsLogging.class);

    public void test() {
        System.out.println("----- commons logging ----");
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.fatal("fatal");
    }
}
