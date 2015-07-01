package acr.browser.lightning.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.By;
import com.robotium.solo.Solo;

/**
 * Created by pcheng on 15-6-25.
 */
public class TestAddressBar extends ActivityInstrumentationTestCase2{

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
        public TestAddressBar() throws ClassNotFoundException {
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
            solo.clickOnView(solo.getView("search"));
            //Enter the text: 'baidu.com'
            solo.clearEditText((android.widget.EditText) solo.getView("search"));
            solo.enterText((android.widget.EditText) solo.getView("search"), "baidu.com");
            //Press next button
            solo.pressSoftKeyboardSearchButton();
                   // .pressSoftKeyboardNextButton();

            solo.pressSoftKeyboardSearchButton();

            solo.clickOnWebElement(By.id("index-kw"));
            solo.sleep(3000);

            solo.enterTextInWebElement(By.id("index-kw"), "new start");
            solo.clickOnWebElement(By.id("index-bn"));
            solo.sleep(3000);

            //assertTrue(solo.searchText(String.valueOf()));

        }

}
