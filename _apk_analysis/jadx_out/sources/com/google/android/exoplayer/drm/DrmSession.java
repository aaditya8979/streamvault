package com.google.android.exoplayer.drm;

import androidx.annotation.Nullable;
import j4.i;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface DrmSession<T extends i> {

    public static class DrmSessionException extends IOException {
        public DrmSessionException(Throwable th2) {
            super(th2);
        }
    }

    static <T extends i> void a(@Nullable DrmSession<T> drmSession, @Nullable DrmSession<T> drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.acquire();
        }
        if (drmSession != null) {
            drmSession.release();
        }
    }

    void acquire();

    @Nullable
    DrmSessionException getError();

    @Nullable
    T getMediaCrypto();

    int getState();

    default boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Nullable
    Map<String, String> queryKeyStatus();

    void release();
}
