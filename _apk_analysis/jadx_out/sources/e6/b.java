package e6;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.v;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: AnalyticsListener.java */
/* JADX INFO: loaded from: classes8.dex */
public interface b {

    /* JADX INFO: compiled from: AnalyticsListener.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f60622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.c0 f60623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f60624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final i.b f60625d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f60626e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final com.google.android.exoplayer2.c0 f60627f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f60628g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final i.b f60629h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f60630i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f60631j;

        public a(long j10, com.google.android.exoplayer2.c0 c0Var, int i10, @Nullable i.b bVar, long j11, com.google.android.exoplayer2.c0 c0Var2, int i11, @Nullable i.b bVar2, long j12, long j13) {
            this.f60622a = j10;
            this.f60623b = c0Var;
            this.f60624c = i10;
            this.f60625d = bVar;
            this.f60626e = j11;
            this.f60627f = c0Var2;
            this.f60628g = i11;
            this.f60629h = bVar2;
            this.f60630i = j12;
            this.f60631j = j13;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f60622a == aVar.f60622a && this.f60624c == aVar.f60624c && this.f60626e == aVar.f60626e && this.f60628g == aVar.f60628g && this.f60630i == aVar.f60630i && this.f60631j == aVar.f60631j && y7.i.a(this.f60623b, aVar.f60623b) && y7.i.a(this.f60625d, aVar.f60625d) && y7.i.a(this.f60627f, aVar.f60627f) && y7.i.a(this.f60629h, aVar.f60629h);
        }

        public int hashCode() {
            return y7.i.b(Long.valueOf(this.f60622a), this.f60623b, Integer.valueOf(this.f60624c), this.f60625d, Long.valueOf(this.f60626e), this.f60627f, Integer.valueOf(this.f60628g), this.f60629h, Long.valueOf(this.f60630i), Long.valueOf(this.f60631j));
        }
    }

    /* JADX INFO: renamed from: e6.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnalyticsListener.java */
    public static final class C0740b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s7.l f60632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray<a> f60633b;

        public C0740b(s7.l lVar, SparseArray<a> sparseArray) {
            this.f60632a = lVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(lVar.d());
            for (int i10 = 0; i10 < lVar.d(); i10++) {
                int iC = lVar.c(i10);
                sparseArray2.append(iC, (a) s7.a.e(sparseArray.get(iC)));
            }
            this.f60633b = sparseArray2;
        }

        public boolean a(int i10) {
            return this.f60632a.a(i10);
        }

        public int b(int i10) {
            return this.f60632a.c(i10);
        }

        public a c(int i10) {
            return (a) s7.a.e(this.f60633b.get(i10));
        }

        public int d() {
            return this.f60632a.d();
        }
    }

    default void A(a aVar, String str, long j10, long j11) {
    }

    default void B(a aVar, g6.e eVar) {
    }

    default void C(a aVar, int i10, boolean z10) {
    }

    default void D(a aVar, String str) {
    }

    default void E(a aVar, long j10, int i10) {
    }

    default void F(a aVar, boolean z10) {
    }

    default void G(a aVar, com.google.android.exoplayer2.m mVar, @Nullable g6.g gVar) {
    }

    default void H(a aVar, g6.e eVar) {
    }

    default void I(a aVar, com.google.android.exoplayer2.u uVar) {
    }

    default void K(a aVar, boolean z10, int i10) {
    }

    default void L(a aVar, g6.e eVar) {
    }

    @Deprecated
    default void M(a aVar, int i10, g6.e eVar) {
    }

    default void N(a aVar) {
    }

    default void O(a aVar, t7.x xVar) {
    }

    default void Q(a aVar, boolean z10) {
    }

    default void R(a aVar, e7.o oVar) {
    }

    @Deprecated
    default void S(a aVar, com.google.android.exoplayer2.m mVar) {
    }

    default void T(a aVar, int i10, int i11) {
    }

    default void U(a aVar, Exception exc) {
    }

    default void V(a aVar, int i10, long j10, long j11) {
    }

    default void W(a aVar, int i10) {
    }

    default void X(a aVar, e7.n nVar, e7.o oVar) {
    }

    @Deprecated
    default void Y(a aVar, int i10) {
    }

    default void Z(a aVar, com.google.android.exoplayer2.d0 d0Var) {
    }

    default void a(a aVar, @Nullable com.google.android.exoplayer2.p pVar, int i10) {
    }

    @Deprecated
    default void a0(a aVar) {
    }

    default void b(a aVar) {
    }

    default void b0(a aVar, int i10) {
    }

    default void c(a aVar, PlaybackException playbackException) {
    }

    default void c0(a aVar, v.e eVar, v.e eVar2, int i10) {
    }

    default void d(a aVar, int i10) {
    }

    @Deprecated
    default void d0(a aVar, String str, long j10) {
    }

    default void e(a aVar, e7.n nVar, e7.o oVar) {
    }

    default void e0(a aVar) {
    }

    default void f(a aVar, Object obj, long j10) {
    }

    default void f0(a aVar, com.google.android.exoplayer2.i iVar) {
    }

    @Deprecated
    default void g(a aVar, com.google.android.exoplayer2.m mVar) {
    }

    @Deprecated
    default void g0(a aVar) {
    }

    @Deprecated
    default void h0(a aVar) {
    }

    default void i(a aVar, float f10) {
    }

    default void i0(a aVar, com.google.android.exoplayer2.q qVar) {
    }

    default void j(a aVar, com.google.android.exoplayer2.m mVar, @Nullable g6.g gVar) {
    }

    default void j0(a aVar, @Nullable PlaybackException playbackException) {
    }

    @Deprecated
    default void k(a aVar, List<g7.b> list) {
    }

    default void k0(a aVar, int i10) {
    }

    default void l(a aVar, Exception exc) {
    }

    default void l0(a aVar, String str, long j10, long j11) {
    }

    default void m(a aVar, boolean z10) {
    }

    default void m0(a aVar) {
    }

    default void n(a aVar, int i10, long j10, long j11) {
    }

    default void n0(a aVar, g6.e eVar) {
    }

    @Deprecated
    default void o(a aVar, int i10, g6.e eVar) {
    }

    @Deprecated
    default void o0(a aVar, int i10, int i11, int i12, float f10) {
    }

    default void p(a aVar) {
    }

    default void p0(a aVar, e7.n nVar, e7.o oVar, IOException iOException, boolean z10) {
    }

    default void q(a aVar, int i10) {
    }

    default void q0(a aVar, e7.n nVar, e7.o oVar) {
    }

    default void r(a aVar, Exception exc) {
    }

    @Deprecated
    default void r0(a aVar, int i10, com.google.android.exoplayer2.m mVar) {
    }

    default void s(a aVar, int i10, long j10) {
    }

    default void s0(a aVar, boolean z10) {
    }

    default void t(a aVar, g7.f fVar) {
    }

    @Deprecated
    default void t0(a aVar, boolean z10) {
    }

    @Deprecated
    default void u0(a aVar, String str, long j10) {
    }

    default void v(a aVar, String str) {
    }

    @Deprecated
    default void v0(a aVar, boolean z10, int i10) {
    }

    default void w(com.google.android.exoplayer2.v vVar, C0740b c0740b) {
    }

    default void w0(a aVar, q7.y yVar) {
    }

    default void x(a aVar, long j10) {
    }

    default void x0(a aVar, v.b bVar) {
    }

    default void y(a aVar, Metadata metadata) {
    }

    default void y0(a aVar, Exception exc) {
    }

    @Deprecated
    default void z(a aVar, int i10, String str, long j10) {
    }
}
