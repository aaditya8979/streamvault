package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class D8 implements uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I8 f65147a;

    public D8() {
        this(new I8());
    }

    public D8(I8 i82) {
        this.f65147a = i82;
    }

    @Override // io.appmetrica.analytics.impl.uo
    @NonNull
    public final byte[] a(@NonNull O8 o82, @NonNull C4941lh c4941lh) {
        String str = o82.f65689b;
        return ((H8) this.f65147a.f65355a.a(o82.f65702o)).a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }
}
