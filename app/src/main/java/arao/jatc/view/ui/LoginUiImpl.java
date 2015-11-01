package arao.jatc.view.ui;

import android.view.View;

import arao.jatc.R;
import arao.jatc.controller.activities.LoginController;

class LoginUiImpl implements LoginUi, View.OnClickListener {

    private LoginController mLoginController;

    @Override
    public void initialize(LoginController loginController) {
        mLoginController = loginController;

        loginController.setContentView(R.layout.login_activity);
        View mLoginButton = loginController.findViewById(R.id.login_login_button);
        mLoginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.login_login_button) {
            mLoginController.onLoginButtonClicked();
        }
    }
}
