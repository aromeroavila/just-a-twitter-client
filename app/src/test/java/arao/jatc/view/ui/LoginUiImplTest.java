package arao.jatc.view.ui;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.annotation.Config;

import arao.jatc.BuildConfig;
import arao.jatc.R;
import arao.jatc.RobolectricTestRunner;
import arao.jatc.controller.activities.ActivityController;

import static org.mockito.Mockito.verify;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class LoginUiImplTest {

    @Mock
    private ActivityController activityController;

    private LoginUiImpl loginUi;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        loginUi = new LoginUiImpl();

        loginUi.initialize(activityController);
    }

    @Test
    public void testInitialize() throws Exception {
        verify(activityController).setContentView(R.layout.login_activity);
    }

}