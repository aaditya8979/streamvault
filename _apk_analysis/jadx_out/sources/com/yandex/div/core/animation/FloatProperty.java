package com.yandex.div.core.animation;

import android.util.Property;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FloatProperty.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class FloatProperty<T> extends Property<T, Float> {
    public FloatProperty(@NotNull String str) {
        super(Float.TYPE, str);
    }

    public void set(T t10, float f10) {
        setValue(t10, f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(Object obj, Float f10) {
        set(obj, f10.floatValue());
    }

    public abstract void setValue(T t10, float f10);
}
