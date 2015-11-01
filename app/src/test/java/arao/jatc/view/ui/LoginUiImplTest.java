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
public class LoginUiImplTest {

    @Mock
    private LoginController loginController;

    @Mock
    private View view;

    private LoginUiImpl loginUi;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        when(loginController.findViewById(R.id.login_login_button)).thenReturn(view);

        loginUi = new LoginUiImpl();
        loginUi.initialize(loginController);
    }

    @Test
    public void testInitialize() {
        verify(loginController).setContentView(R.layout.login_activity);
    }

    @Test
    public void testOnClickLoginButton() {
        when(view.getId()).thenReturn(R.id.login_login_button);

        loginUi.onClick(view);

        verify(loginController).onLoginButtonClicked();
    }

    @Test
    public void testOnClickRandomView() {
        when(view.getId()).thenReturn(123);

        loginUi.onClick(view);

        verify(loginController, never()).onLoginButtonClicked();
    }

}