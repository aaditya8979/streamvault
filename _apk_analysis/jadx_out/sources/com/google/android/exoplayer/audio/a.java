package com.google.android.exoplayer.audio;

import a6.k0;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;

/* JADX INFO: compiled from: AudioRendererEventListener.java */
/* JADX INFO: loaded from: classes9.dex */
public interface a {

    /* JADX INFO: renamed from: com.google.android.exoplayer.audio.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AudioRendererEventListener.java */
    public static final class C0283a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Handler f19998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final a f19999b;

        public C0283a(@Nullable Handler handler, @Nullable a aVar) {
            this.f19998a = aVar != null ? (Handler) a6.a.e(handler) : null;
            this.f19999b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(int i10) {
            ((a) k0.i(this.f19999b)).onAudioSessionId(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(int i10, long j10, long j11) {
            ((a) k0.i(this.f19999b)).onAudioSinkUnderrun(i10, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(String str, long j10, long j11) {
            ((a) k0.i(this.f19999b)).onAudioDecoderInitialized(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(i4.d dVar) {
            dVar.a();
            ((a) k0.i(this.f19999b)).r(dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(i4.d dVar) {
            ((a) k0.i(this.f19999b)).i(dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(Format format) {
            ((a) k0.i(this.f19999b)).l(format);
        }

        public void g(final int i10) {
            Handler handler = this.f19998a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g4.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61961b.m(i10);
                    }
                });
            }
        }

        public void h(final int i10, final long j10, final long j11) {
            Handler handler = this.f19998a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g4.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61953b.n(i10, j10, j11);
                    }
                });
            }
        }

        public void i(final String str, final long j10, final long j11) {
            Handler handler = this.f19998a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g4.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61957b.o(str, j10, j11);
                    }
                });
            }
        }

        public void j(final i4.d dVar) {
            dVar.a();
            Handler handler = this.f19998a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g4.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61951b.p(dVar);
                    }
                });
            }
        }

        public void k(final i4.d dVar) {
            Handler handler = this.f19998a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g4.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61947b.q(dVar);
                    }
                });
            }
        }

        public void l(final Format format) {
            Handler handler = this.f19998a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g4.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61949b.r(format);
                    }
                });
            }
        }
    }

    default void i(i4.d dVar) {
    }

    default void l(Format format) {
    }

    default void onAudioDecoderInitialized(String str, long j10, long j11) {
    }

    default void onAudioSessionId(int i10) {
    }

    default void onAudioSinkUnderrun(int i10, long j10, long j11) {
    }

    default void r(i4.d dVar) {
    }
}
