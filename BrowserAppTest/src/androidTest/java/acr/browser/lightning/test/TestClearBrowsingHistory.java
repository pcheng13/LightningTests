package acr.browser.lightning.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.By;
import com.robotium.solo.Solo;
import com.squareup.spoon.Spoon;

/**
 * Created by pcheng on 15-6-25.
 */
public class TestClearBrowsingHistory extends ActivityInstrumentationTestCase2 {

    private Solo solo;
    private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "acr.browser.lightning.MainActivity";
    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public TestClearBrowsingHistory() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation());
        getActivity();
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
    }

    public void testRun() {
        //Wait for activity: 'acr.browser.lightning.MainActivity'
        solo.waitForActivity("MainActivity", 2000);

        solo.clickOnView(solo.getView("search"));
        //Enter the text: 'baidu.com'
        solo.clearEditText((android.widget.EditText) solo.getView("search"));
        solo.enterText((android.widget.EditText) solo.getView("search"), "baidu.com");
        //Press next button
        solo.pressSoftKeyboardSearchButton();
        // .pressSoftKeyboardNextButton();
        solo.sleep(3000);
        Spoon.screenshot(solo.getCurrentActivity(),"SearchPage");

        //Click on ImageView
        solo.clickOnView(solo.getView(android.widget.ImageView.class, 0));
        //Click on History
        solo.clickOnText("History");
        solo.sleep(1000);
        Spoon.screenshot(solo.getCurrentActivity(), "History_beforeclear");
        assertTrue(solo.searchText("https://www.baidu.com/"));

        //Click on ImageView
        solo.clickOnView(solo.getView(android.widget.ImageView.class, 0));
        //Click on Settings
        assertTrue(solo.searchText("Settings"));
        solo.clickOnText("Settings");
        //click on Privacy Settings
        assertTrue(solo.searchText("Privacy Settings"));
        //solo.clickOnView(solo.getView("textView9"));
        solo.clickOnText("Privacy Settings");
        //click on Clear history
        assertTrue(solo.searchText("Clear history"));
        solo.clickOnView(solo.getView("rClearHistory"));
        //Wait for dialog
        solo.waitForDialogToOpen(2000);
        assertTrue(solo.searchText("Clear History"));
        solo.clickOnButton("Yes");

        //Click on backward arrow
        solo.clickOnView(solo.getView(android.widget.ImageView.class, 0));
        //Click on backward arrow
        solo.clickOnView(solo.getView(android.widget.ImageView.class, 0));

        //Click on ImageView
        solo.clickOnView(solo.getView(android.widget.ImageView.class, 0));
        //Click on History
        solo.clickInList(4, 0);
        solo.sleep(1000);
        assertFalse(solo.searchText("https://www.baidu.com/"));
        Spoon.screenshot(solo.getCurrentActivity(), "History_afterclear");
    }

}