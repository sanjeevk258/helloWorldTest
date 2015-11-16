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

		System.out.println("inside Commit Test.............");
		//bot.toolbarButtonWithTooltip("Git").click();

			bot.menu("Window").menu("Show View").menu("Other...").click();
			System.out.println("inside show view menu.............");
			
//			SWTBotShell shell = bot.shell("Window");
//			shell.activate();
			
			bot.tree().expandNode("Git").select("Git Repositories");
//			bot.button("Next >").click();
//			bot.tree().getTreeItem("Git").getNode("Git Repositories").select();
			System.out.println("inside selecting git repository from view.............");
			bot.button("OK").click();
		
			bot.viewByTitle("Git Repositories").show();
			bot.tree().getTreeItem("helloWorldTest [head] - C:/Users/sanjeev_kumar/git/helloWorldTest/.git").select();
			bot.menu("Commit...").click();
			bot.styledText().setText("udapting comit test 123");
			bot.tree().getTreeItem("").select();
			bot.button("Commit and Push").click();
		
			System.out.println("Commit Test.............push and click");
	}
	
	@AfterClass
	public static void sleep() {
		System.out.println("Test");
		bot.sleep(2000);
		System.out.println("Testcompleted");
	}

}
