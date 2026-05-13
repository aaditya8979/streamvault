package com.google.android.exoplayer.drm;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.drm.DrmSession;
import j4.i;
import java.util.Map;

/* JADX INFO: compiled from: ErrorStateDrmSession.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b<T extends i> implements DrmSession<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DrmSession.DrmSessionException f20135a;

    public b(DrmSession.DrmSessionException drmSessionException) {
        this.f20135a = (DrmSession.DrmSessionException) a6.a.e(drmSessionException);
    }

    @Override // com.google.android.exoplayer.drm.DrmSession
    public void acquire() {
    }

    @Override // com.google.android.exoplayer.drm.DrmSession
    @Nullable
    public DrmSession.DrmSessionException getError() {
        return this.f20135a;
    }

    @Override // com.google.android.exoplayer.drm.DrmSession
    @Nullable
    public T getMediaCrypto() {
        return null;
    }

    @Override // com.google.android.exoplayer.drm.DrmSession
    public int getState() {
        return 1;
    }

    @Override // com.google.android.exoplayer.drm.DrmSession
    public boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Override // com.google.android.exoplayer.drm.DrmSession
    @Nullable
    public Map<String, String> queryKeyStatus() {
        return null;
    }

    @Override // com.google.android.exoplayer.drm.DrmSession
    public void release() {
    }
}
