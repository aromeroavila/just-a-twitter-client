package arao.jatc.view.ui;

import arao.jatc.R;
import arao.jatc.controller.activities.ActivityController;

class LoginUiImpl implements LoginUi {

    @Override
    public void initialize(ActivityController activityController) {
        activityController.setContentView(R.layout.login_activity);
    }
}
