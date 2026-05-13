package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.c0;
import e6.s1;
import java.io.IOException;
import r7.y;

/* JADX INFO: compiled from: MediaSource.java */
/* JADX INFO: loaded from: classes9.dex */
public interface i {

    /* JADX INFO: compiled from: MediaSource.java */
    public interface a {
        a a(h6.q qVar);

        a b(com.google.android.exoplayer2.upstream.b bVar);

        i c(com.google.android.exoplayer2.p pVar);
    }

    /* JADX INFO: compiled from: MediaSource.java */
    public static final class b extends e7.p {
        public b(e7.p pVar) {
            super(pVar);
        }

        public b(Object obj) {
            super(obj);
        }

        public b(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10);
        }

        public b(Object obj, long j10) {
            super(obj, j10);
        }

        public b(Object obj, long j10, int i10) {
            super(obj, j10, i10);
        }

        public b c(Object obj) {
            return new b(super.a(obj));
        }
    }

    /* JADX INFO: compiled from: MediaSource.java */
    public interface c {
        void a(i iVar, c0 c0Var);
    }

    h a(b bVar, r7.b bVar2, long j10);

    void b(c cVar);

    void c(j jVar);

    void d(c cVar, @Nullable y yVar, s1 s1Var);

    void e(Handler handler, j jVar);

    void f(h hVar);

    void g(c cVar);

    @Nullable
    default c0 getInitialTimeline() {
        return null;
    }

    com.google.android.exoplayer2.p getMediaItem();

    void h(c cVar);

    void i(Handler handler, com.google.android.exoplayer2.drm.b bVar);

    default boolean isSingleWindow() {
        return true;
    }

    void j(com.google.android.exoplayer2.drm.b bVar);

    void maybeThrowSourceInfoRefreshError() throws IOException;
}
