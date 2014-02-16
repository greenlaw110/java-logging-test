package org.osgl.logging;

import org.osgl._;

/**
 * Created by luog on 16/02/14.
 */
public class Test {
    protected static Logger logger = L.get(Test.class);
    public static void main(String[] args) {
        logger.info("Start main test");
        new OsglLogging().test();
        try {
            LogTest test = _.newInstance("org.osgl.logging.CommonsLogging");
            test.test();
        } catch (Throwable throwable) {
            // ignore
        }
    }
}
