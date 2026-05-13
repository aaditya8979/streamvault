package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* JADX INFO: loaded from: classes.dex */
public final class Qn implements uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I8 f65827a;

    public Qn() {
        this(new I8());
    }

    public Qn(I8 i82) {
        this.f65827a = i82;
    }

    @NonNull
    @VisibleForTesting
    public final I8 a() {
        return this.f65827a;
    }

    @Override // io.appmetrica.analytics.impl.uo
    @NonNull
    public final byte[] a(@NonNull O8 o82, @NonNull C4941lh c4941lh) {
        byte[] bArrDecompressBase64GzipAsBytes = new byte[0];
        try {
            bArrDecompressBase64GzipAsBytes = Base64Utils.decompressBase64GzipAsBytes(o82.f65689b);
        } catch (Throwable unused) {
        }
        byte[] bArrA = ((H8) this.f65827a.f65355a.a(o82.f65702o)).a(bArrDecompressBase64GzipAsBytes);
        return bArrA == null ? new byte[0] : bArrA;
    }
}
