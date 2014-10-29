package com.peaceful.util.impl;

import com.peaceful.util.AppConfigs;
import com.peaceful.util.Util;
import junit.framework.TestCase;

public class MyAppConfigsTest extends TestCase {

    AppConfigs myAppConfigs = null;
    AppConfigs myAppConfigs_ = null;
    public void setUp() throws Exception {
        myAppConfigs = AppConfigsImpl.getMyAppConfigs("auth.properties");
        myAppConfigs_ = AppConfigsImpl.getMyAppConfigs("auth2.properties");

    }

    public void testGetString() throws Exception {

        Util.report(myAppConfigs.toMap().size()+"");
        Util.report(myAppConfigs_.toMap().size()+"");
    }
}