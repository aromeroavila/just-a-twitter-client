package arao.jatc.controller.activities;

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

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class SplashActivityTest {

    @Mock
    private SplashUi splashUi;

    private SplashActivity splashActivity;
    private org.robolectric.util.ActivityController<SplashActivity> activityController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        splashActivity = new SplashActivity(splashUi);
        activityController = ActivityController.of(Robolectric.getShadowsAdapter(), splashActivity);
    }

    @Test
    public void testActivityGetsLaunched() {
        assertThat(splashActivity).isNotNull();
    }

    @Test
    public void testOnCreateInitsUi() {
        splashActivity = activityController.create().get();

        verify(splashUi).initialize(splashActivity);
    }
}