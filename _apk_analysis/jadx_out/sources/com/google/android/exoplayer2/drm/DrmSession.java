package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.b;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public interface DrmSession {

    public static class DrmSessionException extends IOException {
        public final int errorCode;

        public DrmSessionException(Throwable th2, int i10) {
            super(th2);
            this.errorCode = i10;
        }
    }

    static void b(@Nullable DrmSession drmSession, @Nullable DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.c(null);
        }
        if (drmSession != null) {
            drmSession.a(null);
        }
    }

    void a(@Nullable b.a aVar);

    void c(@Nullable b.a aVar);

    @Nullable
    g6.b getCryptoConfig();

    @Nullable
    DrmSessionException getError();

    UUID getSchemeUuid();

    int getState();

    default boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Nullable
    Map<String, String> queryKeyStatus();

    boolean requiresSecureDecoder(String str);
}
