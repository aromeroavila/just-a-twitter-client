package arao.jatc.view.ui;

import arao.jatc.R;
import arao.jatc.controller.activities.ActivityController;

public class SplashUiImpl implements SplashUi {

    @Override
    public void initialize(ActivityController activityController) {
        activityController.setContentView(R.layout.splash_activity);
    }
}
