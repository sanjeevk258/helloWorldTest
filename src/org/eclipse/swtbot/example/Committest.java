package org.eclipse.swtbot.example;

import static org.junit.Assert.*;

import org.eclipse.swt.SWT;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Committest {

	private static SWTWorkbenchBot	bot;
	 
	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		System.out.println("Test123.............started");
		//bot.viewByTitle("Git").close();
		System.out.println("Test.............010");
	}
 
	@Test
	public void canCommitTest() throws Exception {

		bot.toolbarButtonWithTooltip("Git").click();

		
			bot.viewByTitle("Git Repositories").show();
			bot.tree().getTreeItem("helloWorldTest [head] - C:/Users/sanjeev_kumar/git/helloWorldTest/.git").select();
			bot.contextMenu("Commit...").click();
			bot.styledText().setText("udapting comit test");
			bot.tree().getTreeItem("").select();
			bot.button("Commit and Push").click();
		
	}
	
	@AfterClass
	public static void sleep() {
		System.out.println("Test");
		bot.sleep(2000);
		System.out.println("Testcompleted");
	}

}
