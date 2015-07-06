package acr.browser.lightning.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class test01 extends ActivityInstrumentationTestCase2 {
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
  	

    public test01() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

  	public void setUp() throws Exception {
        super.setUp();
		solo = new Solo(getInstrumentation());
		getActivity();
  	}
  
   	@Override
   	public void tearDown() throws Exception {
		try {
			solo.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		getActivity().finish();
		super.tearDown();
  	}

	public void testRun() {

        //Wait for activity: 'acr.browser.lightning.MainActivity'
		solo.waitForActivity("MainActivity", 2000);
        //Click on inner
		//solo.clickOnWebElement(By.className("inner"));
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 0));
        //Click on New Incognito Tab
		solo.clickInList(2, 0);
        //Wait for activity: 'acr.browser.lightning.IncognitoActivity'
		assertTrue("IncognitoActivity is not found!", solo.waitForActivity("IncognitoActivity"));
        //Click on Empty Text View
		solo.clickOnView(solo.getView("search"));
        //Enter the text: 'baidu.com'
		solo.clearEditText((android.widget.EditText) solo.getView("search"));
		solo.enterText((android.widget.EditText) solo.getView("search"), "baidu.com");
        //Press next button
		solo.pressSoftKeyboardNextButton();
        //Enter the text: 'https:www.baidu.com'
		solo.clearEditText((android.widget.EditText) solo.getView("search"));
		solo.enterText((android.widget.EditText) solo.getView("search"), "https://www.baidu.com");
        //Click on LinearLayout
		solo.clickOnView(solo.getView("arrow_button"));
        //Click on New Tab
		solo.clickOnView(solo.getView("new_tab_button"));
        //Click on Empty Text View
		solo.clickOnView(solo.getView("search"));
        //Enter the text: 'hello'
		solo.clearEditText((android.widget.EditText) solo.getView("search"));
		solo.enterText((android.widget.EditText) solo.getView("search"), "hello");
        //Press next button
		solo.pressSoftKeyboardNextButton();
        //Enter the text: 'https:www.google.com/search?client lightning&ie UTF-8&oe UTF-8&q hello'
		solo.clearEditText((android.widget.EditText) solo.getView("search"));
		solo.enterText((android.widget.EditText) solo.getView("search"), "https://www.google.com/search?client=lightning&ie=UTF-8&oe=UTF-8&q=hello");
        //Click on LinearLayout
		solo.clickOnView(solo.getView("arrow_button"));
        //Click on RelativeLayout
		solo.clickOnView(solo.getView("action_forward"));
        //Click on 百度一下
		solo.clickInList(1, 0);
        //Enter the text: 'https:www.baidu.com'
		solo.clearEditText((android.widget.EditText) solo.getView("search"));
		solo.enterText((android.widget.EditText) solo.getView("search"), "https://www.baidu.com");
        //Click on LinearLayout
		solo.clickOnView(solo.getView("arrow_button"));
        //Click on RelativeLayout
		solo.clickOnView(solo.getView("action_back"));
        //Click on RelativeLayout
		solo.clickOnView(solo.getView("action_forward"));
        //Enter the text: 'https:www.baidu.com'
		solo.clearEditText((android.widget.EditText) solo.getView("search"));
		solo.enterText((android.widget.EditText) solo.getView("search"), "https://www.baidu.com");
        //Click on RelativeLayout
		solo.clickOnView(solo.getView("action_back"));
        //Click on RelativeLayout
		solo.clickOnView(solo.getView("action_forward"));
        //Enter the text: 'https:www.baidu.com'
		solo.clearEditText((android.widget.EditText) solo.getView("search"));
		solo.enterText((android.widget.EditText) solo.getView("search"), "https://www.baidu.com");
        //Click on 百度一下
		solo.clickInList(1, 0);
        //Enter the text: 'https:www.baidu.com'
		solo.clearEditText((android.widget.EditText) solo.getView("search"));
		solo.enterText((android.widget.EditText) solo.getView("search"), "https://www.baidu.com");
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 0));
        //Click on New Tab
		solo.clickInList(1, 0);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 0));
        //Click on Share
		solo.clickInList(2, 0);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 0));
        //Click on Find in Page
		solo.clickInList(3, 0);
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Click on Empty Text View
		solo.clickOnView(solo.getView(android.widget.EditText.class, 0));
        //Enter the text: 'test '
		solo.clearEditText((android.widget.EditText) solo.getView(android.widget.EditText.class, 0));
		solo.enterText((android.widget.EditText) solo.getView(android.widget.EditText.class, 0), "test");
        //Click on Search
		solo.clickOnView(solo.getView(android.R.id.button1));
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 0));
        //Click on Bookmarks
		solo.clickInList(5, 0);
        //Click on Bookmarks
		solo.clickOnView(solo.getView("bookmark_title"));
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 0));
        //Click on Bookmarks
		solo.clickInList(5, 0);
        //Click on Bookmarks
		solo.clickOnView(solo.getView("bookmark_title"));
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 0));
        //Click on History
		solo.clickInList(4, 0);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 0));
        //Click on Bookmarks
		solo.clickInList(5, 0);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 0));
        //Click on ImageView
		solo.clickOnView(solo.getView("button_quit"));
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 0));
        //Click on LinearLayout
		solo.clickOnView(solo.getView("arrow_button"));
        //Click on ImageView
		solo.clickOnView(solo.getView("deleteButton", 1));
        //Enter the text: 'https:www.baidu.com'
		solo.clearEditText((android.widget.EditText) solo.getView("search"));
		solo.enterText((android.widget.EditText) solo.getView("search"), "https://www.baidu.com");
        //Click on LinearLayout
		solo.clickOnView(solo.getView("arrow_button"));
        //Click on ImageView
		solo.clickOnView(solo.getView("deleteButton"));
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 0));
        //Click on Settings
		solo.clickInList(10, 0);
        //Wait for activity: 'acr.browser.lightning.SettingsActivity'
		assertTrue("SettingsActivity is not found!", solo.waitForActivity("SettingsActivity"));
        //Click on Enable Adobe Flash
		solo.clickOnView(solo.getView("layoutFlash"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Click on OK
		solo.clickOnView(solo.getView(android.R.id.button1));
        //Click on Auto
		solo.clickOnView(solo.getView(android.R.id.button2));
        //Click on Block Ads
		solo.clickOnView(solo.getView("layoutAdBlock"));
        //Click on Block Images
		solo.clickOnView(solo.getView("layoutImages"));
        //Click on Empty Text View
		solo.clickOnView(solo.getView("cbAdblock"));
        //Click on Block Images
		solo.clickOnView(solo.getView("layoutImages"));
        //Click on Enable JavaScript
		solo.clickOnView(solo.getView("layoutEnableJS"));
        //Click on Enable Orbot
		solo.clickOnView(solo.getView("layoutUseOrbot"));
        //Click on Enable JavaScript
		solo.clickOnView(solo.getView("layoutEnableJS"));
        //Click on General Settings
		solo.clickOnView(solo.getView("layoutGeneral"));
        //Wait for activity: 'acr.browser.lightning.GeneralSettingsActivity'
		assertTrue("GeneralSettingsActivity is not found!", solo.waitForActivity("GeneralSettingsActivity"));
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Click on Advanced Settings
		solo.clickOnView(solo.getView("layoutAdvanced"));
        //Wait for activity: 'acr.browser.lightning.AdvancedSettingsActivity'
		assertTrue("AdvancedSettingsActivity is not found!", solo.waitForActivity("AdvancedSettingsActivity"));
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Click on About Details about version, author and license.
		solo.clickOnView(solo.getView("layoutAbout"));
        //Wait for activity: 'acr.browser.lightning.AboutSettingsActivity'
		assertTrue("AboutSettingsActivity is not found!", solo.waitForActivity("AboutSettingsActivity"));
        //Click on Contact Me twitter.com/RestainoAnthony
		solo.clickOnView(solo.getView("layoutSource"));
        //Enter the text: 'http:twitter.com/RestainoAnthony'
		solo.clearEditText((android.widget.EditText) solo.getView("search"));
		solo.enterText((android.widget.EditText) solo.getView("search"), "http://twitter.com/RestainoAnthony");
        //Press menu back key
		solo.goBack();

	}
}
