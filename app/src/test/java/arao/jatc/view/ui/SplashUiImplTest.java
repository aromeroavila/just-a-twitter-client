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
import arao.jatc.controller.activities.LoginController;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class SplashUiImplTest {

    @Mock
    private LoginController loginController;

    @Mock
    private View loginButton;

    private SplashUiImpl splashUi;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        splashUi = new SplashUiImpl();
        when(loginController.findViewById(R.id.splash_login_button)).thenReturn(loginButton);

        splashUi.initialize(loginController);
    }

    @Test
    public void testInitialize() {
        verify(loginController).setContentView(R.layout.splash_activity);
    }

    @Test
    public void testOnClickLoginButton() {
        when(loginButton.getId()).thenReturn(R.id.splash_login_button);

        splashUi.onClick(loginButton);

        verify(loginController).onLoginButtonClicked();
    }

    @Test
    public void testOnClickRandomView() {
        when(loginButton.getId()).thenReturn(123);

        splashUi.onClick(loginButton);

        verify(loginController, never()).onLoginButtonClicked();
    }
}