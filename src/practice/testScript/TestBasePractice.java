package practice.testScript;

import java.io.IOException;

import practice.pages.WikipediaHomePage;
import practice.pages.WikipediaSearchPage;

public class TestBasePractice{
	
	public WikipediaSearchPage gotoWikipediaPage() throws IOException {
		WikipediaSearchPage searchPage= WikipediaSearchPage.getInstance();
		return searchPage;
	}
	
	public WikipediaHomePage gotoWikipediaHomePage(){
		WikipediaHomePage homePage=new WikipediaHomePage();
		return homePage;
	}
}
