package com.google.android.exoplayer2.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.m;
import e6.s1;

/* JADX INFO: compiled from: DrmSessionManager.java */
/* JADX INFO: loaded from: classes8.dex */
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f21528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final c f21529b;

    /* JADX INFO: compiled from: DrmSessionManager.java */
    public class a implements c {
        @Override // com.google.android.exoplayer2.drm.c
        public void a(Looper looper, s1 s1Var) {
        }

        @Override // com.google.android.exoplayer2.drm.c
        @Nullable
        public DrmSession b(@Nullable b.a aVar, m mVar) {
            if (mVar.f21754p == null) {
                return null;
            }
            return new f(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), 6001));
        }

        @Override // com.google.android.exoplayer2.drm.c
        public int d(m mVar) {
            return mVar.f21754p != null ? 1 : 0;
        }
    }

    /* JADX INFO: compiled from: DrmSessionManager.java */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f21530a = new b() { // from class: h6.p
            @Override // com.google.android.exoplayer2.drm.c.b
            public final void release() {
                c.b.lambda$static$0();
            }
        };

        static /* synthetic */ void lambda$static$0() {
        }

        void release();
    }

    static {
        a aVar = new a();
        f21528a = aVar;
        f21529b = aVar;
    }

    void a(Looper looper, s1 s1Var);

    @Nullable
    DrmSession b(@Nullable b.a aVar, m mVar);

    default b c(@Nullable b.a aVar, m mVar) {
        return b.f21530a;
    }

    int d(m mVar);

    default void prepare() {
    }

    default void release() {
    }
}
