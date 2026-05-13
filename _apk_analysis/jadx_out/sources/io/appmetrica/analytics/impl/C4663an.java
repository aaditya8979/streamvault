package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.an, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4663an implements uo {
    @Override // io.appmetrica.analytics.impl.uo
    @NonNull
    public final byte[] a(@NonNull O8 o82, @NonNull C4941lh c4941lh) {
        return !TextUtils.isEmpty(o82.f65689b) ? StringUtils.getUTF8Bytes(o82.f65689b) : new byte[0];
    }
}
