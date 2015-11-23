package org.eclipse.swtbot.example;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.finders.ContextMenuHelper;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CopyOfCommittest {

	private static SWTWorkbenchBot	bot;
	 
	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		System.out.println("Commit Test.............started");
		
	}
 
//	@Test
//	public void canCommitTest() throws Exception {
//
//			System.out.println("inside Commit Test.............started");
//			bot.menu("Window").menu("Show View").menu("Other...").click();
//			System.out.println("show view other clciked.............");
//			bot.tree().getTreeItem("Git").getNode("Git Repositories").select("");
//			System.out.println("get node selected.............");
//			bot.button("OK").click();
//			bot.tree().getTreeItem("/helloWorldTest [head] - C:/Users/sanjeev_kumar/git/helloWorldTest/.git").expand();
//			bot.tree().getTreeItem("/helloWorldTest [head] - C:/Users/sanjeev_kumar/git/helloWorldTest/.git").select();
//			bot.menu("Commit...").click();
//			bot.styledText().setText("commiting new commit test");
//			bot.tree().getTreeItem("").select();
//			bot.tree().getTreeItem("").select();
//			bot.button("Commit and Push").click();
//			bot.button("OK").click();
//		
//		
//			System.out.println("Commit Test.............push and click");
//	}
	
	@Test

		public void test11(){
			bot.viewByTitle("Welcome").close();
			System.out.println("1");
			bot.menu("Window").menu("Show View").menu("Other...").click();
			System.out.println("2");
			bot.text().setText("git repositories");
			System.out.println("3");
			bot.button("OK").click();
			System.out.println("4");
			//bot.menu("Window").menu("Customize Perspective...").click();
			//bot.tabItem("Command Groups Availability").activate();
			//bot.button("OK").click();
			bot.toolbarButtonWithTooltip("Add an existing local Git Repository to this view").click();
			System.out.println("5");
			bot.toolbarButtonWithTooltip("Check All Repositories").click();
			System.out.println("6");
			bot.button("Finish").click();
			System.out.println("7");
			sleep();
			bot.tree().getTreeItem("> helloWorldTest [origin/head bd0e566] - C:\\Users\\rajesh_kumarvg\\git\\helloWorldTest\\.git").select();
			System.out.println("8");
			sleep();
			//bot.contextMenu("Import Projects...").click();
			SWTBotMenu menu =
		            new SWTBotMenu(ContextMenuHelper.contextMenu(bot.tree(), "Import Projects..."));
			System.out.println("9");
			menu.click();
			sleep();
			System.out.println("10");
			bot.button("Next >").click();
			System.out.println("11");
			bot.button("Finish").click();
			System.out.println("12");
			sleep();
			sleep();
			sleep();
			sleep();
			sleep();
			sleep();
		}
	
	
	
	@AfterClass
	public static void sleep() {
		System.out.println("Test");
		bot.sleep(2000);
		System.out.println("Testcompleted");
	}

}
