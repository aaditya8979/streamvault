package com.yandex.div.internal.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConvertUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ConvertUtilsKt {
    private static final Boolean toBoolean(double d10) {
        if (d10 == 0.0d) {
            return Boolean.FALSE;
        }
        if (d10 == 1.0d) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Nullable
    public static final Boolean toBoolean(int i10) {
        if (i10 == 0) {
            return Boolean.FALSE;
        }
        if (i10 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Nullable
    public static final Boolean toBoolean(@NotNull Number number) {
        return number instanceof Double ? toBoolean(number.doubleValue()) : toBoolean(number.intValue());
    }
}
