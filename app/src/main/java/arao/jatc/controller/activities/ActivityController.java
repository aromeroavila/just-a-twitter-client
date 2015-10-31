package arao.jatc.controller.activities;

import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.view.View;

/**
 * Provides a mechanism to decouple the view operations from the {@link android.app.Activity}
 * controllers
 */
public interface ActivityController {

    void setContentView(@LayoutRes int layoutRes);

    View findViewById(@IdRes int id);
}
