package org.eclipse.swtbot.example;

import org.eclipse.swt.SWT;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class Test123 {
	
	private static SWTWorkbenchBot	bot;
	 
	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		System.out.println("Test123.............started");
		//bot.viewByTitle("Git").close();
		System.out.println("Test.............010");
	}
 
	@Test
	public void canClickOnGitPlugin() throws Exception {

		bot.toolbarButtonWithTooltip("Git Repo").click();
		bot.textWithLabel("User:*").setText("sanjeev");
		bot.textWithLabel("User:*").pressShortcut(SWT.SHIFT, '_');
		bot.textWithLabel("User:*").setText("sanjeev_kumar");
		bot.textWithLabel("User:*").pressShortcut(SWT.SHIFT, '@');
		bot.textWithLabel("User:*").setText("sanjeev_kumar@persistent.co.in");
		bot.textWithLabel("Password:*").setText("Ans16feb");
		bot.textWithLabel("Password:*").pressShortcut(SWT.SHIFT, '@');
		bot.textWithLabel("Password:*").setText("Ans16feb@4321");
		bot.button("Login").click();
	
		// FIXME: assert that the project is actually created, for later
	}
	
	@AfterClass
	public static void sleep() {
		System.out.println("Test");
		bot.sleep(2000);
		System.out.println("Testcompleted");
	}
 
}
