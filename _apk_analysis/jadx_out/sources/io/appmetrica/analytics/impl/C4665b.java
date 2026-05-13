package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4665b implements H8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AESEncrypter f66402a;

    public C4665b() {
        this(new C4639a(C5009oa.k().g()));
    }

    public C4665b(AESEncrypter aESEncrypter) {
        this.f66402a = aESEncrypter;
    }

    public C4665b(C4639a c4639a) {
        this(new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c4639a.b(), c4639a.a()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // io.appmetrica.analytics.impl.H8
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.appmetrica.analytics.impl.A8 a(@androidx.annotation.NonNull io.appmetrica.analytics.impl.Q5 r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.getValue()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1e
            java.lang.String r1 = "UTF-8"
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> L1e
            io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter r1 = r2.f66402a     // Catch: java.lang.Throwable -> L1e
            byte[] r0 = r1.encrypt(r0)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1e
            r1 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r3.setValue(r0)
            io.appmetrica.analytics.impl.A8 r0 = new io.appmetrica.analytics.impl.A8
            io.appmetrica.analytics.impl.J8 r1 = io.appmetrica.analytics.impl.J8.AES_VALUE_ENCRYPTION
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4665b.a(io.appmetrica.analytics.impl.Q5):io.appmetrica.analytics.impl.A8");
    }

    @NonNull
    public final J8 a() {
        return J8.AES_VALUE_ENCRYPTION;
    }

    @Override // io.appmetrica.analytics.impl.H8
    @NonNull
    public final byte[] a(@Nullable byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        try {
            return this.f66402a.decrypt(Base64.decode(bArr, 0));
        } catch (Throwable unused) {
            return bArr2;
        }
    }
}
