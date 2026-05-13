package e5;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import e5.r;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: MediaSourceEventListener.java */
/* JADX INFO: loaded from: classes12.dex */
public interface b0 {

    /* JADX INFO: compiled from: MediaSourceEventListener.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f60347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final r.a f60348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0739a> f60349c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f60350d;

        /* JADX INFO: renamed from: e5.b0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MediaSourceEventListener.java */
        public static final class C0739a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Handler f60351a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b0 f60352b;

            public C0739a(Handler handler, b0 b0Var) {
                this.f60351a = handler;
                this.f60352b = b0Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public a(CopyOnWriteArrayList<C0739a> copyOnWriteArrayList, int i10, @Nullable r.a aVar, long j10) {
            this.f60349c = copyOnWriteArrayList;
            this.f60347a = i10;
            this.f60348b = aVar;
            this.f60350d = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(b0 b0Var, c cVar) {
            b0Var.f(this.f60347a, this.f60348b, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(b0 b0Var, b bVar, c cVar) {
            b0Var.o(this.f60347a, this.f60348b, bVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(b0 b0Var, b bVar, c cVar) {
            b0Var.c(this.f60347a, this.f60348b, bVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(b0 b0Var, b bVar, c cVar, IOException iOException, boolean z10) {
            b0Var.n(this.f60347a, this.f60348b, bVar, cVar, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(b0 b0Var, b bVar, c cVar) {
            b0Var.v(this.f60347a, this.f60348b, bVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(b0 b0Var, r.a aVar) {
            b0Var.q(this.f60347a, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(b0 b0Var, r.a aVar) {
            b0Var.u(this.f60347a, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(b0 b0Var, r.a aVar) {
            b0Var.d(this.f60347a, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(b0 b0Var, r.a aVar, c cVar) {
            b0Var.g(this.f60347a, aVar, cVar);
        }

        public void A(y5.h hVar, Uri uri, Map<String, List<String>> map, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11, long j12, long j13, long j14) {
            z(new b(hVar, uri, map, j12, j13, j14), new c(i10, i11, format, i12, obj, k(j10), k(j11)));
        }

        public void B(y5.h hVar, Uri uri, Map<String, List<String>> map, int i10, long j10, long j11, long j12) {
            A(hVar, uri, map, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12);
        }

        public void C(final b bVar, final c cVar, final IOException iOException, final boolean z10) {
            for (C0739a c0739a : this.f60349c) {
                final b0 b0Var = c0739a.f60352b;
                K(c0739a.f60351a, new Runnable() { // from class: e5.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60605b.q(b0Var, bVar, cVar, iOException, z10);
                    }
                });
            }
        }

        public void D(y5.h hVar, Uri uri, Map<String, List<String>> map, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11, long j12, long j13, long j14, IOException iOException, boolean z10) {
            C(new b(hVar, uri, map, j12, j13, j14), new c(i10, i11, format, i12, obj, k(j10), k(j11)), iOException, z10);
        }

        public void E(y5.h hVar, Uri uri, Map<String, List<String>> map, int i10, long j10, long j11, long j12, IOException iOException, boolean z10) {
            D(hVar, uri, map, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, iOException, z10);
        }

        public void F(final b bVar, final c cVar) {
            for (C0739a c0739a : this.f60349c) {
                final b0 b0Var = c0739a.f60352b;
                K(c0739a.f60351a, new Runnable() { // from class: e5.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60611b.r(b0Var, bVar, cVar);
                    }
                });
            }
        }

        public void G(y5.h hVar, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11, long j12) {
            F(new b(hVar, hVar.f87270a, Collections.emptyMap(), j12, 0L, 0L), new c(i10, i11, format, i12, obj, k(j10), k(j11)));
        }

        public void H(y5.h hVar, int i10, long j10) {
            G(hVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10);
        }

        public void I() {
            final r.a aVar = (r.a) a6.a.e(this.f60348b);
            for (C0739a c0739a : this.f60349c) {
                final b0 b0Var = c0739a.f60352b;
                K(c0739a.f60351a, new Runnable() { // from class: e5.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60591b.s(b0Var, aVar);
                    }
                });
            }
        }

        public void J() {
            final r.a aVar = (r.a) a6.a.e(this.f60348b);
            for (C0739a c0739a : this.f60349c) {
                final b0 b0Var = c0739a.f60352b;
                K(c0739a.f60351a, new Runnable() { // from class: e5.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60602b.t(b0Var, aVar);
                    }
                });
            }
        }

        public final void K(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }

        public void L() {
            final r.a aVar = (r.a) a6.a.e(this.f60348b);
            for (C0739a c0739a : this.f60349c) {
                final b0 b0Var = c0739a.f60352b;
                K(c0739a.f60351a, new Runnable() { // from class: e5.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60588b.u(b0Var, aVar);
                    }
                });
            }
        }

        public void M(b0 b0Var) {
            for (C0739a c0739a : this.f60349c) {
                if (c0739a.f60352b == b0Var) {
                    this.f60349c.remove(c0739a);
                }
            }
        }

        public void N(int i10, long j10, long j11) {
            O(new c(1, i10, null, 3, null, k(j10), k(j11)));
        }

        public void O(final c cVar) {
            final r.a aVar = (r.a) a6.a.e(this.f60348b);
            for (C0739a c0739a : this.f60349c) {
                final b0 b0Var = c0739a.f60352b;
                K(c0739a.f60351a, new Runnable() { // from class: e5.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60598b.v(b0Var, aVar, cVar);
                    }
                });
            }
        }

        @CheckResult
        public a P(int i10, @Nullable r.a aVar, long j10) {
            return new a(this.f60349c, i10, aVar, j10);
        }

        public void j(Handler handler, b0 b0Var) {
            a6.a.a((handler == null || b0Var == null) ? false : true);
            this.f60349c.add(new C0739a(handler, b0Var));
        }

        public final long k(long j10) {
            long jB = e4.k.b(j10);
            if (jB == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f60350d + jB;
        }

        public void l(int i10, @Nullable Format format, int i11, @Nullable Object obj, long j10) {
            m(new c(1, i10, format, i11, obj, k(j10), -9223372036854775807L));
        }

        public void m(final c cVar) {
            for (C0739a c0739a : this.f60349c) {
                final b0 b0Var = c0739a.f60352b;
                K(c0739a.f60351a, new Runnable() { // from class: e5.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60339b.n(b0Var, cVar);
                    }
                });
            }
        }

        public void w(final b bVar, final c cVar) {
            for (C0739a c0739a : this.f60349c) {
                final b0 b0Var = c0739a.f60352b;
                K(c0739a.f60351a, new Runnable() { // from class: e5.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60584b.o(b0Var, bVar, cVar);
                    }
                });
            }
        }

        public void x(y5.h hVar, Uri uri, Map<String, List<String>> map, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11, long j12, long j13, long j14) {
            w(new b(hVar, uri, map, j12, j13, j14), new c(i10, i11, format, i12, obj, k(j10), k(j11)));
        }

        public void y(y5.h hVar, Uri uri, Map<String, List<String>> map, int i10, long j10, long j11, long j12) {
            x(hVar, uri, map, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12);
        }

        public void z(final b bVar, final c cVar) {
            for (C0739a c0739a : this.f60349c) {
                final b0 b0Var = c0739a.f60352b;
                K(c0739a.f60351a, new Runnable() { // from class: e5.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60594b.p(b0Var, bVar, cVar);
                    }
                });
            }
        }
    }

    /* JADX INFO: compiled from: MediaSourceEventListener.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y5.h f60353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f60354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<String, List<String>> f60355c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f60356d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f60357e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f60358f;

        public b(y5.h hVar, Uri uri, Map<String, List<String>> map, long j10, long j11, long j12) {
            this.f60353a = hVar;
            this.f60354b = uri;
            this.f60355c = map;
            this.f60356d = j10;
            this.f60357e = j11;
            this.f60358f = j12;
        }
    }

    /* JADX INFO: compiled from: MediaSourceEventListener.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f60359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f60360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Format f60361c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f60362d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Object f60363e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f60364f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f60365g;

        public c(int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11) {
            this.f60359a = i10;
            this.f60360b = i11;
            this.f60361c = format;
            this.f60362d = i12;
            this.f60363e = obj;
            this.f60364f = j10;
            this.f60365g = j11;
        }
    }

    default void c(int i10, @Nullable r.a aVar, b bVar, c cVar) {
    }

    default void d(int i10, r.a aVar) {
    }

    default void f(int i10, @Nullable r.a aVar, c cVar) {
    }

    default void g(int i10, r.a aVar, c cVar) {
    }

    default void n(int i10, @Nullable r.a aVar, b bVar, c cVar, IOException iOException, boolean z10) {
    }

    default void o(int i10, @Nullable r.a aVar, b bVar, c cVar) {
    }

    default void q(int i10, r.a aVar) {
    }

    default void u(int i10, r.a aVar) {
    }

    default void v(int i10, @Nullable r.a aVar, b bVar, c cVar) {
    }
}
