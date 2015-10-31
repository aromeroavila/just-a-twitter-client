package arao.jatc.view.ui;

import android.view.View;

import arao.jatc.R;
import arao.jatc.controller.activities.SplashActivityController;

public class SplashUiImpl implements SplashUi, View.OnClickListener {

    private SplashActivityController mSplashActivityController;

    @Override
    public void initialize(SplashActivityController splashActivityController) {
        mSplashActivityController = splashActivityController;

        splashActivityController.setContentView(R.layout.splash_activity);
        View loginButton = splashActivityController.findViewById(R.id.log_in_button);
        loginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        mSplashActivityController.onLoginButtonClicked();
    }
}
