package com.TestRunner;

import com.TestBase.TestBase;
import com.keywordEngine.KeywordEngine;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TestBase base = new TestBase();
    base.execute("OpenBrowser", "NA", "NA", "openBrowser", "chrome");
	KeywordEngine ke = new KeywordEngine();
	ke.ReadData();
	
	}

}
