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
import arao.jatc.view.ui.LoginUi;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class LoginActivityTest {

    @Mock
    private LoginUi loginUi;

    private LoginActivity loginActivity;
    private org.robolectric.util.ActivityController<LoginActivity> activityController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        loginActivity = new LoginActivity(loginUi);
        activityController = ActivityController.of(Robolectric.getShadowsAdapter(), loginActivity);
    }

    @Test
    public void testActivityNotNull() {
        assertThat(loginActivity).isNotNull();
    }

    @Test
    public void testOnCreateInitsUi() {
        activityController.create().get();

        verify(loginUi).initialize(loginActivity);
    }

}