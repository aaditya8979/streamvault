package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.encryption.AESRSAEncrypter;

/* JADX INFO: loaded from: classes4.dex */
public class AESRSARequestBodyEncrypter implements RequestBodyEncrypter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AESRSAEncrypter f68264a;

    public AESRSARequestBodyEncrypter() {
        this(new AESRSAEncrypter());
    }

    public AESRSARequestBodyEncrypter(AESRSAEncrypter aESRSAEncrypter) {
        this.f68264a = aESRSAEncrypter;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter
    @Nullable
    public byte[] encrypt(@Nullable byte[] bArr) {
        return this.f68264a.encrypt(bArr);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter
    @NonNull
    public RequestBodyEncryptionMode getEncryptionMode() {
        return RequestBodyEncryptionMode.AES_RSA;
    }
}
