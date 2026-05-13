package f4;

import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.metadata.Metadata;
import com.google.android.exoplayer.source.TrackGroupArray;
import e4.l0;
import e4.v0;
import e5.b0;
import e5.r;
import i4.d;
import java.io.IOException;
import w5.c;

/* JADX INFO: compiled from: AnalyticsListener.java */
/* JADX INFO: loaded from: classes6.dex */
public interface b {

    /* JADX INFO: compiled from: AnalyticsListener.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f61453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v0 f61454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f61455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final r.a f61456d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f61457e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f61458f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f61459g;

        public a(long j10, v0 v0Var, int i10, @Nullable r.a aVar, long j11, long j12, long j13) {
            this.f61453a = j10;
            this.f61454b = v0Var;
            this.f61455c = i10;
            this.f61456d = aVar;
            this.f61457e = j11;
            this.f61458f = j12;
            this.f61459g = j13;
        }
    }

    default void A(a aVar, int i10, int i11) {
    }

    default void B(a aVar, int i10) {
    }

    default void C(a aVar, boolean z10, int i10) {
    }

    default void D(a aVar, boolean z10) {
    }

    default void E(a aVar, int i10) {
    }

    default void F(a aVar) {
    }

    default void G(a aVar, int i10, String str, long j10) {
    }

    default void H(a aVar) {
    }

    default void I(a aVar, int i10, int i11, int i12, float f10) {
    }

    default void J(a aVar, b0.c cVar) {
    }

    default void K(a aVar, int i10) {
    }

    default void L(a aVar, int i10) {
    }

    default void M(a aVar, b0.c cVar) {
    }

    default void N(a aVar, int i10, d dVar) {
    }

    default void a(a aVar, TrackGroupArray trackGroupArray, c cVar) {
    }

    default void b(a aVar) {
    }

    default void c(a aVar, boolean z10) {
    }

    default void d(a aVar, Exception exc) {
    }

    default void e(a aVar) {
    }

    default void f(a aVar, b0.b bVar, b0.c cVar, IOException iOException, boolean z10) {
    }

    default void g(a aVar, boolean z10) {
    }

    default void h(a aVar, Metadata metadata) {
    }

    default void i(a aVar, @Nullable Surface surface) {
    }

    default void j(a aVar, int i10, long j10, long j11) {
    }

    default void k(a aVar, b0.b bVar, b0.c cVar) {
    }

    default void l(a aVar, int i10) {
    }

    default void m(a aVar) {
    }

    default void n(a aVar) {
    }

    default void o(a aVar, b0.b bVar, b0.c cVar) {
    }

    default void p(a aVar, b0.b bVar, b0.c cVar) {
    }

    default void q(a aVar, int i10, long j10, long j11) {
    }

    default void r(a aVar) {
    }

    default void s(a aVar, int i10, long j10) {
    }

    default void t(a aVar, int i10, Format format) {
    }

    default void u(a aVar, l0 l0Var) {
    }

    default void v(a aVar, int i10, d dVar) {
    }

    default void w(a aVar, ExoPlaybackException exoPlaybackException) {
    }

    default void x(a aVar, float f10) {
    }

    default void y(a aVar) {
    }

    default void z(a aVar) {
    }
}
