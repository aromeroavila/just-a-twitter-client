package arao.jatc;

import android.app.Application;

import org.robolectric.annotation.Config;

import java.lang.annotation.Annotation;

public class ForwardingConfig implements Config {

    private final Config delegate;

    public ForwardingConfig(Config delegate) {
        this.delegate = delegate;
    }

    @Override
    public int[] sdk() {
        return delegate.sdk();
    }

    @Override
    public String manifest() {
        return delegate.manifest();
    }

    @Override
    public Class<?> constants() {
        return delegate.constants();
    }

    @Override
    public Class<? extends Application> application() {
        return delegate.application();
    }

    @Override
    public String packageName() {
        return delegate.packageName();
    }

    @Override
    public String qualifiers() {
        return delegate.qualifiers();
    }

    @Override
    public String resourceDir() {
        return delegate.resourceDir();
    }

    @Override
    public String assetDir() {
        return delegate.assetDir();
    }

    @Override
    public Class<?>[] shadows() {
        return delegate.shadows();
    }

    @Override
    public String[] libraries() {
        return delegate.libraries();
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return delegate.annotationType();
    }

    @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
    @Override
    public boolean equals(Object obj) {
        return delegate.equals(obj);
    }

    @Override
    public int hashCode() {
        return delegate.hashCode();
    }

    @Override
    public String toString() {
        return delegate.toString();
    }
}
