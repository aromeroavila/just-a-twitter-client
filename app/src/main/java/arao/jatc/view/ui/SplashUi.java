package arao.jatc.view.ui;

import android.support.annotation.LayoutRes;

import arao.jatc.controller.activities.ActivityController;

/**
 * Ui element for the Splash Screen
 */
public interface SplashUi {

    void initialize(@LayoutRes int layoutRes, ActivityController activityController);
}
