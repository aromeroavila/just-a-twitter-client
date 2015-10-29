package arao.jatc.controller.activities;

import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.annotation.Config;

import arao.jatc.BuildConfig;
import arao.jatc.R;
import arao.jatc.RobolectricTestRunner;
import arao.jatc.view.ui.SplashUi;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class SplashActivityTest {

    @Mock
    private SplashUi splashUi;

    @Mock
    private Bundle bundle;

    private SplashActivity splashActivity;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        splashActivity = new SplashActivity(splashUi);
    }

    @Test
    public void testActivityGetsLaunched() {
        assertThat(splashActivity).isNotNull();
    }

    @Test
    public void testOnCreateInitsUi() {
        splashActivity.onCreate(bundle);

        verify(splashUi).initialize(R.layout.splash_activity, splashActivity);
    }
}