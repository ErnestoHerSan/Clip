package com.clip.main;

import java.io.File;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.clip.webTest.TestAdvancedControls;
import com.clip.webTest.TestDynamicControls;
import com.clip.webTest.TestSelectors;

@RunWith(Suite.class)

@SuiteClasses({TestDynamicControls.class,TestAdvancedControls.class,TestSelectors.class})

public class SuiteUiTest {

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "driver" + File.separator + "chromedriver");
	} 

}
 