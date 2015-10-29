package arao.jatc.view.ui;

import android.support.annotation.LayoutRes;

import arao.jatc.controller.activities.ActivityController;

public class SplashUiImpl implements SplashUi {

    @Override
    public void initialize(@LayoutRes int layoutRes, ActivityController activityController) {
        activityController.setContentView(layoutRes);
    }
}
