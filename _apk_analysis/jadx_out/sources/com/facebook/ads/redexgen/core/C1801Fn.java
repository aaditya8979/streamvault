package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1801Fn {
    public final Handler A00;
    public final InterfaceC1802Fo A01;

    public C1801Fn(Handler handler, InterfaceC1802Fo interfaceC1802Fo) {
        this.A00 = interfaceC1802Fo != null ? (Handler) C3M.A01(handler) : null;
        this.A01 = interfaceC1802Fo;
    }

    public final void A00(final int i10, final long j10) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fj
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A02(i10, j10);
                }
            });
        }
    }

    public final void A01(final int i10, final long j10) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fa
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A03(i10, j10);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i10, long j10) {
        ((InterfaceC1802Fo) AbstractC15184a.A0f(this.A01)).ACr(i10, j10);
    }

    public final /* synthetic */ void A03(int i10, long j10) {
        ((InterfaceC1802Fo) AbstractC15184a.A0f(this.A01)).AD7(i10, j10);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A04(int i10, C3206or c3206or) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC1800Fm(this, i10, c3206or));
        }
    }

    public final void A05(final C3206or c3206or, final C15535j c15535j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fg
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A06(c3206or, c15535j);
                }
            });
        }
    }

    public final /* synthetic */ void A06(C3206or c3206or, C15535j c15535j) {
        ((InterfaceC1802Fo) AbstractC15184a.A0f(this.A01)).AFk(c3206or);
        ((InterfaceC1802Fo) AbstractC15184a.A0f(this.A01)).AFl(c3206or, c15535j);
    }

    public final void A07(final C3159o4 c3159o4) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fi
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A08(c3159o4);
                }
            });
        }
    }

    public final /* synthetic */ void A08(C3159o4 c3159o4) {
        ((InterfaceC1802Fo) AbstractC15184a.A0f(this.A01)).AFr(c3159o4);
    }

    public final void A09(final C15505g c15505g) {
        c15505g.A02();
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fk
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0B(c15505g);
                }
            });
        }
    }

    public final void A0A(final C15505g c15505g) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fe
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0C(c15505g);
                }
            });
        }
    }

    public final /* synthetic */ void A0B(C15505g c15505g) {
        c15505g.A02();
        ((InterfaceC1802Fo) AbstractC15184a.A0f(this.A01)).AFe(c15505g);
    }

    public final /* synthetic */ void A0C(C15505g c15505g) {
        ((InterfaceC1802Fo) AbstractC15184a.A0f(this.A01)).AFf(c15505g);
    }

    public final void A0D(final Object obj) {
        if (this.A00 != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Ff
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0E(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(Object obj, long j10) {
        ((InterfaceC1802Fo) AbstractC15184a.A0f(this.A01)).AEx(obj, j10);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A0F(final String str) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fh
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0G(final String str, final long j10, final long j11) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fd
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0H(str, j10, j11);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(String str, long j10, long j11) {
        ((InterfaceC1802Fo) AbstractC15184a.A0f(this.A01)).AFd(str, j10, j11);
    }
}
