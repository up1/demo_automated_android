package up1.gradecalculator;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import tools.fastlane.screengrab.Screengrab;
import tools.fastlane.screengrab.locale.LocaleTestRule;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @ClassRule
    public static final LocaleTestRule localeTestRule = new LocaleTestRule();

    @Rule
    public ActivityTestRule<MainActivity> mMainActivityTestRule
            = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void convert_score_80_should_display_grade_A() {
        Screengrab.screenshot("step_01");
        //Arrange
        onView(withId(R.id.score)).perform(typeText("80"));
        Screengrab.screenshot("step_02");

        //Act
        onView(withId(R.id.convertButton)).perform(click());
        Screengrab.screenshot("step_03");

        //Assert
        onView(withId(R.id.result)).check(matches(withText("You got grade A")));
        Screengrab.screenshot("step_04");
    }
}
