package arao.jatc.controller.activities;

import android.content.Intent;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;

import arao.jatc.BuildConfig;
import arao.jatc.RobolectricTestRunner;
import arao.jatc.view.ui.SplashUi;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class SplashActivityTest {

    @Mock
    private SplashUi splashUi;

    private SplashActivity splashActivity;
    private ActivityController<SplashActivity> activityController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        splashActivity = new SplashActivity(splashUi);
        activityController = ActivityController.of(Robolectric.getShadowsAdapter(), splashActivity);
    }

    @Test
    public void testActivityNotNull() {
        assertThat(splashActivity).isNotNull();
    }

    @Test
    public void testOnCreateInitsUi() {
        activityController.create().get();

        verify(splashUi).initialize(splashActivity);
    }

    @Test
    public void testOnLoginButtonClicked() {
        splashActivity.onLoginButtonClicked();

        Intent nextStartedActivity = shadowOf(splashActivity).getNextStartedActivity();
        assertThat(nextStartedActivity.getComponent().getClassName())
                .isEqualTo(LoginActivity.class.getName());
    }
}