package com.yandex.div.internal.util;

import java.lang.Number;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class PositiveNumberDelegate<T extends Number> {

    @NotNull
    private final T fallbackValue;

    @NotNull
    private T value;

    public PositiveNumberDelegate(@NotNull T t10, @NotNull T t11) {
        this.value = t10;
        this.fallbackValue = t11;
    }

    public /* synthetic */ PositiveNumberDelegate(Number number, Number number2, int i10, i iVar) {
        this(number, (i10 & 2) != 0 ? 1 : number2);
    }

    @NotNull
    public final T getValue(@Nullable Object obj, @NotNull KProperty<?> kProperty) {
        return this.value;
    }

    public final void setValue(@Nullable Object obj, @NotNull KProperty<?> kProperty, @NotNull T t10) {
        if (t10.doubleValue() <= 0.0d) {
            t10 = this.fallbackValue;
        }
        this.value = t10;
    }
}
