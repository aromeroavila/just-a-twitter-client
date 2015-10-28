package arao.jatc.controller.activities;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import arao.jatc.RobolectricTestRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(RobolectricTestRunner.class)
public class SplashActivityTest {

    private SplashActivity splashActivity;

    @Before
    public void setUp() {
        splashActivity = new SplashActivity();
    }

    @Test
    public void testActivityGetsLaunched() {
        assertThat(splashActivity).isNotNull();
    }
}