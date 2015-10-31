package arao.jatc.view.ui;

import android.view.View;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.annotation.Config;

import arao.jatc.BuildConfig;
import arao.jatc.R;
import arao.jatc.RobolectricTestRunner;
import arao.jatc.controller.activities.SplashActivityController;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class SplashUiImplTest {

    @Mock
    private SplashActivityController splashActivityController;

    @Mock
    private View loginButton;

    private SplashUiImpl splashUi;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        splashUi = new SplashUiImpl();
        when(splashActivityController.findViewById(R.id.log_in_button)).thenReturn(loginButton);

        splashUi.initialize(splashActivityController);
    }

    @Test
    public void testInitialize() throws Exception {
        verify(splashActivityController).setContentView(R.layout.splash_activity);
    }

    @Test
    public void onClickLogInLaunchesActivity() {
        splashUi.onClick(loginButton);

        verify(splashActivityController).onLoginButtonClicked();
    }
}