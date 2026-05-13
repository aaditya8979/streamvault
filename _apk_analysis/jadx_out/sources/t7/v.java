package t7;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import s7.m0;

/* JADX INFO: compiled from: VideoRendererEventListener.java */
/* JADX INFO: loaded from: classes7.dex */
public interface v {

    /* JADX INFO: compiled from: VideoRendererEventListener.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Handler f85192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final v f85193b;

        public a(@Nullable Handler handler, @Nullable v vVar) {
            this.f85192a = vVar != null ? (Handler) s7.a.e(handler) : null;
            this.f85193b = vVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(String str, long j10, long j11) {
            ((v) m0.j(this.f85193b)).onVideoDecoderInitialized(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(String str) {
            ((v) m0.j(this.f85193b)).onVideoDecoderReleased(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(g6.e eVar) {
            eVar.c();
            ((v) m0.j(this.f85193b)).b(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(int i10, long j10) {
            ((v) m0.j(this.f85193b)).onDroppedFrames(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(g6.e eVar) {
            ((v) m0.j(this.f85193b)).j(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(com.google.android.exoplayer2.m mVar, g6.g gVar) {
            ((v) m0.j(this.f85193b)).k(mVar);
            ((v) m0.j(this.f85193b)).a(mVar, gVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(Object obj, long j10) {
            ((v) m0.j(this.f85193b)).onRenderedFirstFrame(obj, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(long j10, int i10) {
            ((v) m0.j(this.f85193b)).onVideoFrameProcessingOffset(j10, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(Exception exc) {
            ((v) m0.j(this.f85193b)).onVideoCodecError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(x xVar) {
            ((v) m0.j(this.f85193b)).c(xVar);
        }

        public void A(final Object obj) {
            if (this.f85192a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f85192a.post(new Runnable() { // from class: t7.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f85182b.w(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void B(final long j10, final int i10) {
            Handler handler = this.f85192a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t7.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f85174b.x(j10, i10);
                    }
                });
            }
        }

        public void C(final Exception exc) {
            Handler handler = this.f85192a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t7.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f85180b.y(exc);
                    }
                });
            }
        }

        public void D(final x xVar) {
            Handler handler = this.f85192a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t7.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f85172b.z(xVar);
                    }
                });
            }
        }

        public void k(final String str, final long j10, final long j11) {
            Handler handler = this.f85192a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t7.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f85188b.q(str, j10, j11);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f85192a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t7.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f85170b.r(str);
                    }
                });
            }
        }

        public void m(final g6.e eVar) {
            eVar.c();
            Handler handler = this.f85192a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t7.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f85166b.s(eVar);
                    }
                });
            }
        }

        public void n(final int i10, final long j10) {
            Handler handler = this.f85192a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t7.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f85185b.t(i10, j10);
                    }
                });
            }
        }

        public void o(final g6.e eVar) {
            Handler handler = this.f85192a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t7.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f85168b.u(eVar);
                    }
                });
            }
        }

        public void p(final com.google.android.exoplayer2.m mVar, @Nullable final g6.g gVar) {
            Handler handler = this.f85192a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t7.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f85177b.v(mVar, gVar);
                    }
                });
            }
        }
    }

    default void a(com.google.android.exoplayer2.m mVar, @Nullable g6.g gVar) {
    }

    default void b(g6.e eVar) {
    }

    default void c(x xVar) {
    }

    default void j(g6.e eVar) {
    }

    @Deprecated
    default void k(com.google.android.exoplayer2.m mVar) {
    }

    default void onDroppedFrames(int i10, long j10) {
    }

    default void onRenderedFirstFrame(Object obj, long j10) {
    }

    default void onVideoCodecError(Exception exc) {
    }

    default void onVideoDecoderInitialized(String str, long j10, long j11) {
    }

    default void onVideoDecoderReleased(String str) {
    }

    default void onVideoFrameProcessingOffset(long j10, int i10) {
    }
}
