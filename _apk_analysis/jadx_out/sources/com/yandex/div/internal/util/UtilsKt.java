package com.yandex.div.internal.util;

import java.util.Map;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wn.d;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class UtilsKt {
    public static final <K, V> V getOrThrow(@NotNull Map<? extends K, ? extends V> map, K k10, @Nullable String str) {
        V v10 = map.get(k10);
        if (v10 != null) {
            return v10;
        }
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ Object getOrThrow$default(Map map, Object obj, String str, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return getOrThrow(map, obj, str);
    }

    @NotNull
    public static final <T> d<Object, T> weak(@Nullable T t10) {
        return new WeakRef(t10);
    }
}
