package arao.jatc.view.ui;

/**
 * Creates instances of the UI components so they can be used by the controllers.
 * Used for dependency injection
 */
public class UiModule {

    public static SplashUi splashUi() {
        return new SplashUiImpl();
    }
}
