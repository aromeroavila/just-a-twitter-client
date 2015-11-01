package arao.jatc.controller.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import arao.jatc.view.ui.LoginUi;

import static arao.jatc.view.ui.UiModule.loginUi;

public class LoginActivity extends AppCompatActivity implements ActivityController {

    private final LoginUi mLoginUi;

    @SuppressWarnings("unused")
    public LoginActivity() {
        this(loginUi());
    }

    LoginActivity(LoginUi loginUi) {
        mLoginUi = loginUi;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mLoginUi.initialize(this);
    }
}
