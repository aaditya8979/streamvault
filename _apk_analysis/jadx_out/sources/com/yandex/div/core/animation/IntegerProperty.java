package com.yandex.div.core.animation;

import android.util.Property;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntegerProperty.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class IntegerProperty<T> extends Property<T, Integer> {
    public IntegerProperty(@NotNull String str) {
        super(Integer.TYPE, str);
    }

    public void set(T t10, int i10) {
        setValue(t10, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(Object obj, Integer num) {
        set(obj, num.intValue());
    }

    public abstract void setValue(T t10, int i10);
}
