package com.yandex.div.internal.util;

import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import tn.y;

/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CollectionsKt {
    public static final boolean allIsNullOrEmpty(@NotNull List<?>... listArr) {
        int length = listArr.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= length) {
                return true;
            }
            List<?> list = listArr[i10];
            if (list != null && !list.isEmpty()) {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            i10++;
        }
    }

    @NotNull
    public static final <K, V> Map<K, V> arrayMap() {
        return new ArrayMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> List<T> immutableCopy(@NotNull List<? extends T> list) {
        return y.l(list) ? Collections.unmodifiableList(new ArrayList(list)) : list;
    }
}
