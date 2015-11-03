package org.eclipse.swtbot.example;

import static org.junit.Assert.*;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SWTBotJunit4ClassRunner.class)
public class Myfirsttest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	private static SWTWorkbenchBot	bot;
	 
	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		System.out.println("Test.............0");
		bot.viewByTitle("Welcome").close();
		System.out.println("Test.............010");
	}
 
 
	@Test
	public void canCreateANewJavaProject() throws Exception {
		bot.menu("File").menu("New").menu("Project...").click();
 
		SWTBotShell shell = bot.shell("New Project");
		shell.activate();
		bot.tree().expandNode("Java").select("Java Project");
		bot.button("Next >").click();
		System.out.println("Test.............1");
 
		bot.textWithLabel("Project name:").setText("MyFirstProject");
        
		bot.button("Finish").click();
		bot.waitUntil(Conditions.shellIsActive("Open Associated Perspective?"));
		bot.button("Yes").click();
		System.out.println("Test.............c21");
		System.out.println("Test.............2");
		// FIXME: assert that the project is actually created, for later
	}
 
 
	@AfterClass
	public static void sleep() {
		System.out.println("Test");
		bot.sleep(2000);
		System.out.println("Testcompleted");
	}

}
