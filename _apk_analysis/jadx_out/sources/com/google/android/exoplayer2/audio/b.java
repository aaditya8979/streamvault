package com.google.android.exoplayer2.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.m;
import s7.m0;

/* JADX INFO: compiled from: AudioRendererEventListener.java */
/* JADX INFO: loaded from: classes6.dex */
public interface b {

    /* JADX INFO: compiled from: AudioRendererEventListener.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Handler f21279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final b f21280b;

        public a(@Nullable Handler handler, @Nullable b bVar) {
            this.f21279a = bVar != null ? (Handler) s7.a.e(handler) : null;
            this.f21280b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void A(int i10, long j10, long j11) {
            ((b) m0.j(this.f21280b)).onAudioUnderrun(i10, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(Exception exc) {
            ((b) m0.j(this.f21280b)).onAudioCodecError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(Exception exc) {
            ((b) m0.j(this.f21280b)).onAudioSinkError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(String str, long j10, long j11) {
            ((b) m0.j(this.f21280b)).onAudioDecoderInitialized(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(String str) {
            ((b) m0.j(this.f21280b)).onAudioDecoderReleased(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(g6.e eVar) {
            eVar.c();
            ((b) m0.j(this.f21280b)).h(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(g6.e eVar) {
            ((b) m0.j(this.f21280b)).i(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(m mVar, g6.g gVar) {
            ((b) m0.j(this.f21280b)).m(mVar);
            ((b) m0.j(this.f21280b)).d(mVar, gVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(long j10) {
            ((b) m0.j(this.f21280b)).onAudioPositionAdvancing(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(boolean z10) {
            ((b) m0.j(this.f21280b)).onSkipSilenceEnabledChanged(z10);
        }

        public void B(final long j10) {
            Handler handler = this.f21279a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f6.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61504b.y(j10);
                    }
                });
            }
        }

        public void C(final boolean z10) {
            Handler handler = this.f21279a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f6.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61518b.z(z10);
                    }
                });
            }
        }

        public void D(final int i10, final long j10, final long j11) {
            Handler handler = this.f21279a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f6.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61520b.A(i10, j10, j11);
                    }
                });
            }
        }

        public void k(final Exception exc) {
            Handler handler = this.f21279a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f6.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61512b.r(exc);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Handler handler = this.f21279a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f6.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61510b.s(exc);
                    }
                });
            }
        }

        public void m(final String str, final long j10, final long j11) {
            Handler handler = this.f21279a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f6.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61514b.t(str, j10, j11);
                    }
                });
            }
        }

        public void n(final String str) {
            Handler handler = this.f21279a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f6.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61499b.u(str);
                    }
                });
            }
        }

        public void o(final g6.e eVar) {
            eVar.c();
            Handler handler = this.f21279a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f6.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61506b.v(eVar);
                    }
                });
            }
        }

        public void p(final g6.e eVar) {
            Handler handler = this.f21279a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f6.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61508b.w(eVar);
                    }
                });
            }
        }

        public void q(final m mVar, @Nullable final g6.g gVar) {
            Handler handler = this.f21279a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f6.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61501b.x(mVar, gVar);
                    }
                });
            }
        }
    }

    default void d(m mVar, @Nullable g6.g gVar) {
    }

    default void h(g6.e eVar) {
    }

    default void i(g6.e eVar) {
    }

    @Deprecated
    default void m(m mVar) {
    }

    default void onAudioCodecError(Exception exc) {
    }

    default void onAudioDecoderInitialized(String str, long j10, long j11) {
    }

    default void onAudioDecoderReleased(String str) {
    }

    default void onAudioPositionAdvancing(long j10) {
    }

    default void onAudioSinkError(Exception exc) {
    }

    default void onAudioUnderrun(int i10, long j10, long j11) {
    }

    default void onSkipSilenceEnabledChanged(boolean z10) {
    }
}
