package arao.jatc.controller.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import arao.jatc.view.ui.SplashUi;

import static arao.jatc.view.ui.UiModule.splashUi;

public class SplashActivity extends Activity implements SplashActivityController {

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

        mSplashUi.initialize(this);
    }

    @Override
    public void onLoginButtonClicked() {
        Intent loginActivityIntent = new Intent(this, LoginActivity.class);
        startActivity(loginActivityIntent);
    }
}
