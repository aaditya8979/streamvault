package com.google.android.exoplayer.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.drm.DrmSession;
import j4.i;

/* JADX INFO: compiled from: DrmSessionManager.java */
/* JADX INFO: loaded from: classes5.dex */
public interface a<T extends i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a<i> f20134a = new C0284a();

    /* JADX INFO: renamed from: com.google.android.exoplayer.drm.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DrmSessionManager.java */
    public class C0284a implements a<i> {
        @Override // com.google.android.exoplayer.drm.a
        public boolean b(DrmInitData drmInitData) {
            return false;
        }

        @Override // com.google.android.exoplayer.drm.a
        public DrmSession<i> c(Looper looper, DrmInitData drmInitData) {
            return new b(new DrmSession.DrmSessionException(new UnsupportedDrmException(1)));
        }

        @Override // com.google.android.exoplayer.drm.a
        @Nullable
        public Class<i> e(DrmInitData drmInitData) {
            return null;
        }
    }

    static <T extends i> a<T> a() {
        return (a<T>) f20134a;
    }

    boolean b(DrmInitData drmInitData);

    DrmSession<T> c(Looper looper, DrmInitData drmInitData);

    @Nullable
    default DrmSession<T> d(Looper looper, int i10) {
        return null;
    }

    @Nullable
    Class<? extends i> e(DrmInitData drmInitData);

    default void prepare() {
    }

    default void release() {
    }
}
