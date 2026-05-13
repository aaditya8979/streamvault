package io.bidmachine.rendering.utils;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class ObjectHolder<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f70964a;

    public ObjectHolder() {
        this(null);
    }

    public ObjectHolder(@Nullable T t10) {
        this.f70964a = t10;
    }

    @Nullable
    public T get() {
        return (T) this.f70964a;
    }

    public void set(@Nullable T t10) {
        this.f70964a = t10;
    }
}
