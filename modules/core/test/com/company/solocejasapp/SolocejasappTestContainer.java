package com.company.solocejasapp;

import com.haulmont.cuba.testsupport.TestContainer;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.util.ArrayList;
import java.util.Arrays;

public class SolocejasappTestContainer extends TestContainer {

    public SolocejasappTestContainer() {
        super();
        //noinspection ArraysAsListWithZeroOrOneArgument
        appComponents = Arrays.asList(
                "com.haulmont.cuba",
                "com.haulmont.addon.helium",
                "com.haulmont.addon.restapi",
                "org.strangeway.responsive",
                "com.haulmont.addon.admintools",
                "com.haulmont.addon.emailtemplates",
                "com.haulmont.addon.grapesjs",
                "de.diedavids.cuba.loggable",
                "de.diedavids.cuba.wizard");
        appPropertiesFiles = Arrays.asList(
                // List the files defined in your web.xml
                // in appPropertiesConfig context parameter of the core module
                "com/company/solocejasapp/app.properties",
                // Add this file which is located in CUBA and defines some properties
                // specifically for test environment. You can replace it with your own
                // or add another one in the end.
                "com/company/solocejasapp/test-app.properties");
        autoConfigureDataSource();
    }

    

    public static class Common extends SolocejasappTestContainer {

        public static final SolocejasappTestContainer.Common INSTANCE = new SolocejasappTestContainer.Common();

        private static volatile boolean initialized;

        private Common() {
        }

        @Override
        public void beforeAll(ExtensionContext extensionContext) throws Exception {
            if (!initialized) {
                super.beforeAll(extensionContext);
                initialized = true;
            }
            setupContext();
        }
        

        @SuppressWarnings("RedundantThrows")
        @Override
        public void afterAll(ExtensionContext extensionContext) throws Exception {
            cleanupContext();
            // never stops - do not call super
        }
        
    }
}