package io.appmetrica.analytics.impl;

import android.util.Base64;

/* JADX INFO: loaded from: classes7.dex */
public final class M9 implements H8 {
    @Override // io.appmetrica.analytics.impl.H8
    public final A8 a(Q5 q52) {
        throw new UnsupportedOperationException();
    }

    public final J8 a() {
        return J8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
    }

    @Override // io.appmetrica.analytics.impl.H8
    public final byte[] a(byte[] bArr) {
        try {
            return Base64.decode(bArr, 0);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }
}
