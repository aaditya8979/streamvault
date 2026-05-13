package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4721d3 implements uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I8 f66565a;

    public C4721d3() {
        this(new I8());
    }

    public C4721d3(I8 i82) {
        this.f66565a = i82;
    }

    @Override // io.appmetrica.analytics.impl.uo
    @NonNull
    public final byte[] a(@NonNull O8 o82, @NonNull C4941lh c4941lh) {
        byte[] bArrDecode = new byte[0];
        String str = o82.f65689b;
        if (str != null) {
            try {
                bArrDecode = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        I8 i82 = this.f66565a;
        return ((H8) i82.f65355a.a(o82.f65702o)).a(bArrDecode);
    }
}
