package arao.jatc.view.ui;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.robolectric.annotation.Config;

import arao.jatc.BuildConfig;
import arao.jatc.R;
import arao.jatc.RobolectricTestRunner;
import arao.jatc.controller.activities.ActivityController;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class SplashUiImplTest {

    @Mock
    private ActivityController activityController;

    private SplashUiImpl splashUi;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        splashUi = new SplashUiImpl();
    }

    @Test
    public void testInitialize() throws Exception {
        splashUi.initialize(activityController);

        Mockito.verify(activityController).setContentView(R.layout.splash_activity);
    }
}