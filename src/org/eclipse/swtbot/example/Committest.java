package org.eclipse.swtbot.example;

import static org.junit.Assert.*;

import org.eclipse.swt.SWT;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Committest {

	private static SWTWorkbenchBot	bot;
	 
	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		System.out.println("Commit Test.............started");
		
	}
 
	@Test
	public void canCommitTest() throws Exception {

		System.out.println("inside Commit Test.............started");
			bot.menu("Window").menu("Show View").menu("Other...").click();
			System.out.println("show view other clciked.............");
			bot.tree().getTreeItem("Git").getNode("Git Repositories").select("");
			System.out.println("get node selected.............");
			bot.button("OK").click();
			bot.tree().getTreeItem("/helloWorldTest [head] - C:/Users/sanjeev_kumar/git/helloWorldTest/.git").expand();
			bot.tree().getTreeItem("/helloWorldTest [head] - C:/Users/sanjeev_kumar/git/helloWorldTest/.git").select();
			bot.menu("Commit...").click();
			bot.styledText().setText("commiting new commit test");
			bot.tree().getTreeItem("").select();
			bot.tree().getTreeItem("").select();
			bot.button("Commit and Push").click();
			bot.button("OK").click();
		
		
			System.out.println("Commit Test.............push and click");
	}
	
	@AfterClass
	public static void sleep() {
		System.out.println("Test");
		bot.sleep(2000);
		System.out.println("Testcompleted");
	}

}
