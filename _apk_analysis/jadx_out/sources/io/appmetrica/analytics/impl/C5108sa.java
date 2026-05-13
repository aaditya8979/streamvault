package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5108sa extends C5083ra {
    public C5108sa(int i10, int i11) {
        this(i10, new C5133ta(i11));
    }

    @VisibleForTesting
    public C5108sa(int i10, @NonNull C5133ta c5133ta) {
        super(i10, c5133ta);
    }

    public final int a(@Nullable String str) {
        return StringUtils.getUTF8Bytes(str).length;
    }

    @Override // io.appmetrica.analytics.impl.C5083ra
    public final int b(@Nullable Object obj) {
        return StringUtils.getUTF8Bytes((String) obj).length;
    }
}
