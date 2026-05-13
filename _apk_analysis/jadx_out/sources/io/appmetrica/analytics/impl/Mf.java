package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Mf implements uo, InterfaceC5281z8 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5281z8
    public final int a(@NonNull J8 j82) {
        return 2;
    }

    @Override // io.appmetrica.analytics.impl.uo
    @NonNull
    public final byte[] a(@NonNull O8 o82, @NonNull C4941lh c4941lh) {
        return TextUtils.isEmpty(o82.f65689b) ? new byte[0] : Base64.decode(o82.f65689b, 0);
    }
}
