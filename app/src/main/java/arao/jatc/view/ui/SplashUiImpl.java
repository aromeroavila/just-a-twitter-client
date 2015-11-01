package arao.jatc.view.ui;

import android.view.View;

import arao.jatc.R;
import arao.jatc.controller.activities.LoginController;

class SplashUiImpl implements SplashUi, View.OnClickListener {

    private LoginController mLoginController;

    @Override
    public void initialize(LoginController loginController) {
        mLoginController = loginController;

        loginController.setContentView(R.layout.splash_activity);
        View loginButton = loginController.findViewById(R.id.splash_login_button);
        loginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.splash_login_button) {
            mLoginController.onLoginButtonClicked();
        }
    }
}
