package b6;

import a6.k0;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;

/* JADX INFO: compiled from: VideoRendererEventListener.java */
/* JADX INFO: loaded from: classes6.dex */
public interface q {

    /* JADX INFO: compiled from: VideoRendererEventListener.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Handler f5491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final q f5492b;

        public a(@Nullable Handler handler, @Nullable q qVar) {
            this.f5491a = qVar != null ? (Handler) a6.a.e(handler) : null;
            this.f5492b = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(String str, long j10, long j11) {
            ((q) k0.i(this.f5492b)).onVideoDecoderInitialized(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(i4.d dVar) {
            dVar.a();
            ((q) k0.i(this.f5492b)).p(dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(int i10, long j10) {
            ((q) k0.i(this.f5492b)).onDroppedFrames(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(i4.d dVar) {
            ((q) k0.i(this.f5492b)).s(dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(Format format) {
            ((q) k0.i(this.f5492b)).t(format);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(Surface surface) {
            ((q) k0.i(this.f5492b)).onRenderedFirstFrame(surface);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(int i10, int i11, int i12, float f10) {
            ((q) k0.i(this.f5492b)).onVideoSizeChanged(i10, i11, i12, f10);
        }

        public void h(final String str, final long j10, final long j11) {
            Handler handler = this.f5491a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b6.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5471b.m(str, j10, j11);
                    }
                });
            }
        }

        public void i(final i4.d dVar) {
            dVar.a();
            Handler handler = this.f5491a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b6.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5489b.n(dVar);
                    }
                });
            }
        }

        public void j(final int i10, final long j10) {
            Handler handler = this.f5491a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b6.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5475b.o(i10, j10);
                    }
                });
            }
        }

        public void k(final i4.d dVar) {
            Handler handler = this.f5491a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b6.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5480b.p(dVar);
                    }
                });
            }
        }

        public void l(final Format format) {
            Handler handler = this.f5491a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b6.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5487b.q(format);
                    }
                });
            }
        }

        public void t(@Nullable final Surface surface) {
            Handler handler = this.f5491a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b6.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5478b.r(surface);
                    }
                });
            }
        }

        public void u(final int i10, final int i11, final int i12, final float f10) {
            Handler handler = this.f5491a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b6.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5482b.s(i10, i11, i12, f10);
                    }
                });
            }
        }
    }

    default void onDroppedFrames(int i10, long j10) {
    }

    default void onRenderedFirstFrame(@Nullable Surface surface) {
    }

    default void onVideoDecoderInitialized(String str, long j10, long j11) {
    }

    default void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }

    default void p(i4.d dVar) {
    }

    default void s(i4.d dVar) {
    }

    default void t(Format format) {
    }
}
