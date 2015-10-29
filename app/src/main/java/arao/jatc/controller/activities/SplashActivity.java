package arao.jatc.controller.activities;

import android.app.Activity;
import android.os.Bundle;

import arao.jatc.R;
import arao.jatc.view.ui.SplashUi;

import static arao.jatc.view.ui.UiModule.splashUi;

public class SplashActivity extends Activity implements ActivityController {

    private final SplashUi mSplashUi;

    @SuppressWarnings("unused")
    public SplashActivity() {
        this(splashUi());
    }

    SplashActivity(SplashUi splashUi) {
        mSplashUi = splashUi;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mSplashUi.initialize(R.layout.splash_activity, this);
    }
}
