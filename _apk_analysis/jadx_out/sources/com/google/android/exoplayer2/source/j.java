package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.i;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import s7.m0;

/* JADX INFO: compiled from: MediaSourceEventListener.java */
/* JADX INFO: loaded from: classes9.dex */
public interface j {

    /* JADX INFO: compiled from: MediaSourceEventListener.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final i.b f22316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0303a> f22317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f22318d;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.source.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MediaSourceEventListener.java */
        public static final class C0303a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f22319a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public j f22320b;

            public C0303a(Handler handler, j jVar) {
                this.f22319a = handler;
                this.f22320b = jVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public a(CopyOnWriteArrayList<C0303a> copyOnWriteArrayList, int i10, @Nullable i.b bVar, long j10) {
            this.f22317c = copyOnWriteArrayList;
            this.f22315a = i10;
            this.f22316b = bVar;
            this.f22318d = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(j jVar, e7.o oVar) {
            jVar.u(this.f22315a, this.f22316b, oVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(j jVar, e7.n nVar, e7.o oVar) {
            jVar.r(this.f22315a, this.f22316b, nVar, oVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(j jVar, e7.n nVar, e7.o oVar) {
            jVar.D(this.f22315a, this.f22316b, nVar, oVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(j jVar, e7.n nVar, e7.o oVar, IOException iOException, boolean z10) {
            jVar.o(this.f22315a, this.f22316b, nVar, oVar, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(j jVar, e7.n nVar, e7.o oVar) {
            jVar.x(this.f22315a, this.f22316b, nVar, oVar);
        }

        public void f(Handler handler, j jVar) {
            s7.a.e(handler);
            s7.a.e(jVar);
            this.f22317c.add(new C0303a(handler, jVar));
        }

        public final long g(long j10) {
            long jQ0 = m0.Q0(j10);
            if (jQ0 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f22318d + jQ0;
        }

        public void h(int i10, @Nullable com.google.android.exoplayer2.m mVar, int i11, @Nullable Object obj, long j10) {
            i(new e7.o(1, i10, mVar, i11, obj, g(j10), -9223372036854775807L));
        }

        public void i(final e7.o oVar) {
            for (C0303a c0303a : this.f22317c) {
                final j jVar = c0303a.f22320b;
                m0.C0(c0303a.f22319a, new Runnable() { // from class: e7.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60908b.j(jVar, oVar);
                    }
                });
            }
        }

        public void o(e7.n nVar, int i10, int i11, @Nullable com.google.android.exoplayer2.m mVar, int i12, @Nullable Object obj, long j10, long j11) {
            p(nVar, new e7.o(i10, i11, mVar, i12, obj, g(j10), g(j11)));
        }

        public void p(final e7.n nVar, final e7.o oVar) {
            for (C0303a c0303a : this.f22317c) {
                final j jVar = c0303a.f22320b;
                m0.C0(c0303a.f22319a, new Runnable() { // from class: e7.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60921b.k(jVar, nVar, oVar);
                    }
                });
            }
        }

        public void q(e7.n nVar, int i10, int i11, @Nullable com.google.android.exoplayer2.m mVar, int i12, @Nullable Object obj, long j10, long j11) {
            r(nVar, new e7.o(i10, i11, mVar, i12, obj, g(j10), g(j11)));
        }

        public void r(final e7.n nVar, final e7.o oVar) {
            for (C0303a c0303a : this.f22317c) {
                final j jVar = c0303a.f22320b;
                m0.C0(c0303a.f22319a, new Runnable() { // from class: e7.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60917b.l(jVar, nVar, oVar);
                    }
                });
            }
        }

        public void s(e7.n nVar, int i10, int i11, @Nullable com.google.android.exoplayer2.m mVar, int i12, @Nullable Object obj, long j10, long j11, IOException iOException, boolean z10) {
            t(nVar, new e7.o(i10, i11, mVar, i12, obj, g(j10), g(j11)), iOException, z10);
        }

        public void t(final e7.n nVar, final e7.o oVar, final IOException iOException, final boolean z10) {
            for (C0303a c0303a : this.f22317c) {
                final j jVar = c0303a.f22320b;
                m0.C0(c0303a.f22319a, new Runnable() { // from class: e7.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60911b.m(jVar, nVar, oVar, iOException, z10);
                    }
                });
            }
        }

        public void u(e7.n nVar, int i10, int i11, @Nullable com.google.android.exoplayer2.m mVar, int i12, @Nullable Object obj, long j10, long j11) {
            v(nVar, new e7.o(i10, i11, mVar, i12, obj, g(j10), g(j11)));
        }

        public void v(final e7.n nVar, final e7.o oVar) {
            for (C0303a c0303a : this.f22317c) {
                final j jVar = c0303a.f22320b;
                m0.C0(c0303a.f22319a, new Runnable() { // from class: e7.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60904b.n(jVar, nVar, oVar);
                    }
                });
            }
        }

        public void w(j jVar) {
            for (C0303a c0303a : this.f22317c) {
                if (c0303a.f22320b == jVar) {
                    this.f22317c.remove(c0303a);
                }
            }
        }

        @CheckResult
        public a x(int i10, @Nullable i.b bVar, long j10) {
            return new a(this.f22317c, i10, bVar, j10);
        }
    }

    default void D(int i10, @Nullable i.b bVar, e7.n nVar, e7.o oVar) {
    }

    default void o(int i10, @Nullable i.b bVar, e7.n nVar, e7.o oVar, IOException iOException, boolean z10) {
    }

    default void r(int i10, @Nullable i.b bVar, e7.n nVar, e7.o oVar) {
    }

    default void u(int i10, @Nullable i.b bVar, e7.o oVar) {
    }

    default void x(int i10, @Nullable i.b bVar, e7.n nVar, e7.o oVar) {
    }
}
