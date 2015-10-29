package arao.jatc.controller.activities;

import android.support.annotation.LayoutRes;

/**
 * Provides a mechanism to decouple the view operations from the {@link android.app.Activity}
 * controllers
 */
public interface ActivityController {

    void setContentView(@LayoutRes int layoutRes);
}
