package arao.jatc;

import android.os.Build;

import org.junit.runners.model.InitializationError;
import org.robolectric.annotation.Config;
import org.robolectric.manifest.AndroidManifest;

public class RobolectricTestRunner extends org.robolectric.RobolectricGradleTestRunner {

    private static final int TEST_TARGET_SDK_VERSION = Build.VERSION_CODES.LOLLIPOP;

    public RobolectricTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }

    @Override
    protected int pickSdkVersion(Config config, AndroidManifest appManifest) {
        int result = TEST_TARGET_SDK_VERSION;
        if (config.sdk().length > 0) {
            result = super.pickSdkVersion(config, appManifest);
        }
        return result;
    }

}
