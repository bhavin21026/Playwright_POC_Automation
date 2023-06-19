package com.shaip.base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseTestShaip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Playwright playwright = Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://qaenterprise.shaip.com/");
		System.out.println("page.url"+page.url());
		System.out.println("page.title"+page.title());

		page.close();
		playwright.close();
		
		
	}

}
